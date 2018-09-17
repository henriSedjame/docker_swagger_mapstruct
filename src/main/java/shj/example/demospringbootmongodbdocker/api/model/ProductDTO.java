package shj.example.demospringbootmongodbdocker.api.model;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Project demospringbootmongodbdocker
 * @Author Henri Joel SEDJAME
 * @Date 17/09/2018
 * @Class purposes : .......
 */
@Data
public class ProductDTO {

  private String name;
  private BigDecimal price;
  private String detail;
}
