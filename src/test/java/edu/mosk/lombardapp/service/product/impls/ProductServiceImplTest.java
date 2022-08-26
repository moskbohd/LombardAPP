package edu.mosk.lombardapp.service.product.impls;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.anyDouble;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import edu.mosk.lombardapp.model.product.Product;
import edu.mosk.lombardapp.model.product.ProductCondition;
import edu.mosk.lombardapp.model.product.ProductType;
import edu.mosk.lombardapp.repository.product.IProductMongoRepository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {ProductServiceImpl.class})
@ExtendWith(SpringExtension.class)
class ProductServiceImplTest {
    @MockBean
    private IProductMongoRepository iProductMongoRepository;

    @Autowired
    private ProductServiceImpl productServiceImpl;

    /**
     * Method under test: {@link ProductServiceImpl#init()}
     */
    @Test
    void testInit() {
        when(iProductMongoRepository.saveAll((Iterable<Product>) any())).thenReturn(new ArrayList<>());
        productServiceImpl.init();
        verify(iProductMongoRepository).saveAll((Iterable<Product>) any());
        assertTrue(productServiceImpl.getAll().isEmpty());
    }

    /**
     * Method under test: {@link ProductServiceImpl#create(Product)}
     */
    @Test
    void testCreate() {
        Product product = new Product();
        product.setCreatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        product.setId("42");
        product.setProductCondition(ProductCondition.BELONGTOOWNER);
        product.setProductDescription("Product Description");
        product.setProductName("Product Name");
        product.setProductType(ProductType.TECHNICS);
        product.setProductWeight(10.0d);
        product.setUpdatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        when(iProductMongoRepository.save((Product) any())).thenReturn(product);

        Product product1 = new Product();
        product1.setCreatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        product1.setId("42");
        product1.setProductCondition(ProductCondition.BELONGTOOWNER);
        product1.setProductDescription("Product Description");
        product1.setProductName("Product Name");
        product1.setProductType(ProductType.TECHNICS);
        product1.setProductWeight(10.0d);
        product1.setUpdatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        assertSame(product, productServiceImpl.create(product1));
        verify(iProductMongoRepository).save((Product) any());
    }

    /**
     * Method under test: {@link ProductServiceImpl#create(Product)}
     */
    @Test
    void testCreate2() {
        Product product = new Product();
        product.setCreatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        product.setId("42");
        product.setProductCondition(ProductCondition.BELONGTOOWNER);
        product.setProductDescription("Product Description");
        product.setProductName("Product Name");
        product.setProductType(ProductType.TECHNICS);
        product.setProductWeight(10.0d);
        product.setUpdatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        when(iProductMongoRepository.save((Product) any())).thenReturn(product);
        Product product1 = mock(Product.class);
        doNothing().when(product1).setCreatedAt((LocalDateTime) any());
        doNothing().when(product1).setId((String) any());
        doNothing().when(product1).setProductCondition((ProductCondition) any());
        doNothing().when(product1).setProductDescription((String) any());
        doNothing().when(product1).setProductName((String) any());
        doNothing().when(product1).setProductType((ProductType) any());
        doNothing().when(product1).setProductWeight(anyDouble());
        doNothing().when(product1).setUpdatedAt((LocalDateTime) any());
        product1.setCreatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        product1.setId("42");
        product1.setProductCondition(ProductCondition.BELONGTOOWNER);
        product1.setProductDescription("Product Description");
        product1.setProductName("Product Name");
        product1.setProductType(ProductType.TECHNICS);
        product1.setProductWeight(10.0d);
        product1.setUpdatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        assertSame(product, productServiceImpl.create(product1));
        verify(iProductMongoRepository).save((Product) any());
        verify(product1, atLeast(1)).setCreatedAt((LocalDateTime) any());
        verify(product1, atLeast(1)).setId((String) any());
        verify(product1).setProductCondition((ProductCondition) any());
        verify(product1).setProductDescription((String) any());
        verify(product1).setProductName((String) any());
        verify(product1).setProductType((ProductType) any());
        verify(product1).setProductWeight(anyDouble());
        verify(product1).setUpdatedAt((LocalDateTime) any());
    }

    /**
     * Method under test: {@link ProductServiceImpl#update(Product)}
     */
    @Test
    void testUpdate() {
        Product product = new Product();
        product.setCreatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        product.setId("42");
        product.setProductCondition(ProductCondition.BELONGTOOWNER);
        product.setProductDescription("Product Description");
        product.setProductName("Product Name");
        product.setProductType(ProductType.TECHNICS);
        product.setProductWeight(10.0d);
        product.setUpdatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        when(iProductMongoRepository.save((Product) any())).thenReturn(product);

        Product product1 = new Product();
        product1.setCreatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        product1.setId("42");
        product1.setProductCondition(ProductCondition.BELONGTOOWNER);
        product1.setProductDescription("Product Description");
        product1.setProductName("Product Name");
        product1.setProductType(ProductType.TECHNICS);
        product1.setProductWeight(10.0d);
        product1.setUpdatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        assertSame(product, productServiceImpl.update(product1));
        verify(iProductMongoRepository).save((Product) any());
    }

    /**
     * Method under test: {@link ProductServiceImpl#update(Product)}
     */
    @Test
    void testUpdate2() {
        Product product = new Product();
        product.setCreatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        product.setId("42");
        product.setProductCondition(ProductCondition.BELONGTOOWNER);
        product.setProductDescription("Product Description");
        product.setProductName("Product Name");
        product.setProductType(ProductType.TECHNICS);
        product.setProductWeight(10.0d);
        product.setUpdatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        when(iProductMongoRepository.save((Product) any())).thenReturn(product);
        Product product1 = mock(Product.class);
        doNothing().when(product1).setCreatedAt((LocalDateTime) any());
        doNothing().when(product1).setId((String) any());
        doNothing().when(product1).setProductCondition((ProductCondition) any());
        doNothing().when(product1).setProductDescription((String) any());
        doNothing().when(product1).setProductName((String) any());
        doNothing().when(product1).setProductType((ProductType) any());
        doNothing().when(product1).setProductWeight(anyDouble());
        doNothing().when(product1).setUpdatedAt((LocalDateTime) any());
        product1.setCreatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        product1.setId("42");
        product1.setProductCondition(ProductCondition.BELONGTOOWNER);
        product1.setProductDescription("Product Description");
        product1.setProductName("Product Name");
        product1.setProductType(ProductType.TECHNICS);
        product1.setProductWeight(10.0d);
        product1.setUpdatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        assertSame(product, productServiceImpl.update(product1));
        verify(iProductMongoRepository).save((Product) any());
        verify(product1).setCreatedAt((LocalDateTime) any());
        verify(product1).setId((String) any());
        verify(product1).setProductCondition((ProductCondition) any());
        verify(product1).setProductDescription((String) any());
        verify(product1).setProductName((String) any());
        verify(product1).setProductType((ProductType) any());
        verify(product1).setProductWeight(anyDouble());
        verify(product1, atLeast(1)).setUpdatedAt((LocalDateTime) any());
    }

    /**
     * Method under test: {@link ProductServiceImpl#get(String)}
     */
    @Test
    void testGet() {
        Product product = new Product();
        product.setCreatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        product.setId("42");
        product.setProductCondition(ProductCondition.BELONGTOOWNER);
        product.setProductDescription("Product Description");
        product.setProductName("Product Name");
        product.setProductType(ProductType.TECHNICS);
        product.setProductWeight(10.0d);
        product.setUpdatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        Optional<Product> ofResult = Optional.of(product);
        when(iProductMongoRepository.findById((String) any())).thenReturn(ofResult);
        assertSame(product, productServiceImpl.get("42"));
        verify(iProductMongoRepository).findById((String) any());
    }

    /**
     * Method under test: {@link ProductServiceImpl#get(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGet2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.util.NoSuchElementException: No value present
        //       at java.util.Optional.get(Optional.java:143)
        //       at edu.mosk.lombardapp.service.product.impls.ProductServiceImpl.get(ProductServiceImpl.java:55)
        //   In order to prevent get(String)
        //   from throwing NoSuchElementException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   get(String).
        //   See https://diff.blue/R013 to resolve this issue.

        when(iProductMongoRepository.findById((String) any())).thenReturn(Optional.empty());
        productServiceImpl.get("42");
    }

    /**
     * Method under test: {@link ProductServiceImpl#delete(String)}
     */
    @Test
    void testDelete() {
        doNothing().when(iProductMongoRepository).deleteById((String) any());
        productServiceImpl.delete("42");
        verify(iProductMongoRepository).deleteById((String) any());
        assertTrue(productServiceImpl.getAll().isEmpty());
    }

    /**
     * Method under test: {@link ProductServiceImpl#getAll()}
     */
    @Test
    void testGetAll() {
        ArrayList<Product> productList = new ArrayList<>();
        when(iProductMongoRepository.findAll()).thenReturn(productList);
        List<Product> actualAll = productServiceImpl.getAll();
        assertSame(productList, actualAll);
        assertTrue(actualAll.isEmpty());
        verify(iProductMongoRepository).findAll();
    }
}

