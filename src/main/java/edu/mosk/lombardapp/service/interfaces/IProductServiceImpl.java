package edu.mosk.lombardapp.service.interfaces;
/*
  @author   moskb
  @project   LombardAPP
  @version  1.0.0 
  @since 11.08.2022
*/

import edu.mosk.lombardapp.model.Product;

import java.util.List;

public interface IProductServiceImpl {
    Product create(Product product);
    Product update(Product product);
    Product get(String id);
    void delete(String id);
    List<Product> getAll();
}
