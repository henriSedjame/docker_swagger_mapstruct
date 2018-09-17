package shj.example.demospringbootmongodbdocker.api.mapper;

import org.mapstruct.MapMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;
import shj.example.demospringbootmongodbdocker.api.model.ProductDTO;
import shj.example.demospringbootmongodbdocker.model.Product;

/**
 * @Project demospringbootmongodbdocker
 * @Author Henri Joel SEDJAME
 * @Date 17/09/2018
 * @Class purposes : .......
 */
@Mapper
@Component
public interface ProductMapper {
  ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);


  @Mapping(source = "designation", target = "name")
  @Mapping(source = "description", target = "detail")
  ProductDTO productToProdcutDTO(Product product);

  @Mapping(source = "name", target = "designation")
  @Mapping(source = "detail", target = "description")
  Product productDTOToProduct(ProductDTO productDTO);
}
