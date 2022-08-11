package edu.mosk.lombardapp.service.impls;
/*
  @author   moskb
  @project   LombardAPP
  @version  1.0.0 
  @since 11.08.2022
*/

import edu.mosk.lombardapp.model.Product;
import edu.mosk.lombardapp.repository.ProductFakeRepository;
import edu.mosk.lombardapp.service.interfaces.IItemService;
import edu.mosk.lombardapp.service.interfaces.IProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public class ProductServiceImpl implements IProductServiceImpl {

    @Autowired
    ProductFakeRepository repository;

    @Override
    public Product create(Product product) { return repository.save(product);
    }

    @Override
    public Product update(Product product) {
        return repository.update(product);
    }

    @Override
    public Product get(String id) { return repository.findById(id);
    }

    @Override
    public void delete(String id) {  repository.deleteById(id);
    }

    @Override
    public List<Product> getAll() { return repository.findAll();  }
}
