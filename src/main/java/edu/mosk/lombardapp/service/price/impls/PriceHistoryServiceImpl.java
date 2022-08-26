package edu.mosk.lombardapp.service.price.impls;
/*
  @author   moskb
  @project   LombardAPP
  @version  1.0.0 
  @since 11.08.2022
*/

import edu.mosk.lombardapp.model.price.PriceHistory;
import edu.mosk.lombardapp.model.product.Product;
import edu.mosk.lombardapp.model.product.ProductCondition;
import edu.mosk.lombardapp.model.product.ProductType;
import edu.mosk.lombardapp.repository.price.IPriceHistoryMongoRepository;
import edu.mosk.lombardapp.service.price.interfaces.IPriceHistoryServiceImpl;
import edu.mosk.lombardapp.service.product.impls.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;


@Service
public class PriceHistoryServiceImpl implements IPriceHistoryServiceImpl {
    Product product = new Product("0", ProductType.JEWELER, ProductCondition.BELONGTOLOMBARD, "ruby", 0.5, "good", LocalDateTime.now());
    private final List<PriceHistory> priceHistories = new ArrayList<>(
            Arrays.asList(
                    new PriceHistory("1", product, "", LocalDateTime.now(), 22),
                    new PriceHistory("2", product, "", LocalDateTime.now(), 50)
            )
    );
    @Autowired
    IPriceHistoryMongoRepository repository;

    @PostConstruct
    void init(){
        repository.saveAll(priceHistories);
    }

    @Override
    public PriceHistory create(PriceHistory priceHistories) {
        priceHistories.setId(UUID.randomUUID().toString());
        priceHistories.setCreatedAt(LocalDateTime.now());
        return repository.save(priceHistories);
    }

    @Override
    public PriceHistory update(PriceHistory priceHistories) {
        priceHistories.setCreatedAt(LocalDateTime.now());
        return repository.save(priceHistories);
    }

    @Override
    public PriceHistory get(String id) { return repository.findById(id).get();
    }

    @Override
    public void delete(String id) { repository.deleteById(id);
    }

    @Override
    public List<PriceHistory> getProductHistoryById(String id) {
        return repository.findAll().stream()
                .filter(priceHistory -> priceHistory.getProduct().getId().equals(id))
                .collect(Collectors.toList());
    }@Override
    public List<PriceHistory> getAll( ) {
        return repository.findAll();
    }

    @Override
    public double getLastPriceForProduct(Product product){
        return getAll().stream()
                .filter(priceHistory -> priceHistory.getProduct().equals(product))
                .max(Comparator.comparing(PriceHistory::getCreatedAt))
                .orElse(null)
                .getPrice();
    }
}
