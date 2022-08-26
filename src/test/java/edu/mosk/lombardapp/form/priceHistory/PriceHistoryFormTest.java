package edu.mosk.lombardapp.form.priceHistory;

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

class PriceHistoryFormTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PriceHistoryForm#PriceHistoryForm()}
     *   <li>{@link PriceHistoryForm#setCreatedAt(LocalDateTime)}
     *   <li>{@link PriceHistoryForm#setDescription(String)}
     *   <li>{@link PriceHistoryForm#setId(String)}
     *   <li>{@link PriceHistoryForm#setPrice(double)}
     *   <li>{@link PriceHistoryForm#setProduct(Product)}
     *   <li>{@link PriceHistoryForm#toString()}
     *   <li>{@link PriceHistoryForm#getCreatedAt()}
     *   <li>{@link PriceHistoryForm#getDescription()}
     *   <li>{@link PriceHistoryForm#getId()}
     *   <li>{@link PriceHistoryForm#getPrice()}
     *   <li>{@link PriceHistoryForm#getProduct()}
     * </ul>
     */
    @Test
    void testConstructor() {
        PriceHistoryForm actualPriceHistoryForm = new PriceHistoryForm();
        LocalDateTime ofResult = LocalDateTime.of(1, 1, 1, 1, 1);
        actualPriceHistoryForm.setCreatedAt(ofResult);
        actualPriceHistoryForm.setDescription("The characteristics of someone or something");
        actualPriceHistoryForm.setId("42");
        actualPriceHistoryForm.setPrice(10.0d);
        Product product = new Product();
        product.setCreatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        product.setId("42");
        product.setProductCondition(ProductCondition.BELONGTOOWNER);
        product.setProductDescription("Product Description");
        product.setProductName("Product Name");
        product.setProductType(ProductType.TECHNICS);
        product.setProductWeight(10.0d);
        product.setUpdatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        actualPriceHistoryForm.setProduct(product);
        String actualToStringResult = actualPriceHistoryForm.toString();
        assertSame(ofResult, actualPriceHistoryForm.getCreatedAt());
        assertEquals("The characteristics of someone or something", actualPriceHistoryForm.getDescription());
        assertEquals("42", actualPriceHistoryForm.getId());
        assertEquals(10.0d, actualPriceHistoryForm.getPrice());
        assertSame(product, actualPriceHistoryForm.getProduct());
        assertEquals("PriceHistory{id='42', product=Product{id='42', productType=TECHNICS, productCondition=BELONGTOOWNER,"
                + " productName='Product Name', productWeight=10.0, productDescription='Product Description', createdAt"
                + "=0001-01-01T01:01, updatedAt=0001-01-01T01:01}, description='The characteristics of someone or something',"
                + " createdAt=0001-01-01T01:01, price=10.0}", actualToStringResult);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PriceHistoryForm#PriceHistoryForm(String, Product, String, LocalDateTime, double)}
     *   <li>{@link PriceHistoryForm#setCreatedAt(LocalDateTime)}
     *   <li>{@link PriceHistoryForm#setDescription(String)}
     *   <li>{@link PriceHistoryForm#setId(String)}
     *   <li>{@link PriceHistoryForm#setPrice(double)}
     *   <li>{@link PriceHistoryForm#setProduct(Product)}
     *   <li>{@link PriceHistoryForm#toString()}
     *   <li>{@link PriceHistoryForm#getCreatedAt()}
     *   <li>{@link PriceHistoryForm#getDescription()}
     *   <li>{@link PriceHistoryForm#getId()}
     *   <li>{@link PriceHistoryForm#getPrice()}
     *   <li>{@link PriceHistoryForm#getProduct()}
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
        PriceHistoryForm actualPriceHistoryForm = new PriceHistoryForm("42", product,
                "The characteristics of someone or something", LocalDateTime.of(1, 1, 1, 1, 1), 10.0d);
        LocalDateTime ofResult = LocalDateTime.of(1, 1, 1, 1, 1);
        actualPriceHistoryForm.setCreatedAt(ofResult);
        actualPriceHistoryForm.setDescription("The characteristics of someone or something");
        actualPriceHistoryForm.setId("42");
        actualPriceHistoryForm.setPrice(10.0d);
        Product product1 = new Product();
        product1.setCreatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        product1.setId("42");
        product1.setProductCondition(ProductCondition.BELONGTOOWNER);
        product1.setProductDescription("Product Description");
        product1.setProductName("Product Name");
        product1.setProductType(ProductType.TECHNICS);
        product1.setProductWeight(10.0d);
        product1.setUpdatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        actualPriceHistoryForm.setProduct(product1);
        String actualToStringResult = actualPriceHistoryForm.toString();
        assertSame(ofResult, actualPriceHistoryForm.getCreatedAt());
        assertEquals("The characteristics of someone or something", actualPriceHistoryForm.getDescription());
        assertEquals("42", actualPriceHistoryForm.getId());
        assertEquals(10.0d, actualPriceHistoryForm.getPrice());
        Product product2 = actualPriceHistoryForm.getProduct();
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
     * Method under test: {@link PriceHistoryForm#equals(Object)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEquals3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.equals(Object)" because "obj" is null
        //       at edu.mosk.lombardapp.form.priceHistory.PriceHistoryForm.equals(PriceHistoryForm.java:80)
        //   In order to prevent equals(Object)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   equals(Object).
        //   See https://diff.blue/R013 to resolve this issue.

        PriceHistoryForm priceHistoryForm = new PriceHistoryForm();
        assertThrows(NullPointerException.class, () -> priceHistoryForm.equals(new PriceHistoryForm()));
    }

    /**
     * Method under test: {@link PriceHistoryForm#equals(Object)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEquals6() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "edu.mosk.lombardapp.model.product.Product.equals(Object)" because the return value of "edu.mosk.lombardapp.form.priceHistory.PriceHistoryForm.getProduct()" is null
        //       at edu.mosk.lombardapp.form.priceHistory.PriceHistoryForm.equals(PriceHistoryForm.java:80)
        //   In order to prevent equals(Object)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   equals(Object).
        //   See https://diff.blue/R013 to resolve this issue.

        PriceHistoryForm priceHistoryForm = new PriceHistoryForm();
        priceHistoryForm.setId("42");

        PriceHistoryForm priceHistoryForm1 = new PriceHistoryForm();
        priceHistoryForm1.setId("42");
        assertThrows(NullPointerException.class, () -> priceHistoryForm.equals(priceHistoryForm1));
    }

    /**
     * Method under test: {@link PriceHistoryForm#equals(Object)}
     */
    @Test
    void testEquals() {
        assertNotEquals(new PriceHistoryForm(), null);
        assertNotEquals(new PriceHistoryForm(), "Different type to PriceHistoryForm");
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PriceHistoryForm#equals(Object)}
     *   <li>{@link PriceHistoryForm#hashCode()}
     * </ul>
     */
    @Test
    void testEquals2() {
        PriceHistoryForm priceHistoryForm = new PriceHistoryForm();
        assertEquals(priceHistoryForm, priceHistoryForm);
        int expectedHashCodeResult = priceHistoryForm.hashCode();
        assertEquals(expectedHashCodeResult, priceHistoryForm.hashCode());
    }

    /**
     * Method under test: {@link PriceHistoryForm#equals(Object)}
     */
    @Test
    void testEquals4() {
        PriceHistoryForm priceHistoryForm = new PriceHistoryForm();
        priceHistoryForm.setId("42");
        assertNotEquals(priceHistoryForm, new PriceHistoryForm());
    }

    /**
     * Method under test: {@link PriceHistoryForm#equals(Object)}
     */
    @Test
    void testEquals5() {
        Product product = new Product();
        PriceHistoryForm priceHistoryForm = new PriceHistoryForm("42", product,
                "The characteristics of someone or something", LocalDateTime.of(1, 1, 1, 1, 1), 10.0d);
        assertNotEquals(priceHistoryForm, new PriceHistoryForm());
    }
}

