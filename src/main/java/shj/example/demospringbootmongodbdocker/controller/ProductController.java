package shj.example.demospringbootmongodbdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import shj.example.demospringbootmongodbdocker.api.mapper.ProductMapper;
import shj.example.demospringbootmongodbdocker.api.model.ProductDTO;
import shj.example.demospringbootmongodbdocker.model.Product;
import shj.example.demospringbootmongodbdocker.repository.ProductRepository;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Project demospringbootmongodbdocker
 * @Author Henri Joel SEDJAME
 * @Date 17/09/2018
 * @Class purposes : .......
 */
@RestController
public class ProductController {

  private ProductRepository productRepository;
  private ProductMapper productMapper;

  public ProductController(ProductRepository productRepository, ProductMapper productMapper) {
    this.productRepository = productRepository;
    this.productMapper = productMapper;
  }

  @GetMapping("/products")
  public List<ProductDTO> getAll(){
    return this.productRepository.findAll()
                .stream()
                .map(productMapper::productToProdcutDTO)
                .collect(Collectors.toList());
  }
}
