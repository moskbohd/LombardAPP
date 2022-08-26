package edu.mosk.lombardapp.controller.ui;
/*
  @author   moskb
  @project   LombardAPP
  @version  1.0.0
  @since 11.08.2022
*/

import edu.mosk.lombardapp.form.priceHistory.PriceHistoryForm;
import edu.mosk.lombardapp.model.price.PriceHistory;
import edu.mosk.lombardapp.service.price.impls.PriceHistoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;


@RequestMapping("/ui/v1/price/priceHistorys/")
@Controller
public class PriceHistoryUIController {

    @Autowired
    PriceHistoryServiceImpl service;

    @GetMapping("")
    public String showAll(Model model){
        model.addAttribute("priceHistorys", service.getAll());
        return "price/priceHistorys";
    }
    @GetMapping("/{id}")
    public String getLastPriceForProduct(Model model, @PathVariable String id){
        List<PriceHistory> priceHistories = service.getProductHistoryById(id);
        model.addAttribute("priceHistories", priceHistories);
        return "price/priceHistorys";
    }

    @GetMapping("/del/{id}")
    public String deleteById(@PathVariable("id") String id) {
        service.delete(id);
        return "redirect:/ui/v1/price/priceHistorys/";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addPrice(Model model){
        PriceHistoryForm priceHistoryForm = new PriceHistoryForm();
        model.addAttribute("form", priceHistoryForm);
        return "price/addPrice";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addPrice(@ModelAttribute("form") PriceHistoryForm form){
        PriceHistory price = new PriceHistory();
        price.setPrice(form.getPrice());
        price.setCreatedAt(LocalDateTime.now());

        service.create(price);
        return "redirect:/ui/v1/price/priceHistorys/";
    }
}

