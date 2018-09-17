package shj.example.demospringbootmongodbdocker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

/**
 * @Project demospringbootmongodbdocker
 * @Author Henri Joel SEDJAME
 * @Date 17/09/2018
 * @Class purposes : .......
 */

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
  private @Id String id;
  private String designation;
  private BigDecimal price;
  private String description;

}
