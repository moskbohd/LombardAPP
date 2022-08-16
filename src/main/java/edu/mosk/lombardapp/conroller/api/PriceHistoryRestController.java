package edu.mosk.lombardapp.conroller.api;
/*
  @author   moskb
  @project   LombardAPP
  @version  1.0.0 
  @since 11.08.2022
*/

import edu.mosk.lombardapp.model.PriceHistory;
import edu.mosk.lombardapp.service.impls.PriceHistoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/priceHistory/")
@RestController
public class PriceHistoryRestController {

    @Autowired
    private PriceHistoryServiceImpl service;
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

}
