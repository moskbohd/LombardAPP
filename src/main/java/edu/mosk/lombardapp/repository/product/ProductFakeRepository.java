package edu.mosk.lombardapp.repository.product;
/*
  @author   moskb
  @project   LombardAPP
  @version  1.0.0 
  @since 11.08.2022
*/

import edu.mosk.lombardapp.model.product.Product;
import edu.mosk.lombardapp.model.product.ProductCondition;
import edu.mosk.lombardapp.model.product.ProductType;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Repository
public class ProductFakeRepository {

    private LocalDateTime now = LocalDateTime.now();
    private List<Product> products = new ArrayList<>(
            Arrays.asList(
                    new Product("1", ProductType.JEWELER, ProductCondition.BELONGTOLOMBARD, "ruby", 0.5, "good"),
                    new Product("2", ProductType.TECHNICS, ProductCondition.BELONGTOLOMBARD, "iphone 6s", 1.5, "poor")
            ));

    public List<Product> findAll(){
        return this.products;
    }

    public Product findById(String id) {
        return this.products.stream().filter(item -> item.getId().equals(id))
                .findFirst().orElse(null);
    }

    public Product update(Product product) {
        this.deleteById(product.getId());
        product.setUpdatedAt(LocalDateTime.now());
        this.products.add(product);
        return  product;
    }

    public void deleteById(String id) {
        Product product = this.findById(id);
        int index = products.indexOf(product);
        this.products.remove(index);

    }

    public Product save(Product product) {
        product.setId(UUID.randomUUID().toString());
        product.setCreatedAt(LocalDateTime.now());
        this.products.add(product);
        return product;
    }

}
