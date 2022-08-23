package edu.mosk.lombardapp.conroller.ui;
/*
  @author   moskb
  @project   LombardAPP
  @version  1.0.0
  @since 11.08.2022
*/

import edu.mosk.lombardapp.form.product.ProductForm;
import edu.mosk.lombardapp.model.product.Product;
import edu.mosk.lombardapp.model.product.ProductCondition;
import edu.mosk.lombardapp.model.product.ProductType;
import edu.mosk.lombardapp.service.product.impls.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;


@RequestMapping("/ui/v1/products")
@Controller
public class ProductUIController {

    @Autowired
    ProductServiceImpl service;

    @GetMapping("")
    public String showAll(Model model){
        model.addAttribute("products", service.getAll());
        return "products";
    }


    @GetMapping("/del/{id}")
    public String deleteById(@PathVariable("id") String id) {
        service.delete(id);
        return "redirect:/ui/v1/products/";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addProduct(Model model){
        ProductForm productForm = new ProductForm();
        var types = ProductType.values();
        var conditions = ProductCondition.values();
        model.addAttribute("form", productForm);
        model.addAttribute("types", types);
        model.addAttribute("conditions", conditions);
        return "addProduct";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addProduct(@ModelAttribute("form") ProductForm form){
        Product product = new Product();
        product.setProductType(form.getProductType());
        product.setProductCondition(form.getProductCondition());
        product.setProductName(form.getProductName());
        product.setProductWeight(form.getProductWeight());
        product.setProductDescription(form.getProductDescription());
        product.setCreatedAt(LocalDateTime.now());

        service.create(product);
        return "redirect:/ui/v1/products";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String updateProduct(Model model, @PathVariable("id") String id){
        Product productToUpdate = service.get(id);
        ProductForm productForm = new ProductForm();
        var types = ProductType.values();
        var conditions = ProductCondition.values();
        model.addAttribute("types", types);
        model.addAttribute("conditions", conditions);

        productForm.setProductType(productToUpdate.getProductType());
        productForm.setProductCondition(productToUpdate.getProductCondition());
        productForm.setProductName(productToUpdate.getProductName());
        productForm.setProductWeight(productToUpdate.getProductWeight());
        productForm.setProductDescription(productToUpdate.getProductDescription());
        productForm.setCreatedAt(productToUpdate.getCreatedAt());

        model.addAttribute("form", productForm);
        return "updateProduct";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String updateProduct( @ModelAttribute("form") ProductForm form){
        System.out.println(form);
        Product productToUpdate = new Product();
        productToUpdate.setId(form.getId());
        productToUpdate.setProductType(form.getProductType());
        productToUpdate.setProductCondition(form.getProductCondition());
        productToUpdate.setProductName(form.getProductName());
        productToUpdate.setProductWeight(form.getProductWeight());
        productToUpdate.setProductDescription(form.getProductDescription());
        productToUpdate.setCreatedAt(form.getCreatedAt());
        productToUpdate.setUpdatedAt(LocalDateTime.now());

        service.update(productToUpdate);
        return "redirect:/ui/v1/products/";
    }
}
