package edu.mosk.lombardapp.controller.ui;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

import edu.mosk.lombardapp.form.product.ProductForm;
import edu.mosk.lombardapp.model.product.Product;
import edu.mosk.lombardapp.model.product.ProductCondition;
import edu.mosk.lombardapp.model.product.ProductType;
import edu.mosk.lombardapp.service.product.impls.ProductServiceImpl;

import java.time.LocalDateTime;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.Model;

@ContextConfiguration(classes = {ProductUIController.class})
@ExtendWith(SpringExtension.class)
class ProductUIControllerTest {
    @MockBean
    private ProductServiceImpl productServiceImpl;

    @Autowired
    private ProductUIController productUIController;

    /**
     * Method under test: {@link ProductUIController#addProduct(ProductForm)}
     */
    @Test
    void testAddProduct() throws Exception {
        Product product = new Product();
        product.setCreatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        product.setId("42");
        product.setProductCondition(ProductCondition.BELONGTOOWNER);
        product.setProductDescription("Product Description");
        product.setProductName("Product Name");
        product.setProductType(ProductType.TECHNICS);
        product.setProductWeight(10.0d);
        product.setUpdatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        when(productServiceImpl.create((Product) any())).thenReturn(product);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/ui/v1/product/products/add");
        MockMvcBuilders.standaloneSetup(productUIController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isFound())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("form"))
                .andExpect(MockMvcResultMatchers.view().name("redirect:/ui/v1/product/products"))
                .andExpect(MockMvcResultMatchers.redirectedUrl("/ui/v1/product/products"));
    }

    /**
     * Method under test: {@link ProductUIController#addProduct(Model)}
     */
    @Test
    void testAddProduct2() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/ui/v1/product/products/add");
        MockMvcBuilders.standaloneSetup(productUIController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(3))
                .andExpect(MockMvcResultMatchers.model().attributeExists("conditions", "form", "types"))
                .andExpect(MockMvcResultMatchers.view().name("product/addProduct"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("product/addProduct"));
    }

    /**
     * Method under test: {@link ProductUIController#addProduct(Model)}
     */
    @Test
    void testAddProduct3() throws Exception {
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/ui/v1/product/products/add");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(productUIController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(3))
                .andExpect(MockMvcResultMatchers.model().attributeExists("conditions", "form", "types"))
                .andExpect(MockMvcResultMatchers.view().name("product/addProduct"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("product/addProduct"));
    }

    /**
     * Method under test: {@link ProductUIController#deleteById(String)}
     */
    @Test
    void testDeleteById() throws Exception {
        doNothing().when(productServiceImpl).delete((String) any());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/ui/v1/product/products/del/{id}",
                "42");
        MockMvcBuilders.standaloneSetup(productUIController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isFound())
                .andExpect(MockMvcResultMatchers.model().size(0))
                .andExpect(MockMvcResultMatchers.view().name("redirect:/ui/v1/product/products/"))
                .andExpect(MockMvcResultMatchers.redirectedUrl("/ui/v1/product/products/"));
    }

    /**
     * Method under test: {@link ProductUIController#deleteById(String)}
     */
    @Test
    void testDeleteById2() throws Exception {
        doNothing().when(productServiceImpl).delete((String) any());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/ui/v1/product/products/del/{id}", "42");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(productUIController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isFound())
                .andExpect(MockMvcResultMatchers.model().size(0))
                .andExpect(MockMvcResultMatchers.view().name("redirect:/ui/v1/product/products/"))
                .andExpect(MockMvcResultMatchers.redirectedUrl("/ui/v1/product/products/"));
    }

    /**
     * Method under test: {@link ProductUIController#showAll(Model)}
     */
    @Test
    void testShowAll() throws Exception {
        when(productServiceImpl.getAll()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/ui/v1/product/products");
        MockMvcBuilders.standaloneSetup(productUIController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("products"))
                .andExpect(MockMvcResultMatchers.view().name("product/products"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("product/products"));
    }

    /**
     * Method under test: {@link ProductUIController#showAll(Model)}
     */
    @Test
    void testShowAll2() throws Exception {
        when(productServiceImpl.getAll()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/ui/v1/product/products");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(productUIController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("products"))
                .andExpect(MockMvcResultMatchers.view().name("product/products"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("product/products"));
    }

    /**
     * Method under test: {@link ProductUIController#updateProduct(ProductForm)}
     */
    @Test
    void testUpdateProduct() throws Exception {
        Product product = new Product();
        product.setCreatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        product.setId("42");
        product.setProductCondition(ProductCondition.BELONGTOOWNER);
        product.setProductDescription("Product Description");
        product.setProductName("Product Name");
        product.setProductType(ProductType.TECHNICS);
        product.setProductWeight(10.0d);
        product.setUpdatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        when(productServiceImpl.update((Product) any())).thenReturn(product);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/ui/v1/product/products/edit/{id}",
                "42");
        MockMvcBuilders.standaloneSetup(productUIController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isFound())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("form"))
                .andExpect(MockMvcResultMatchers.view().name("redirect:/ui/v1/product/products/"))
                .andExpect(MockMvcResultMatchers.redirectedUrl("/ui/v1/product/products/"));
    }

    /**
     * Method under test: {@link ProductUIController#updateProduct(Model, String)}
     */
    @Test
    void testUpdateProduct2() throws Exception {
        Product product = new Product();
        product.setCreatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        product.setId("42");
        product.setProductCondition(ProductCondition.BELONGTOOWNER);
        product.setProductDescription("Product Description");
        product.setProductName("Product Name");
        product.setProductType(ProductType.TECHNICS);
        product.setProductWeight(10.0d);
        product.setUpdatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        when(productServiceImpl.get((String) any())).thenReturn(product);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/ui/v1/product/products/edit/{id}",
                "42");
        MockMvcBuilders.standaloneSetup(productUIController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(3))
                .andExpect(MockMvcResultMatchers.model().attributeExists("conditions", "form", "types"))
                .andExpect(MockMvcResultMatchers.view().name("product/updateProduct"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("product/updateProduct"));
    }
}

