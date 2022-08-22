package edu.mosk.lombardapp.repository.price;
/*
  @author   moskb
  @project   LombardAPP
  @version  1.0.0 
  @since 15.08.2022
*/

import edu.mosk.lombardapp.model.price.PriceHistory;
import edu.mosk.lombardapp.repository.product.ProductFakeRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Repository
public class PriceHistoryFakeRepository {

    private LocalDateTime now = LocalDateTime.now();
    private ProductFakeRepository product = new ProductFakeRepository();
    private List<PriceHistory> prices = new ArrayList<>(
            Arrays.asList(
                    new PriceHistory("1", product.findById("1"), "", now, 14.21),
                    new PriceHistory("2", product.findById("2"), "", now, 22.12)
            ));

    public List<PriceHistory> findAll(){
        return this.prices;
    }

    public PriceHistory findById(String id) {
        return this.prices.stream().filter(item -> item.getId().equals(id))
                .findFirst().orElse(null);
    }

    public PriceHistory update(PriceHistory priceHistory) {
        this.deleteById(priceHistory.getId());
        priceHistory.setCreatedAt(LocalDateTime.now());
        this.prices.add(priceHistory);
        return  priceHistory;
    }

    public void deleteById(String id) {
        PriceHistory priceHistory = this.findById(id);
        int index =  prices.indexOf(priceHistory);
        this.prices.remove(index);

    }

    public PriceHistory save(PriceHistory priceHistory) {
        priceHistory.setId(UUID.randomUUID().toString());
        priceHistory.setCreatedAt(LocalDateTime.now());
        this.prices.add(priceHistory);
        return priceHistory;
    }

}
