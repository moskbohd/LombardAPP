package edu.mosk.lombardapp.service.price.impls;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.anyDouble;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import edu.mosk.lombardapp.model.price.PriceHistory;
import edu.mosk.lombardapp.model.product.Product;
import edu.mosk.lombardapp.model.product.ProductCondition;
import edu.mosk.lombardapp.model.product.ProductType;
import edu.mosk.lombardapp.repository.price.IPriceHistoryMongoRepository;

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

@ContextConfiguration(classes = {PriceHistoryServiceImpl.class})
@ExtendWith(SpringExtension.class)
class PriceHistoryServiceImplTest {
    @MockBean
    private IPriceHistoryMongoRepository iPriceHistoryMongoRepository;

    @Autowired
    private PriceHistoryServiceImpl priceHistoryServiceImpl;

    /**
     * Method under test: {@link PriceHistoryServiceImpl#init()}
     */
    @Test
    void testInit() {
        when(iPriceHistoryMongoRepository.saveAll((Iterable<PriceHistory>) any())).thenReturn(new ArrayList<>());
        priceHistoryServiceImpl.init();
        verify(iPriceHistoryMongoRepository).saveAll((Iterable<PriceHistory>) any());
        assertTrue(priceHistoryServiceImpl.getAll().isEmpty());
    }

    /**
     * Method under test: {@link PriceHistoryServiceImpl#create(PriceHistory)}
     */
    @Test
    void testCreate() {
        PriceHistory priceHistory = new PriceHistory();
        when(iPriceHistoryMongoRepository.save((PriceHistory) any())).thenReturn(priceHistory);
        assertSame(priceHistory, priceHistoryServiceImpl.create(new PriceHistory()));
        verify(iPriceHistoryMongoRepository).save((PriceHistory) any());
    }

    /**
     * Method under test: {@link PriceHistoryServiceImpl#create(PriceHistory)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreate2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "edu.mosk.lombardapp.model.price.PriceHistory.setId(String)" because "priceHistories" is null
        //       at edu.mosk.lombardapp.service.price.impls.PriceHistoryServiceImpl.create(PriceHistoryServiceImpl.java:44)
        //   In order to prevent create(PriceHistory)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   create(PriceHistory).
        //   See https://diff.blue/R013 to resolve this issue.

        when(iPriceHistoryMongoRepository.save((PriceHistory) any())).thenReturn(new PriceHistory());
        priceHistoryServiceImpl.create(null);
    }

    /**
     * Method under test: {@link PriceHistoryServiceImpl#update(PriceHistory)}
     */
    @Test
    void testUpdate() {
        PriceHistory priceHistory = new PriceHistory();
        when(iPriceHistoryMongoRepository.save((PriceHistory) any())).thenReturn(priceHistory);
        assertSame(priceHistory, priceHistoryServiceImpl.update(new PriceHistory()));
        verify(iPriceHistoryMongoRepository).save((PriceHistory) any());
    }

    /**
     * Method under test: {@link PriceHistoryServiceImpl#update(PriceHistory)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUpdate2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "edu.mosk.lombardapp.model.price.PriceHistory.setCreatedAt(java.time.LocalDateTime)" because "priceHistories" is null
        //       at edu.mosk.lombardapp.service.price.impls.PriceHistoryServiceImpl.update(PriceHistoryServiceImpl.java:51)
        //   In order to prevent update(PriceHistory)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   update(PriceHistory).
        //   See https://diff.blue/R013 to resolve this issue.

        when(iPriceHistoryMongoRepository.save((PriceHistory) any())).thenReturn(new PriceHistory());
        priceHistoryServiceImpl.update(null);
    }

    /**
     * Method under test: {@link PriceHistoryServiceImpl#get(String)}
     */
    @Test
    void testGet() {
        PriceHistory priceHistory = new PriceHistory();
        when(iPriceHistoryMongoRepository.findById((String) any())).thenReturn(Optional.of(priceHistory));
        assertSame(priceHistory, priceHistoryServiceImpl.get("42"));
        verify(iPriceHistoryMongoRepository).findById((String) any());
    }

    /**
     * Method under test: {@link PriceHistoryServiceImpl#get(String)}
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
        //       at edu.mosk.lombardapp.service.price.impls.PriceHistoryServiceImpl.get(PriceHistoryServiceImpl.java:56)
        //   In order to prevent get(String)
        //   from throwing NoSuchElementException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   get(String).
        //   See https://diff.blue/R013 to resolve this issue.

        when(iPriceHistoryMongoRepository.findById((String) any())).thenReturn(Optional.empty());
        priceHistoryServiceImpl.get("42");
    }

    /**
     * Method under test: {@link PriceHistoryServiceImpl#delete(String)}
     */
    @Test
    void testDelete() {
        doNothing().when(iPriceHistoryMongoRepository).deleteById((String) any());
        priceHistoryServiceImpl.delete("42");
        verify(iPriceHistoryMongoRepository).deleteById((String) any());
        assertTrue(priceHistoryServiceImpl.getAll().isEmpty());
    }

    /**
     * Method under test: {@link PriceHistoryServiceImpl#getProductHistoryById(String)}
     */
    @Test
    void testGetProductHistoryById() {
        when(iPriceHistoryMongoRepository.findAll()).thenReturn(new ArrayList<>());
        assertTrue(priceHistoryServiceImpl.getProductHistoryById("42").isEmpty());
        verify(iPriceHistoryMongoRepository).findAll();
    }

    /**
     * Method under test: {@link PriceHistoryServiceImpl#getProductHistoryById(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetProductHistoryById2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "edu.mosk.lombardapp.model.product.Product.getId()" because the return value of "edu.mosk.lombardapp.model.price.PriceHistory.getProduct()" is null
        //       at edu.mosk.lombardapp.service.price.impls.PriceHistoryServiceImpl.lambda$getProductHistoryById$0(PriceHistoryServiceImpl.java:66)
        //       at java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:178)
        //       at java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1625)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:682)
        //       at edu.mosk.lombardapp.service.price.impls.PriceHistoryServiceImpl.getProductHistoryById(PriceHistoryServiceImpl.java:67)
        //   In order to prevent getProductHistoryById(String)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getProductHistoryById(String).
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<PriceHistory> priceHistoryList = new ArrayList<>();
        priceHistoryList.add(new PriceHistory());
        when(iPriceHistoryMongoRepository.findAll()).thenReturn(priceHistoryList);
        priceHistoryServiceImpl.getProductHistoryById("42");
    }

    /**
     * Method under test: {@link PriceHistoryServiceImpl#getProductHistoryById(String)}
     */
    @Test
    void testGetProductHistoryById3() {
        Product product = new Product();
        product.setCreatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        product.setId("42");
        product.setProductCondition(ProductCondition.BELONGTOOWNER);
        product.setProductDescription("Product Description");
        product.setProductName("Product Name");
        product.setProductType(ProductType.TECHNICS);
        product.setProductWeight(10.0d);
        product.setUpdatedAt(LocalDateTime.of(1, 1, 1, 1, 1));

        PriceHistory priceHistory = new PriceHistory();
        priceHistory.setProduct(product);

        ArrayList<PriceHistory> priceHistoryList = new ArrayList<>();
        priceHistoryList.add(priceHistory);
        when(iPriceHistoryMongoRepository.findAll()).thenReturn(priceHistoryList);
        assertEquals(1, priceHistoryServiceImpl.getProductHistoryById("42").size());
        verify(iPriceHistoryMongoRepository).findAll();
    }

    /**
     * Method under test: {@link PriceHistoryServiceImpl#getProductHistoryById(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetProductHistoryById4() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "String.equals(Object)" because "str" is null
        //       at edu.mosk.lombardapp.service.price.impls.PriceHistoryServiceImpl.lambda$getProductHistoryById$0(PriceHistoryServiceImpl.java:66)
        //       at java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:178)
        //       at java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1625)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:682)
        //       at edu.mosk.lombardapp.service.price.impls.PriceHistoryServiceImpl.getProductHistoryById(PriceHistoryServiceImpl.java:67)
        //   In order to prevent getProductHistoryById(String)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getProductHistoryById(String).
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<PriceHistory> priceHistoryList = new ArrayList<>();
        Product product = new Product();
        priceHistoryList.add(new PriceHistory("42", product, "The characteristics of someone or something",
                LocalDateTime.of(1, 1, 1, 1, 1), 10.0d));
        when(iPriceHistoryMongoRepository.findAll()).thenReturn(priceHistoryList);
        priceHistoryServiceImpl.getProductHistoryById("42");
    }

    /**
     * Method under test: {@link PriceHistoryServiceImpl#getProductHistoryById(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetProductHistoryById5() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "edu.mosk.lombardapp.model.price.PriceHistory.getProduct()" because "priceHistory" is null
        //       at edu.mosk.lombardapp.service.price.impls.PriceHistoryServiceImpl.lambda$getProductHistoryById$0(PriceHistoryServiceImpl.java:66)
        //       at java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:178)
        //       at java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1625)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:682)
        //       at edu.mosk.lombardapp.service.price.impls.PriceHistoryServiceImpl.getProductHistoryById(PriceHistoryServiceImpl.java:67)
        //   In order to prevent getProductHistoryById(String)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getProductHistoryById(String).
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<PriceHistory> priceHistoryList = new ArrayList<>();
        priceHistoryList.add(null);
        when(iPriceHistoryMongoRepository.findAll()).thenReturn(priceHistoryList);
        priceHistoryServiceImpl.getProductHistoryById("42");
    }

    /**
     * Method under test: {@link PriceHistoryServiceImpl#getProductHistoryById(String)}
     */
    @Test
    void testGetProductHistoryById6() {
        Product product = mock(Product.class);
        when(product.getId()).thenReturn("42");
        doNothing().when(product).setCreatedAt((LocalDateTime) any());
        doNothing().when(product).setId((String) any());
        doNothing().when(product).setProductCondition((ProductCondition) any());
        doNothing().when(product).setProductDescription((String) any());
        doNothing().when(product).setProductName((String) any());
        doNothing().when(product).setProductType((ProductType) any());
        doNothing().when(product).setProductWeight(anyDouble());
        doNothing().when(product).setUpdatedAt((LocalDateTime) any());
        product.setCreatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        product.setId("42");
        product.setProductCondition(ProductCondition.BELONGTOOWNER);
        product.setProductDescription("Product Description");
        product.setProductName("Product Name");
        product.setProductType(ProductType.TECHNICS);
        product.setProductWeight(10.0d);
        product.setUpdatedAt(LocalDateTime.of(1, 1, 1, 1, 1));

        PriceHistory priceHistory = new PriceHistory();
        priceHistory.setProduct(product);

        ArrayList<PriceHistory> priceHistoryList = new ArrayList<>();
        priceHistoryList.add(priceHistory);
        when(iPriceHistoryMongoRepository.findAll()).thenReturn(priceHistoryList);
        assertEquals(1, priceHistoryServiceImpl.getProductHistoryById("42").size());
        verify(iPriceHistoryMongoRepository).findAll();
        verify(product).getId();
        verify(product).setCreatedAt((LocalDateTime) any());
        verify(product).setId((String) any());
        verify(product).setProductCondition((ProductCondition) any());
        verify(product).setProductDescription((String) any());
        verify(product).setProductName((String) any());
        verify(product).setProductType((ProductType) any());
        verify(product).setProductWeight(anyDouble());
        verify(product).setUpdatedAt((LocalDateTime) any());
    }

    /**
     * Method under test: {@link PriceHistoryServiceImpl#getAll()}
     */
    @Test
    void testGetAll() {
        ArrayList<PriceHistory> priceHistoryList = new ArrayList<>();
        when(iPriceHistoryMongoRepository.findAll()).thenReturn(priceHistoryList);
        List<PriceHistory> actualAll = priceHistoryServiceImpl.getAll();
        assertSame(priceHistoryList, actualAll);
        assertTrue(actualAll.isEmpty());
        verify(iPriceHistoryMongoRepository).findAll();
    }

    /**
     * Method under test: {@link PriceHistoryServiceImpl#getLastPriceForProduct(Product)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetLastPriceForProduct() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "edu.mosk.lombardapp.model.price.PriceHistory.getPrice()" because the return value of "java.util.Optional.orElse(Object)" is null
        //       at edu.mosk.lombardapp.service.price.impls.PriceHistoryServiceImpl.getLastPriceForProduct(PriceHistoryServiceImpl.java:79)
        //   In order to prevent getLastPriceForProduct(Product)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getLastPriceForProduct(Product).
        //   See https://diff.blue/R013 to resolve this issue.

        when(iPriceHistoryMongoRepository.findAll()).thenReturn(new ArrayList<>());

        Product product = new Product();
        product.setCreatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        product.setId("42");
        product.setProductCondition(ProductCondition.BELONGTOOWNER);
        product.setProductDescription("Product Description");
        product.setProductName("Product Name");
        product.setProductType(ProductType.TECHNICS);
        product.setProductWeight(10.0d);
        product.setUpdatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        priceHistoryServiceImpl.getLastPriceForProduct(product);
    }

    /**
     * Method under test: {@link PriceHistoryServiceImpl#getLastPriceForProduct(Product)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetLastPriceForProduct2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "edu.mosk.lombardapp.model.product.Product.equals(Object)" because the return value of "edu.mosk.lombardapp.model.price.PriceHistory.getProduct()" is null
        //       at edu.mosk.lombardapp.service.price.impls.PriceHistoryServiceImpl.lambda$getLastPriceForProduct$1(PriceHistoryServiceImpl.java:76)
        //       at java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:178)
        //       at java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1625)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.reduce(ReferencePipeline.java:662)
        //       at java.util.stream.ReferencePipeline.max(ReferencePipeline.java:698)
        //       at edu.mosk.lombardapp.service.price.impls.PriceHistoryServiceImpl.getLastPriceForProduct(PriceHistoryServiceImpl.java:77)
        //   In order to prevent getLastPriceForProduct(Product)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getLastPriceForProduct(Product).
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<PriceHistory> priceHistoryList = new ArrayList<>();
        priceHistoryList.add(new PriceHistory());
        when(iPriceHistoryMongoRepository.findAll()).thenReturn(priceHistoryList);

        Product product = new Product();
        product.setCreatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        product.setId("42");
        product.setProductCondition(ProductCondition.BELONGTOOWNER);
        product.setProductDescription("Product Description");
        product.setProductName("Product Name");
        product.setProductType(ProductType.TECHNICS);
        product.setProductWeight(10.0d);
        product.setUpdatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        priceHistoryServiceImpl.getLastPriceForProduct(product);
    }

    /**
     * Method under test: {@link PriceHistoryServiceImpl#getLastPriceForProduct(Product)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetLastPriceForProduct3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "edu.mosk.lombardapp.model.price.PriceHistory.getPrice()" because the return value of "java.util.Optional.orElse(Object)" is null
        //       at edu.mosk.lombardapp.service.price.impls.PriceHistoryServiceImpl.getLastPriceForProduct(PriceHistoryServiceImpl.java:79)
        //   In order to prevent getLastPriceForProduct(Product)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getLastPriceForProduct(Product).
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<PriceHistory> priceHistoryList = new ArrayList<>();
        Product product = new Product();
        priceHistoryList.add(new PriceHistory("42", product, "The characteristics of someone or something",
                LocalDateTime.of(1, 1, 1, 1, 1), 10.0d));
        when(iPriceHistoryMongoRepository.findAll()).thenReturn(priceHistoryList);

        Product product1 = new Product();
        product1.setCreatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        product1.setId("42");
        product1.setProductCondition(ProductCondition.BELONGTOOWNER);
        product1.setProductDescription("Product Description");
        product1.setProductName("Product Name");
        product1.setProductType(ProductType.TECHNICS);
        product1.setProductWeight(10.0d);
        product1.setUpdatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        priceHistoryServiceImpl.getLastPriceForProduct(product1);
    }

    /**
     * Method under test: {@link PriceHistoryServiceImpl#getLastPriceForProduct(Product)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetLastPriceForProduct4() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "edu.mosk.lombardapp.model.price.PriceHistory.getProduct()" because "priceHistory" is null
        //       at edu.mosk.lombardapp.service.price.impls.PriceHistoryServiceImpl.lambda$getLastPriceForProduct$1(PriceHistoryServiceImpl.java:76)
        //       at java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:178)
        //       at java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1625)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.reduce(ReferencePipeline.java:662)
        //       at java.util.stream.ReferencePipeline.max(ReferencePipeline.java:698)
        //       at edu.mosk.lombardapp.service.price.impls.PriceHistoryServiceImpl.getLastPriceForProduct(PriceHistoryServiceImpl.java:77)
        //   In order to prevent getLastPriceForProduct(Product)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getLastPriceForProduct(Product).
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<PriceHistory> priceHistoryList = new ArrayList<>();
        priceHistoryList.add(null);
        when(iPriceHistoryMongoRepository.findAll()).thenReturn(priceHistoryList);

        Product product = new Product();
        product.setCreatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        product.setId("42");
        product.setProductCondition(ProductCondition.BELONGTOOWNER);
        product.setProductDescription("Product Description");
        product.setProductName("Product Name");
        product.setProductType(ProductType.TECHNICS);
        product.setProductWeight(10.0d);
        product.setUpdatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        priceHistoryServiceImpl.getLastPriceForProduct(product);
    }

    /**
     * Method under test: {@link PriceHistoryServiceImpl#getLastPriceForProduct(Product)}
     */
    @Test
    void testGetLastPriceForProduct5() {
        Product product = new Product();
        product.setCreatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        product.setId("42");
        product.setProductCondition(ProductCondition.BELONGTOOWNER);
        product.setProductDescription("Product Description");
        product.setProductName("Product Name");
        product.setProductType(ProductType.TECHNICS);
        product.setProductWeight(10.0d);
        product.setUpdatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        PriceHistory priceHistory = mock(PriceHistory.class);
        when(priceHistory.getPrice()).thenReturn(10.0d);
        when(priceHistory.getProduct()).thenReturn(product);

        ArrayList<PriceHistory> priceHistoryList = new ArrayList<>();
        priceHistoryList.add(priceHistory);
        when(iPriceHistoryMongoRepository.findAll()).thenReturn(priceHistoryList);

        Product product1 = new Product();
        product1.setCreatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        product1.setId("42");
        product1.setProductCondition(ProductCondition.BELONGTOOWNER);
        product1.setProductDescription("Product Description");
        product1.setProductName("Product Name");
        product1.setProductType(ProductType.TECHNICS);
        product1.setProductWeight(10.0d);
        product1.setUpdatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        assertEquals(10.0d, priceHistoryServiceImpl.getLastPriceForProduct(product1));
        verify(iPriceHistoryMongoRepository).findAll();
        verify(priceHistory).getPrice();
        verify(priceHistory).getProduct();
    }

    /**
     * Method under test: {@link PriceHistoryServiceImpl#getLastPriceForProduct(Product)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetLastPriceForProduct6() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "edu.mosk.lombardapp.model.price.PriceHistory.getPrice()" because the return value of "java.util.Optional.orElse(Object)" is null
        //       at edu.mosk.lombardapp.service.price.impls.PriceHistoryServiceImpl.getLastPriceForProduct(PriceHistoryServiceImpl.java:79)
        //   In order to prevent getLastPriceForProduct(Product)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getLastPriceForProduct(Product).
        //   See https://diff.blue/R013 to resolve this issue.

        Product product = mock(Product.class);
        doNothing().when(product).setCreatedAt((LocalDateTime) any());
        doNothing().when(product).setId((String) any());
        doNothing().when(product).setProductCondition((ProductCondition) any());
        doNothing().when(product).setProductDescription((String) any());
        doNothing().when(product).setProductName((String) any());
        doNothing().when(product).setProductType((ProductType) any());
        doNothing().when(product).setProductWeight(anyDouble());
        doNothing().when(product).setUpdatedAt((LocalDateTime) any());
        product.setCreatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        product.setId("42");
        product.setProductCondition(ProductCondition.BELONGTOOWNER);
        product.setProductDescription("Product Description");
        product.setProductName("Product Name");
        product.setProductType(ProductType.TECHNICS);
        product.setProductWeight(10.0d);
        product.setUpdatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        PriceHistory priceHistory = mock(PriceHistory.class);
        when(priceHistory.getPrice()).thenReturn(10.0d);
        when(priceHistory.getProduct()).thenReturn(product);

        ArrayList<PriceHistory> priceHistoryList = new ArrayList<>();
        priceHistoryList.add(priceHistory);
        when(iPriceHistoryMongoRepository.findAll()).thenReturn(priceHistoryList);

        Product product1 = new Product();
        product1.setCreatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        product1.setId("42");
        product1.setProductCondition(ProductCondition.BELONGTOOWNER);
        product1.setProductDescription("Product Description");
        product1.setProductName("Product Name");
        product1.setProductType(ProductType.TECHNICS);
        product1.setProductWeight(10.0d);
        product1.setUpdatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        priceHistoryServiceImpl.getLastPriceForProduct(product1);
    }
}

