package edu.mosk.lombardapp.repository.product;

import edu.mosk.lombardapp.model.product.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

/*
  @author   moskb
  @project   LombardAPP
  @version  1.0.0 
  @since 18.08.2022
*/

@Repository
public interface IProductMongoRepository extends MongoRepository<Product, String> {
    List<Product> findAllByCreatedAtAfterAndName(LocalDateTime date, String name);
}
