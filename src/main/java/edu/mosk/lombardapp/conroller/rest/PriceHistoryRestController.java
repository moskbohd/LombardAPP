package edu.mosk.lombardapp.conroller.rest;
/*
  @author   moskb
  @project   LombardAPP
  @version  1.0.0 
  @since 11.08.2022
*/

import edu.mosk.lombardapp.model.price.PriceHistory;
import edu.mosk.lombardapp.model.product.Product;
import edu.mosk.lombardapp.service.price.impls.PriceHistoryServiceImpl;
import edu.mosk.lombardapp.service.product.impls.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;

@RequestMapping("/api/v1/priceHistorys/")
@RestController
public class PriceHistoryRestController {
    @Autowired
    PriceHistoryServiceImpl service;
    @GetMapping("")
    public List<PriceHistory> showAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public PriceHistory showOne(@PathVariable String id){
        return service.get(id);
    }

    @DeleteMapping("/{id}")
    public void del(@PathVariable String id){
        service.delete(id);
    }

    @PostMapping()
    public PriceHistory insertOne(@RequestBody PriceHistory priceHistory){
        return service.create(priceHistory);
    }
    @PutMapping()
    public PriceHistory updateOne(@RequestBody PriceHistory priceHistory){
        return service.update(priceHistory);
    }
    @GetMapping("/lastPrice/{id}")
    public double getLastPriceForProduct(@RequestBody Product product){
        return  service.getAll().stream()
                .filter(priceHistory -> priceHistory.getProduct().equals(product))
                .max(Comparator.comparing(PriceHistory::getCreatedAt))
                .orElse(null)
                .getPrice();
    }
}
