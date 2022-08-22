package edu.mosk.lombardapp.service.price.impls;
/*
  @author   moskb
  @project   LombardAPP
  @version  1.0.0
  @since 15.08.2022
*/

import edu.mosk.lombardapp.model.price.PriceHistory;
import edu.mosk.lombardapp.model.product.Product;
import edu.mosk.lombardapp.repository.price.IPriceHistoryMongoRepository;
import edu.mosk.lombardapp.service.price.interfaces.IPriceHistoryServiceImpl;
import edu.mosk.lombardapp.service.product.impls.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;

@Service
public class PriceHistoryServiceImpl implements IPriceHistoryServiceImpl {

//    ProductServiceImpl productService = new ProductServiceImpl();
//    private  List<PriceHistory> priceHistories = new ArrayList<>(
//            Arrays.asList(
//                    new PriceHistory("1",  productService.get("1"), "", LocalDateTime.now(),12.2)
//            )
//    );
    @Autowired
    IPriceHistoryMongoRepository repository;

    @Override
    public PriceHistory create(PriceHistory priceHistory) {
        priceHistory.setId(UUID.randomUUID().toString());
        priceHistory.setCreatedAt(LocalDateTime.now());
        return repository.save(priceHistory);
    }

    @Override
    public PriceHistory update(PriceHistory priceHistory) {
        priceHistory.setCreatedAt(LocalDateTime.now());
        return repository.save(priceHistory);
    }

    @Override
    public PriceHistory get(String id) { return repository.findById(id).get();
    }

    public double getLastPriceForProduct(Product product){
        return getAll().stream()
                .filter(priceHistory -> priceHistory.getProduct().equals(product))
                .max(Comparator.comparing(PriceHistory::getCreatedAt))
                .orElse(null)
                .getPrice();
    }

    @Override
    public void delete(String id) {  repository.deleteById(id);
    }

    @Override
    public List<PriceHistory> getAll() { return repository.findAll();
    }
}
