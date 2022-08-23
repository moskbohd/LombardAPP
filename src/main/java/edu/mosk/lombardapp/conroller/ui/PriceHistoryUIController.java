package edu.mosk.lombardapp.conroller.ui;
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


@RequestMapping("/ui/v1/priceHistorys/")
@Controller
public class PriceHistoryUIController {

    @Autowired
    PriceHistoryServiceImpl service;

    @GetMapping("")
    public String showAll(Model model){
        model.addAttribute("priceHistorys", service.getAll());
        return "priceHistorys";
    }


    @GetMapping("/del/{id}")
    public String deleteById(@PathVariable("id") String id) {
        service.delete(id);
        return "redirect:/ui/v1/priceHistorys/";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addPrice(Model model){
        PriceHistoryForm priceHistoryForm = new PriceHistoryForm();
        model.addAttribute("form", priceHistoryForm);
        return "addPrice";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addPrice(@ModelAttribute("form") PriceHistoryForm form){
        PriceHistory priceHistory = new PriceHistory();
        priceHistory.setPrice(form.getPrice());
        priceHistory.setDescription(form.getDescription());
        //priceHistory.setProduct(form.getProduct());
        priceHistory.setCreatedAt(LocalDateTime.now());

        service.create(priceHistory);
        return "redirect:/ui/v1/priceHistorys/";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String updatePrice(Model model, @PathVariable("id") String id){
        PriceHistory priceHistoryToUpdate = service.get(id);
        PriceHistoryForm priceHistoryForm = new PriceHistoryForm();

        priceHistoryForm.setDescription(priceHistoryToUpdate.getDescription());
        priceHistoryForm.setPrice(priceHistoryToUpdate.getPrice());
        //priceHistoryForm.setProduct(priceHistoryToUpdate.getProduct());
        priceHistoryForm.setCreatedAt(priceHistoryToUpdate.getCreatedAt());

        model.addAttribute("form", priceHistoryForm);
        return "updatePrice";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String updatePrice( @ModelAttribute("form") PriceHistoryForm form){
        System.out.println(form);
        PriceHistory priceHistoryToUpdate = new PriceHistory();

        priceHistoryToUpdate.setId(form.getId());
        //priceHistoryToUpdate.setProduct(priceHistoryToUpdate.getProduct());
        priceHistoryToUpdate.setPrice(form.getPrice());
        priceHistoryToUpdate.setCreatedAt(LocalDateTime.now());

        service.create(priceHistoryToUpdate);
        return "redirect:/ui/v1/priceHistorys/";
    }
}
