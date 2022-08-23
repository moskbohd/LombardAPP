package edu.mosk.lombardapp.repository.price;

import edu.mosk.lombardapp.model.price.PriceHistory;
import edu.mosk.lombardapp.model.product.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/*
  @author   moskb
  @project   LombardAPP
  @version  1.0.0 
  @since 18.08.2022
*/

@Repository
public interface IPriceHistoryMongoRepository extends MongoRepository<PriceHistory, String> {
    //double getLastPriceForProduct(Product product);
}
