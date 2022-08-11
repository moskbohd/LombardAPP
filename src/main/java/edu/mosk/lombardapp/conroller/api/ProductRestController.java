package edu.mosk.lombardapp.conroller.api;
/*
  @author   moskb
  @project   LombardAPP
  @version  1.0.0 
  @since 11.08.2022
*/

import edu.mosk.lombardapp.model.Product;
import edu.mosk.lombardapp.service.impls.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/product/")
@RestController
public class ProductRestController {

    @Autowired
    ProductServiceImpl service;
    @GetMapping("")
    public List<Product> showAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Product showOne(@PathVariable String id){
        return service.get(id);
    }

    @DeleteMapping("/{id}")
    public void del(@PathVariable String id){
        service.delete(id);
    }

    @PostMapping()
    public Product insertOne(@RequestBody Product product){
        return service.create(product);
    }
    @PutMapping()
    public Product updateOne(@RequestBody Product product){
        return service.update(product);
    }

}
