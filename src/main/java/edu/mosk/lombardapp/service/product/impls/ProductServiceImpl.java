package edu.mosk.lombardapp.service.product.impls;
/*
  @author   moskb
  @project   LombardAPP
  @version  1.0.0 
  @since 11.08.2022
*/

import edu.mosk.lombardapp.model.Product;
import edu.mosk.lombardapp.model.ProductCondition;
import edu.mosk.lombardapp.model.ProductType;
import edu.mosk.lombardapp.repository.product.IProductMongoRepository;
import edu.mosk.lombardapp.service.product.interfaces.IProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class ProductServiceImpl implements IProductServiceImpl {

    private LocalDateTime now = LocalDateTime.now();
    private List<Product> products = new ArrayList<>(
            Arrays.asList(
                    new Product("1", ProductType.JEWELER, ProductCondition.BELONGTOLOMBARD, "ruby", 0.5, "good", now, now),
                    new Product("2", ProductType.TECHNICS, ProductCondition.BELONGTOLOMBARD, "iphone 6s", 1.5, "poor", now, now)
            ));
    @Autowired
    private IProductMongoRepository repository;

    @PostConstruct
    void init(){
        repository.saveAll((products));
    }

    @Override
    public Product create(Product product) { return repository.save(product);
    }

    @Override
    public Product update(Product product) { return repository.save(product);
    }

    @Override
    public Product get(String id) { return repository.findById(id).get();
    }

    @Override
    public void delete(String id) { repository.deleteById(id);
    }

    @Override
    public List<Product> getAll() { return repository.findAll();
    }

}
