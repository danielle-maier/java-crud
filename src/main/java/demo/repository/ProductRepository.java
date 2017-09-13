// package server.repository;
//
// import server.model.Product;
// import org.springframework.data.repository.CrudRepository;
// import org.springframework.data.rest.core.annotation.RepositoryRestResource;
//
// @RepositoryRestResource
// public interface ProductRepository extends CrudRepository<Product, Long> {
//
// }
package server.repository;

import java.util.List;
import server.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "product", path = "product")
public interface ProductRepository extends MongoRepository<Product, String> {

	List<Product> findByProductName(@Param("name") String name);

}
