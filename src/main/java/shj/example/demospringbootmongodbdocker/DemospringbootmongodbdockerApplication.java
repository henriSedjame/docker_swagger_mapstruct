package shj.example.demospringbootmongodbdocker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import shj.example.demospringbootmongodbdocker.model.Product;
import shj.example.demospringbootmongodbdocker.repository.ProductRepository;

import java.math.BigDecimal;
import java.util.UUID;
import java.util.stream.Stream;

@SpringBootApplication
public class DemospringbootmongodbdockerApplication {
  @Autowired
  private ProductRepository productRepository;

  @Bean
  CommandLineRunner runner(){

    productRepository.deleteAll();

    return (a) -> {
      Stream.of(new Product(UUID.randomUUID().toString(),"product 1",new BigDecimal(200), "decription 1"),
                new Product(UUID.randomUUID().toString(), "product 2", new BigDecimal(200), "decription 2"),
                new Product(UUID.randomUUID().toString(), "product 3", new BigDecimal(200), "decription 3"))
          .forEach(productRepository::save);
    } ;
  }
  public static void main(String[] args) {
    SpringApplication.run(DemospringbootmongodbdockerApplication.class, args);
  }
}
