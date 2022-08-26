package edu.mosk.lombardapp.controller.ui;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

import edu.mosk.lombardapp.form.priceHistory.PriceHistoryForm;
import edu.mosk.lombardapp.model.price.PriceHistory;
import edu.mosk.lombardapp.service.price.impls.PriceHistoryServiceImpl;

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

@ContextConfiguration(classes = {PriceHistoryUIController.class})
@ExtendWith(SpringExtension.class)
class PriceHistoryUIControllerTest {
    @MockBean
    private PriceHistoryServiceImpl priceHistoryServiceImpl;

    @Autowired
    private PriceHistoryUIController priceHistoryUIController;

    /**
     * Method under test: {@link PriceHistoryUIController#addPrice(PriceHistoryForm)}
     */
    @Test
    void testAddPrice() throws Exception {
        when(priceHistoryServiceImpl.create((PriceHistory) any())).thenReturn(new PriceHistory());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/ui/v1/price/priceHistorys/add");
        MockMvcBuilders.standaloneSetup(priceHistoryUIController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isFound())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("form"))
                .andExpect(MockMvcResultMatchers.view().name("redirect:/ui/v1/price/priceHistorys/"))
                .andExpect(MockMvcResultMatchers.redirectedUrl("/ui/v1/price/priceHistorys/"));
    }

    /**
     * Method under test: {@link PriceHistoryUIController#addPrice(Model)}
     */
    @Test
    void testAddPrice2() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/ui/v1/price/priceHistorys/add");
        MockMvcBuilders.standaloneSetup(priceHistoryUIController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("form"))
                .andExpect(MockMvcResultMatchers.view().name("price/addPrice"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("price/addPrice"));
    }

    /**
     * Method under test: {@link PriceHistoryUIController#addPrice(Model)}
     */
    @Test
    void testAddPrice3() throws Exception {
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/ui/v1/price/priceHistorys/add");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(priceHistoryUIController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("form"))
                .andExpect(MockMvcResultMatchers.view().name("price/addPrice"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("price/addPrice"));
    }

    /**
     * Method under test: {@link PriceHistoryUIController#deleteById(String)}
     */
    @Test
    void testDeleteById() throws Exception {
        doNothing().when(priceHistoryServiceImpl).delete((String) any());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/ui/v1/price/priceHistorys/del/{id}",
                "42");
        MockMvcBuilders.standaloneSetup(priceHistoryUIController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isFound())
                .andExpect(MockMvcResultMatchers.model().size(0))
                .andExpect(MockMvcResultMatchers.view().name("redirect:/ui/v1/price/priceHistorys/"))
                .andExpect(MockMvcResultMatchers.redirectedUrl("/ui/v1/price/priceHistorys/"));
    }

    /**
     * Method under test: {@link PriceHistoryUIController#deleteById(String)}
     */
    @Test
    void testDeleteById2() throws Exception {
        when(priceHistoryServiceImpl.getProductHistoryById((String) any())).thenReturn(new ArrayList<>());
        doNothing().when(priceHistoryServiceImpl).delete((String) any());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/ui/v1/price/priceHistorys/del/{id}",
                "", "Uri Variables");
        MockMvcBuilders.standaloneSetup(priceHistoryUIController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("priceHistories"))
                .andExpect(MockMvcResultMatchers.view().name("price/priceHistorys"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("price/priceHistorys"));
    }

    /**
     * Method under test: {@link PriceHistoryUIController#getLastPriceForProduct(Model, String)}
     */
    @Test
    void testGetLastPriceForProduct() throws Exception {
        when(priceHistoryServiceImpl.getProductHistoryById((String) any())).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/ui/v1/price/priceHistorys/{id}",
                "42");
        MockMvcBuilders.standaloneSetup(priceHistoryUIController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("priceHistories"))
                .andExpect(MockMvcResultMatchers.view().name("price/priceHistorys"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("price/priceHistorys"));
    }

    /**
     * Method under test: {@link PriceHistoryUIController#getLastPriceForProduct(Model, String)}
     */
    @Test
    void testGetLastPriceForProduct2() throws Exception {
        when(priceHistoryServiceImpl.getAll()).thenReturn(new ArrayList<>());
        when(priceHistoryServiceImpl.getProductHistoryById((String) any())).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/ui/v1/price/priceHistorys/{id}", "",
                "Uri Variables");
        MockMvcBuilders.standaloneSetup(priceHistoryUIController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("priceHistorys"))
                .andExpect(MockMvcResultMatchers.view().name("price/priceHistorys"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("price/priceHistorys"));
    }

    /**
     * Method under test: {@link PriceHistoryUIController#showAll(Model)}
     */
    @Test
    void testShowAll() throws Exception {
        when(priceHistoryServiceImpl.getAll()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/ui/v1/price/priceHistorys/");
        MockMvcBuilders.standaloneSetup(priceHistoryUIController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("priceHistorys"))
                .andExpect(MockMvcResultMatchers.view().name("price/priceHistorys"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("price/priceHistorys"));
    }

    /**
     * Method under test: {@link PriceHistoryUIController#showAll(Model)}
     */
    @Test
    void testShowAll2() throws Exception {
        when(priceHistoryServiceImpl.getAll()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/ui/v1/price/priceHistorys/");
        getResult.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(priceHistoryUIController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("priceHistorys"))
                .andExpect(MockMvcResultMatchers.view().name("price/priceHistorys"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("price/priceHistorys"));
    }
}

