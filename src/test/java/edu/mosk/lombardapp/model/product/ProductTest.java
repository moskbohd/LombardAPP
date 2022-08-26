package edu.mosk.lombardapp.model.product;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;

class ProductTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Product#Product()}
     *   <li>{@link Product#setCreatedAt(LocalDateTime)}
     *   <li>{@link Product#setId(String)}
     *   <li>{@link Product#setProductCondition(ProductCondition)}
     *   <li>{@link Product#setProductDescription(String)}
     *   <li>{@link Product#setProductName(String)}
     *   <li>{@link Product#setProductType(ProductType)}
     *   <li>{@link Product#setProductWeight(double)}
     *   <li>{@link Product#setUpdatedAt(LocalDateTime)}
     *   <li>{@link Product#toString()}
     *   <li>{@link Product#getCreatedAt()}
     *   <li>{@link Product#getId()}
     *   <li>{@link Product#getProductCondition()}
     *   <li>{@link Product#getProductDescription()}
     *   <li>{@link Product#getProductName()}
     *   <li>{@link Product#getProductType()}
     *   <li>{@link Product#getProductWeight()}
     *   <li>{@link Product#getUpdatedAt()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Product actualProduct = new Product();
        LocalDateTime ofResult = LocalDateTime.of(1, 1, 1, 1, 1);
        actualProduct.setCreatedAt(ofResult);
        actualProduct.setId("42");
        actualProduct.setProductCondition(ProductCondition.BELONGTOOWNER);
        actualProduct.setProductDescription("Product Description");
        actualProduct.setProductName("Product Name");
        actualProduct.setProductType(ProductType.TECHNICS);
        actualProduct.setProductWeight(10.0d);
        LocalDateTime ofResult1 = LocalDateTime.of(1, 1, 1, 1, 1);
        actualProduct.setUpdatedAt(ofResult1);
        String actualToStringResult = actualProduct.toString();
        assertSame(ofResult, actualProduct.getCreatedAt());
        assertEquals("42", actualProduct.getId());
        assertEquals(ProductCondition.BELONGTOOWNER, actualProduct.getProductCondition());
        assertEquals("Product Description", actualProduct.getProductDescription());
        assertEquals("Product Name", actualProduct.getProductName());
        assertEquals(ProductType.TECHNICS, actualProduct.getProductType());
        assertEquals(10.0d, actualProduct.getProductWeight());
        assertSame(ofResult1, actualProduct.getUpdatedAt());
        assertEquals("Product{id='42', productType=TECHNICS, productCondition=BELONGTOOWNER, productName='Product Name',"
                + " productWeight=10.0, productDescription='Product Description', createdAt=0001-01-01T01:01, updatedAt"
                + "=0001-01-01T01:01}", actualToStringResult);
    }

    /**
     * Method under test: {@link Product#Product(String, ProductType, ProductCondition, String, double, String, LocalDateTime)}
     */
    @Test
    void testConstructor2() {
        Product actualProduct = new Product("42", ProductType.TECHNICS, ProductCondition.BELONGTOOWNER, "Product Name",
                10.0d, "Product Description", LocalDateTime.of(1, 1, 1, 1, 1));

        assertEquals("01:01", actualProduct.getCreatedAt().toLocalTime().toString());
        assertEquals(10.0d, actualProduct.getProductWeight());
        assertEquals(ProductType.TECHNICS, actualProduct.getProductType());
        assertEquals("Product Name", actualProduct.getProductName());
        assertEquals("Product Description", actualProduct.getProductDescription());
        assertEquals(ProductCondition.BELONGTOOWNER, actualProduct.getProductCondition());
        assertEquals("42", actualProduct.getId());
    }

    /**
     * Method under test: {@link Product#Product(String, ProductType, ProductCondition, String, double, String, LocalDateTime)}
     */
    @Test
    void testConstructor3() {
        Product actualProduct = new Product("42", ProductType.JEWELER, ProductCondition.BELONGTOOWNER, "Product Name",
                10.0d, "Product Description", LocalDateTime.of(1, 1, 1, 1, 1));

        assertEquals("01:01", actualProduct.getCreatedAt().toLocalTime().toString());
        assertEquals(10.0d, actualProduct.getProductWeight());
        assertEquals(ProductType.JEWELER, actualProduct.getProductType());
        assertEquals("Product Name", actualProduct.getProductName());
        assertEquals("Product Description", actualProduct.getProductDescription());
        assertEquals(ProductCondition.BELONGTOOWNER, actualProduct.getProductCondition());
        assertEquals("42", actualProduct.getId());
    }

    /**
     * Method under test: {@link Product#Product(String, ProductType, ProductCondition, String, double, String, LocalDateTime)}
     */
    @Test
    void testConstructor4() {
        Product actualProduct = new Product("42", ProductType.TOYS, ProductCondition.BELONGTOOWNER, "Product Name", 10.0d,
                "Product Description", LocalDateTime.of(1, 1, 1, 1, 1));

        assertEquals("01:01", actualProduct.getCreatedAt().toLocalTime().toString());
        assertEquals(10.0d, actualProduct.getProductWeight());
        assertEquals(ProductType.TOYS, actualProduct.getProductType());
        assertEquals("Product Name", actualProduct.getProductName());
        assertEquals("Product Description", actualProduct.getProductDescription());
        assertEquals(ProductCondition.BELONGTOOWNER, actualProduct.getProductCondition());
        assertEquals("42", actualProduct.getId());
    }

    /**
     * Method under test: {@link Product#Product(String, ProductType, ProductCondition, String, double, String, LocalDateTime)}
     */
    @Test
    void testConstructor5() {
        Product actualProduct = new Product("42", ProductType.CLOTHES, ProductCondition.BELONGTOOWNER, "Product Name",
                10.0d, "Product Description", LocalDateTime.of(1, 1, 1, 1, 1));

        assertEquals("01:01", actualProduct.getCreatedAt().toLocalTime().toString());
        assertEquals(10.0d, actualProduct.getProductWeight());
        assertEquals(ProductType.CLOTHES, actualProduct.getProductType());
        assertEquals("Product Name", actualProduct.getProductName());
        assertEquals("Product Description", actualProduct.getProductDescription());
        assertEquals(ProductCondition.BELONGTOOWNER, actualProduct.getProductCondition());
        assertEquals("42", actualProduct.getId());
    }

    /**
     * Method under test: {@link Product#Product(String, ProductType, ProductCondition, String, double, String, LocalDateTime)}
     */
    @Test
    void testConstructor6() {
        Product actualProduct = new Product("42", ProductType.OTHERS, ProductCondition.BELONGTOOWNER, "Product Name",
                10.0d, "Product Description", LocalDateTime.of(1, 1, 1, 1, 1));

        assertEquals("01:01", actualProduct.getCreatedAt().toLocalTime().toString());
        assertEquals(10.0d, actualProduct.getProductWeight());
        assertEquals(ProductType.OTHERS, actualProduct.getProductType());
        assertEquals("Product Name", actualProduct.getProductName());
        assertEquals("Product Description", actualProduct.getProductDescription());
        assertEquals(ProductCondition.BELONGTOOWNER, actualProduct.getProductCondition());
        assertEquals("42", actualProduct.getId());
    }

    /**
     * Method under test: {@link Product#Product(String, ProductType, ProductCondition, String, double, String, LocalDateTime, LocalDateTime)}
     */
    @Test
    void testConstructor7() {
        LocalDateTime createdAt = LocalDateTime.of(1, 1, 1, 1, 1);
        Product actualProduct = new Product("42", ProductType.TECHNICS, ProductCondition.BELONGTOOWNER, "Name", 10.0d,
                "Product Description", createdAt, LocalDateTime.of(1, 1, 1, 1, 1));

        assertEquals("01:01", actualProduct.getCreatedAt().toLocalTime().toString());
        assertEquals("01:01", actualProduct.getUpdatedAt().toLocalTime().toString());
        assertEquals(10.0d, actualProduct.getProductWeight());
        assertEquals(ProductType.TECHNICS, actualProduct.getProductType());
        assertEquals("Name", actualProduct.getProductName());
        assertEquals("Product Description", actualProduct.getProductDescription());
        assertEquals(ProductCondition.BELONGTOOWNER, actualProduct.getProductCondition());
        assertEquals("42", actualProduct.getId());
    }

    /**
     * Method under test: {@link Product#Product(String, ProductType, ProductCondition, String, double, String, LocalDateTime, LocalDateTime)}
     */
    @Test
    void testConstructor8() {
        LocalDateTime createdAt = LocalDateTime.of(1, 1, 1, 1, 1);
        Product actualProduct = new Product("42", ProductType.JEWELER, ProductCondition.BELONGTOOWNER, "Name", 10.0d,
                "Product Description", createdAt, LocalDateTime.of(1, 1, 1, 1, 1));

        assertEquals("01:01", actualProduct.getCreatedAt().toLocalTime().toString());
        assertEquals("01:01", actualProduct.getUpdatedAt().toLocalTime().toString());
        assertEquals(10.0d, actualProduct.getProductWeight());
        assertEquals(ProductType.JEWELER, actualProduct.getProductType());
        assertEquals("Name", actualProduct.getProductName());
        assertEquals("Product Description", actualProduct.getProductDescription());
        assertEquals(ProductCondition.BELONGTOOWNER, actualProduct.getProductCondition());
        assertEquals("42", actualProduct.getId());
    }

    /**
     * Method under test: {@link Product#Product(String, ProductType, ProductCondition, String, double, String, LocalDateTime, LocalDateTime)}
     */
    @Test
    void testConstructor9() {
        LocalDateTime createdAt = LocalDateTime.of(1, 1, 1, 1, 1);
        Product actualProduct = new Product("42", ProductType.TOYS, ProductCondition.BELONGTOOWNER, "Name", 10.0d,
                "Product Description", createdAt, LocalDateTime.of(1, 1, 1, 1, 1));

        assertEquals("01:01", actualProduct.getCreatedAt().toLocalTime().toString());
        assertEquals("01:01", actualProduct.getUpdatedAt().toLocalTime().toString());
        assertEquals(10.0d, actualProduct.getProductWeight());
        assertEquals(ProductType.TOYS, actualProduct.getProductType());
        assertEquals("Name", actualProduct.getProductName());
        assertEquals("Product Description", actualProduct.getProductDescription());
        assertEquals(ProductCondition.BELONGTOOWNER, actualProduct.getProductCondition());
        assertEquals("42", actualProduct.getId());
    }

    /**
     * Method under test: {@link Product#Product(String, ProductType, ProductCondition, String, double, String, LocalDateTime, LocalDateTime)}
     */
    @Test
    void testConstructor10() {
        LocalDateTime createdAt = LocalDateTime.of(1, 1, 1, 1, 1);
        Product actualProduct = new Product("42", ProductType.CLOTHES, ProductCondition.BELONGTOOWNER, "Name", 10.0d,
                "Product Description", createdAt, LocalDateTime.of(1, 1, 1, 1, 1));

        assertEquals("01:01", actualProduct.getCreatedAt().toLocalTime().toString());
        assertEquals("01:01", actualProduct.getUpdatedAt().toLocalTime().toString());
        assertEquals(10.0d, actualProduct.getProductWeight());
        assertEquals(ProductType.CLOTHES, actualProduct.getProductType());
        assertEquals("Name", actualProduct.getProductName());
        assertEquals("Product Description", actualProduct.getProductDescription());
        assertEquals(ProductCondition.BELONGTOOWNER, actualProduct.getProductCondition());
        assertEquals("42", actualProduct.getId());
    }

    /**
     * Method under test: {@link Product#Product(String, ProductType, ProductCondition, String, double, String, LocalDateTime, LocalDateTime)}
     */
    @Test
    void testConstructor11() {
        LocalDateTime createdAt = LocalDateTime.of(1, 1, 1, 1, 1);
        Product actualProduct = new Product("42", ProductType.OTHERS, ProductCondition.BELONGTOOWNER, "Name", 10.0d,
                "Product Description", createdAt, LocalDateTime.of(1, 1, 1, 1, 1));

        assertEquals("01:01", actualProduct.getCreatedAt().toLocalTime().toString());
        assertEquals("01:01", actualProduct.getUpdatedAt().toLocalTime().toString());
        assertEquals(10.0d, actualProduct.getProductWeight());
        assertEquals(ProductType.OTHERS, actualProduct.getProductType());
        assertEquals("Name", actualProduct.getProductName());
        assertEquals("Product Description", actualProduct.getProductDescription());
        assertEquals(ProductCondition.BELONGTOOWNER, actualProduct.getProductCondition());
        assertEquals("42", actualProduct.getId());
    }

    /**
     * Method under test: {@link Product#equals(Object)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEquals6() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.time.LocalDateTime.equals(Object)" because the return value of "edu.mosk.lombardapp.model.product.Product.getCreatedAt()" is null
        //       at edu.mosk.lombardapp.model.product.Product.equals(Product.java:122)
        //   In order to prevent equals(Object)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   equals(Object).
        //   See https://diff.blue/R013 to resolve this issue.

        Product product = new Product();
        product.setCreatedAt(null);
        product.setId("42");
        product.setProductCondition(ProductCondition.BELONGTOOWNER);
        product.setProductDescription("Product Description");
        product.setProductName("Product Name");
        product.setProductType(ProductType.TECHNICS);
        product.setProductWeight(10.0d);
        product.setUpdatedAt(LocalDateTime.of(1, 1, 1, 1, 1));

        Product product1 = new Product();
        product1.setCreatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        product1.setId("42");
        product1.setProductCondition(ProductCondition.BELONGTOOWNER);
        product1.setProductDescription("Product Description");
        product1.setProductName("Product Name");
        product1.setProductType(ProductType.TECHNICS);
        product1.setProductWeight(10.0d);
        product1.setUpdatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        assertThrows(NullPointerException.class, () -> product.equals(product1));
    }

    /**
     * Method under test: {@link Product#equals(Object)}
     */
    @Test
    void testEquals() {
        Product product = new Product();
        product.setCreatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        product.setId("42");
        product.setProductCondition(ProductCondition.BELONGTOOWNER);
        product.setProductDescription("Product Description");
        product.setProductName("Product Name");
        product.setProductType(ProductType.TECHNICS);
        product.setProductWeight(10.0d);
        product.setUpdatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        assertNotEquals(product, null);
    }

    /**
     * Method under test: {@link Product#equals(Object)}
     */
    @Test
    void testEquals2() {
        Product product = new Product();
        product.setCreatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        product.setId("42");
        product.setProductCondition(ProductCondition.BELONGTOOWNER);
        product.setProductDescription("Product Description");
        product.setProductName("Product Name");
        product.setProductType(ProductType.TECHNICS);
        product.setProductWeight(10.0d);
        product.setUpdatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        assertNotEquals(product, "Different type to Product");
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Product#equals(Object)}
     *   <li>{@link Product#hashCode()}
     * </ul>
     */
    @Test
    void testEquals3() {
        Product product = new Product();
        product.setCreatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        product.setId("42");
        product.setProductCondition(ProductCondition.BELONGTOOWNER);
        product.setProductDescription("Product Description");
        product.setProductName("Product Name");
        product.setProductType(ProductType.TECHNICS);
        product.setProductWeight(10.0d);
        product.setUpdatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        assertEquals(product, product);
        int expectedHashCodeResult = product.hashCode();
        assertEquals(expectedHashCodeResult, product.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Product#equals(Object)}
     *   <li>{@link Product#hashCode()}
     * </ul>
     */
    @Test
    void testEquals4() {
        Product product = new Product();
        product.setCreatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        product.setId("42");
        product.setProductCondition(ProductCondition.BELONGTOOWNER);
        product.setProductDescription("Product Description");
        product.setProductName("Product Name");
        product.setProductType(ProductType.TECHNICS);
        product.setProductWeight(10.0d);
        product.setUpdatedAt(LocalDateTime.of(1, 1, 1, 1, 1));

        Product product1 = new Product();
        product1.setCreatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        product1.setId("42");
        product1.setProductCondition(ProductCondition.BELONGTOOWNER);
        product1.setProductDescription("Product Description");
        product1.setProductName("Product Name");
        product1.setProductType(ProductType.TECHNICS);
        product1.setProductWeight(10.0d);
        product1.setUpdatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        assertEquals(product, product1);
        int expectedHashCodeResult = product.hashCode();
        assertEquals(expectedHashCodeResult, product1.hashCode());
    }

    /**
     * Method under test: {@link Product#equals(Object)}
     */
    @Test
    void testEquals5() {
        Product product = new Product();
        product.setCreatedAt(LocalDateTime.of(0, 1, 1, 1, 1));
        product.setId("42");
        product.setProductCondition(ProductCondition.BELONGTOOWNER);
        product.setProductDescription("Product Description");
        product.setProductName("Product Name");
        product.setProductType(ProductType.TECHNICS);
        product.setProductWeight(10.0d);
        product.setUpdatedAt(LocalDateTime.of(1, 1, 1, 1, 1));

        Product product1 = new Product();
        product1.setCreatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        product1.setId("42");
        product1.setProductCondition(ProductCondition.BELONGTOOWNER);
        product1.setProductDescription("Product Description");
        product1.setProductName("Product Name");
        product1.setProductType(ProductType.TECHNICS);
        product1.setProductWeight(10.0d);
        product1.setUpdatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        assertNotEquals(product, product1);
    }

    /**
     * Method under test: {@link Product#equals(Object)}
     */
    @Test
    void testEquals7() {
        Product product = new Product();
        product.setCreatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        product.setId("Product Name");
        product.setProductCondition(ProductCondition.BELONGTOOWNER);
        product.setProductDescription("Product Description");
        product.setProductName("Product Name");
        product.setProductType(ProductType.TECHNICS);
        product.setProductWeight(10.0d);
        product.setUpdatedAt(LocalDateTime.of(1, 1, 1, 1, 1));

        Product product1 = new Product();
        product1.setCreatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        product1.setId("42");
        product1.setProductCondition(ProductCondition.BELONGTOOWNER);
        product1.setProductDescription("Product Description");
        product1.setProductName("Product Name");
        product1.setProductType(ProductType.TECHNICS);
        product1.setProductWeight(10.0d);
        product1.setUpdatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        assertNotEquals(product, product1);
    }

    /**
     * Method under test: {@link Product#equals(Object)}
     */
    @Test
    void testEquals8() {
        Product product = new Product();
        product.setCreatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        product.setId("42");
        product.setProductCondition(ProductCondition.BELONGTOLOMBARD);
        product.setProductDescription("Product Description");
        product.setProductName("Product Name");
        product.setProductType(ProductType.TECHNICS);
        product.setProductWeight(10.0d);
        product.setUpdatedAt(LocalDateTime.of(1, 1, 1, 1, 1));

        Product product1 = new Product();
        product1.setCreatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        product1.setId("42");
        product1.setProductCondition(ProductCondition.BELONGTOOWNER);
        product1.setProductDescription("Product Description");
        product1.setProductName("Product Name");
        product1.setProductType(ProductType.TECHNICS);
        product1.setProductWeight(10.0d);
        product1.setUpdatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        assertNotEquals(product, product1);
    }

    /**
     * Method under test: {@link Product#equals(Object)}
     */
    @Test
    void testEquals9() {
        Product product = new Product();
        product.setCreatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        product.setId("42");
        product.setProductCondition(ProductCondition.BELONGTOOWNER);
        product.setProductDescription("42");
        product.setProductName("Product Name");
        product.setProductType(ProductType.TECHNICS);
        product.setProductWeight(10.0d);
        product.setUpdatedAt(LocalDateTime.of(1, 1, 1, 1, 1));

        Product product1 = new Product();
        product1.setCreatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        product1.setId("42");
        product1.setProductCondition(ProductCondition.BELONGTOOWNER);
        product1.setProductDescription("Product Description");
        product1.setProductName("Product Name");
        product1.setProductType(ProductType.TECHNICS);
        product1.setProductWeight(10.0d);
        product1.setUpdatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        assertNotEquals(product, product1);
    }

    /**
     * Method under test: {@link Product#equals(Object)}
     */
    @Test
    void testEquals10() {
        Product product = new Product();
        product.setCreatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        product.setId("42");
        product.setProductCondition(ProductCondition.BELONGTOOWNER);
        product.setProductDescription("Product Description");
        product.setProductName("42");
        product.setProductType(ProductType.TECHNICS);
        product.setProductWeight(10.0d);
        product.setUpdatedAt(LocalDateTime.of(1, 1, 1, 1, 1));

        Product product1 = new Product();
        product1.setCreatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        product1.setId("42");
        product1.setProductCondition(ProductCondition.BELONGTOOWNER);
        product1.setProductDescription("Product Description");
        product1.setProductName("Product Name");
        product1.setProductType(ProductType.TECHNICS);
        product1.setProductWeight(10.0d);
        product1.setUpdatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        assertNotEquals(product, product1);
    }

    /**
     * Method under test: {@link Product#equals(Object)}
     */
    @Test
    void testEquals11() {
        Product product = new Product();
        product.setCreatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        product.setId("42");
        product.setProductCondition(ProductCondition.BELONGTOOWNER);
        product.setProductDescription("Product Description");
        product.setProductName("Product Name");
        product.setProductType(ProductType.JEWELER);
        product.setProductWeight(10.0d);
        product.setUpdatedAt(LocalDateTime.of(1, 1, 1, 1, 1));

        Product product1 = new Product();
        product1.setCreatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        product1.setId("42");
        product1.setProductCondition(ProductCondition.BELONGTOOWNER);
        product1.setProductDescription("Product Description");
        product1.setProductName("Product Name");
        product1.setProductType(ProductType.TECHNICS);
        product1.setProductWeight(10.0d);
        product1.setUpdatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        assertNotEquals(product, product1);
    }

    /**
     * Method under test: {@link Product#equals(Object)}
     */
    @Test
    void testEquals12() {
        Product product = new Product();
        product.setCreatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        product.setId("42");
        product.setProductCondition(ProductCondition.BELONGTOOWNER);
        product.setProductDescription("Product Description");
        product.setProductName("Product Name");
        product.setProductType(ProductType.TECHNICS);
        product.setProductWeight(0.5d);
        product.setUpdatedAt(LocalDateTime.of(1, 1, 1, 1, 1));

        Product product1 = new Product();
        product1.setCreatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        product1.setId("42");
        product1.setProductCondition(ProductCondition.BELONGTOOWNER);
        product1.setProductDescription("Product Description");
        product1.setProductName("Product Name");
        product1.setProductType(ProductType.TECHNICS);
        product1.setProductWeight(10.0d);
        product1.setUpdatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        assertNotEquals(product, product1);
    }

    /**
     * Method under test: {@link Product#equals(Object)}
     */
    @Test
    void testEquals13() {
        Product product = new Product();
        product.setCreatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        product.setId("42");
        product.setProductCondition(ProductCondition.BELONGTOOWNER);
        product.setProductDescription("Product Description");
        product.setProductName("Product Name");
        product.setProductType(ProductType.TECHNICS);
        product.setProductWeight(10.0d);
        product.setUpdatedAt(LocalDateTime.of(0, 1, 1, 1, 1));

        Product product1 = new Product();
        product1.setCreatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        product1.setId("42");
        product1.setProductCondition(ProductCondition.BELONGTOOWNER);
        product1.setProductDescription("Product Description");
        product1.setProductName("Product Name");
        product1.setProductType(ProductType.TECHNICS);
        product1.setProductWeight(10.0d);
        product1.setUpdatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        assertNotEquals(product, product1);
    }
}

