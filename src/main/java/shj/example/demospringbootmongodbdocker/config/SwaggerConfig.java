package shj.example.demospringbootmongodbdocker.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * @Project demospringbootmongodbdocker
 * @Author Henri Joel SEDJAME
 * @Date 17/09/2018
 * @Class purposes : .......
 */
@EnableSwagger2
@Configuration
public class SwaggerConfig {
  @Bean
 public Docket api(){
    return new Docket(DocumentationType.SWAGGER_2)
      .select()
      .apis(RequestHandlerSelectors.any())
      .paths(PathSelectors.any())
      .build()
      .pathMapping("/")
      .apiInfo(metaData());
  }

  private ApiInfo metaData(){
    Contact contact = new Contact("SEDJAME Henri-Joël", "", "sedhjo@gmail.com");
    return new ApiInfo(
                    "Test Swagger and MapStruct",
                    "Test Swagger and MapStruct",
                    "1.0",
                    "Terms of service...",
                    contact,
                    "apache License Version 2.0",
                    "https://www.apache.org/licenses/LICENSE-2.0",
                    new ArrayList<>()
    );
  }
}
