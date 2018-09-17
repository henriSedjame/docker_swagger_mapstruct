package shj.example.demospringbootmongodbdocker.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import shj.example.demospringbootmongodbdocker.model.Product;

/**
 * @Project demospringbootmongodbdocker
 * @Author Henri Joel SEDJAME
 * @Date 17/09/2018
 * @Class purposes : .......
 */
@RepositoryRestResource(collectionResourceRel = "products", path = "products")
public interface ProductRepository extends MongoRepository<Product, String> {
}
