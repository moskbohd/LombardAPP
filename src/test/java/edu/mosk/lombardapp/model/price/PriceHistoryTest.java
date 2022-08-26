package edu.mosk.lombardapp.model.price;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

import edu.mosk.lombardapp.model.product.Product;
import edu.mosk.lombardapp.model.product.ProductCondition;
import edu.mosk.lombardapp.model.product.ProductType;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;

class PriceHistoryTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PriceHistory#PriceHistory()}
     *   <li>{@link PriceHistory#setCreatedAt(LocalDateTime)}
     *   <li>{@link PriceHistory#setDescription(String)}
     *   <li>{@link PriceHistory#setId(String)}
     *   <li>{@link PriceHistory#setPrice(double)}
     *   <li>{@link PriceHistory#setProduct(Product)}
     *   <li>{@link PriceHistory#toString()}
     *   <li>{@link PriceHistory#getCreatedAt()}
     *   <li>{@link PriceHistory#getDescription()}
     *   <li>{@link PriceHistory#getId()}
     *   <li>{@link PriceHistory#getPrice()}
     *   <li>{@link PriceHistory#getProduct()}
     * </ul>
     */
    @Test
    void testConstructor() {
        PriceHistory actualPriceHistory = new PriceHistory();
        LocalDateTime ofResult = LocalDateTime.of(1, 1, 1, 1, 1);
        actualPriceHistory.setCreatedAt(ofResult);
        actualPriceHistory.setDescription("The characteristics of someone or something");
        actualPriceHistory.setId("42");
        actualPriceHistory.setPrice(10.0d);
        Product product = new Product();
        product.setCreatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        product.setId("42");
        product.setProductCondition(ProductCondition.BELONGTOOWNER);
        product.setProductDescription("Product Description");
        product.setProductName("Product Name");
        product.setProductType(ProductType.TECHNICS);
        product.setProductWeight(10.0d);
        product.setUpdatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        actualPriceHistory.setProduct(product);
        String actualToStringResult = actualPriceHistory.toString();
        assertSame(ofResult, actualPriceHistory.getCreatedAt());
        assertEquals("The characteristics of someone or something", actualPriceHistory.getDescription());
        assertEquals("42", actualPriceHistory.getId());
        assertEquals(10.0d, actualPriceHistory.getPrice());
        assertSame(product, actualPriceHistory.getProduct());
        assertEquals("PriceHistory{id='42', product=Product{id='42', productType=TECHNICS, productCondition=BELONGTOOWNER,"
                + " productName='Product Name', productWeight=10.0, productDescription='Product Description', createdAt"
                + "=0001-01-01T01:01, updatedAt=0001-01-01T01:01}, description='The characteristics of someone or something',"
                + " createdAt=0001-01-01T01:01, price=10.0}", actualToStringResult);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PriceHistory#PriceHistory(String, Product, String, LocalDateTime, double)}
     *   <li>{@link PriceHistory#setCreatedAt(LocalDateTime)}
     *   <li>{@link PriceHistory#setDescription(String)}
     *   <li>{@link PriceHistory#setId(String)}
     *   <li>{@link PriceHistory#setPrice(double)}
     *   <li>{@link PriceHistory#setProduct(Product)}
     *   <li>{@link PriceHistory#toString()}
     *   <li>{@link PriceHistory#getCreatedAt()}
     *   <li>{@link PriceHistory#getDescription()}
     *   <li>{@link PriceHistory#getId()}
     *   <li>{@link PriceHistory#getPrice()}
     *   <li>{@link PriceHistory#getProduct()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        Product product = new Product();
        product.setCreatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        product.setId("42");
        product.setProductCondition(ProductCondition.BELONGTOOWNER);
        product.setProductDescription("Product Description");
        product.setProductName("Product Name");
        product.setProductType(ProductType.TECHNICS);
        product.setProductWeight(10.0d);
        product.setUpdatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        PriceHistory actualPriceHistory = new PriceHistory("42", product, "The characteristics of someone or something",
                LocalDateTime.of(1, 1, 1, 1, 1), 10.0d);
        LocalDateTime ofResult = LocalDateTime.of(1, 1, 1, 1, 1);
        actualPriceHistory.setCreatedAt(ofResult);
        actualPriceHistory.setDescription("The characteristics of someone or something");
        actualPriceHistory.setId("42");
        actualPriceHistory.setPrice(10.0d);
        Product product1 = new Product();
        product1.setCreatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        product1.setId("42");
        product1.setProductCondition(ProductCondition.BELONGTOOWNER);
        product1.setProductDescription("Product Description");
        product1.setProductName("Product Name");
        product1.setProductType(ProductType.TECHNICS);
        product1.setProductWeight(10.0d);
        product1.setUpdatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        actualPriceHistory.setProduct(product1);
        String actualToStringResult = actualPriceHistory.toString();
        assertSame(ofResult, actualPriceHistory.getCreatedAt());
        assertEquals("The characteristics of someone or something", actualPriceHistory.getDescription());
        assertEquals("42", actualPriceHistory.getId());
        assertEquals(10.0d, actualPriceHistory.getPrice());
        Product product2 = actualPriceHistory.getProduct();
        assertSame(product1, product2);
        assertEquals(product, product2);
        assertEquals(
                "PriceHistory{id='42', product=Product{id='42', productType=TECHNICS, productCondition=BELONGTOOWNER,"
                        + " productName='Product Name', productWeight=10.0, productDescription='Product Description', createdAt"
                        + "=0001-01-01T01:01, updatedAt=0001-01-01T01:01}, description='The characteristics of someone or something',"
                        + " createdAt=0001-01-01T01:01, price=10.0}",
                actualToStringResult);
    }

    /**
     * Method under test: {@link PriceHistory#equals(Object)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEquals3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "String.equals(Object)" because "str" is null
        //       at edu.mosk.lombardapp.model.price.PriceHistory.equals(PriceHistory.java:83)
        //   In order to prevent equals(Object)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   equals(Object).
        //   See https://diff.blue/R013 to resolve this issue.

        PriceHistory priceHistory = new PriceHistory();
        assertThrows(NullPointerException.class, () -> priceHistory.equals(new PriceHistory()));
    }

    /**
     * Method under test: {@link PriceHistory#equals(Object)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEquals6() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "edu.mosk.lombardapp.model.product.Product.equals(Object)" because the return value of "edu.mosk.lombardapp.model.price.PriceHistory.getProduct()" is null
        //       at edu.mosk.lombardapp.model.price.PriceHistory.equals(PriceHistory.java:83)
        //   In order to prevent equals(Object)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   equals(Object).
        //   See https://diff.blue/R013 to resolve this issue.

        PriceHistory priceHistory = new PriceHistory();
        priceHistory.setId("42");

        PriceHistory priceHistory1 = new PriceHistory();
        priceHistory1.setId("42");
        assertThrows(NullPointerException.class, () -> priceHistory.equals(priceHistory1));
    }

    /**
     * Method under test: {@link PriceHistory#equals(Object)}
     */
    @Test
    void testEquals() {
        assertNotEquals(new PriceHistory(), null);
        assertNotEquals(new PriceHistory(), "Different type to PriceHistory");
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PriceHistory#equals(Object)}
     *   <li>{@link PriceHistory#hashCode()}
     * </ul>
     */
    @Test
    void testEquals2() {
        PriceHistory priceHistory = new PriceHistory();
        assertEquals(priceHistory, priceHistory);
        int expectedHashCodeResult = priceHistory.hashCode();
        assertEquals(expectedHashCodeResult, priceHistory.hashCode());
    }

    /**
     * Method under test: {@link PriceHistory#equals(Object)}
     */
    @Test
    void testEquals4() {
        PriceHistory priceHistory = new PriceHistory();
        priceHistory.setId("42");
        assertNotEquals(priceHistory, new PriceHistory());
    }

    /**
     * Method under test: {@link PriceHistory#equals(Object)}
     */
    @Test
    void testEquals5() {
        Product product = new Product();
        PriceHistory priceHistory = new PriceHistory("42", product, "The characteristics of someone or something",
                LocalDateTime.of(1, 1, 1, 1, 1), 10.0d);
        assertNotEquals(priceHistory, new PriceHistory());
    }
}

