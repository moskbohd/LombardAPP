package edu.mosk.lombardapp.form.product;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import edu.mosk.lombardapp.model.product.Product;
import edu.mosk.lombardapp.model.product.ProductCondition;
import edu.mosk.lombardapp.model.product.ProductType;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;

class ProductFormTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ProductForm#ProductForm()}
     *   <li>{@link ProductForm#setCreatedAt(LocalDateTime)}
     *   <li>{@link ProductForm#setId(String)}
     *   <li>{@link ProductForm#setProductCondition(ProductCondition)}
     *   <li>{@link ProductForm#setProductDescription(String)}
     *   <li>{@link ProductForm#setProductName(String)}
     *   <li>{@link ProductForm#setProductType(ProductType)}
     *   <li>{@link ProductForm#setProductWeight(double)}
     *   <li>{@link ProductForm#setUpdatedAt(LocalDateTime)}
     *   <li>{@link ProductForm#toString()}
     *   <li>{@link ProductForm#getCreatedAt()}
     *   <li>{@link ProductForm#getId()}
     *   <li>{@link ProductForm#getProductCondition()}
     *   <li>{@link ProductForm#getProductDescription()}
     *   <li>{@link ProductForm#getProductName()}
     *   <li>{@link ProductForm#getProductType()}
     *   <li>{@link ProductForm#getProductWeight()}
     *   <li>{@link ProductForm#getUpdatedAt()}
     * </ul>
     */
    @Test
    void testConstructor() {
        ProductForm actualProductForm = new ProductForm();
        LocalDateTime ofResult = LocalDateTime.of(1, 1, 1, 1, 1);
        actualProductForm.setCreatedAt(ofResult);
        actualProductForm.setId("42");
        actualProductForm.setProductCondition(ProductCondition.BELONGTOOWNER);
        actualProductForm.setProductDescription("Product Description");
        actualProductForm.setProductName("Product Name");
        actualProductForm.setProductType(ProductType.TECHNICS);
        actualProductForm.setProductWeight(10.0d);
        LocalDateTime ofResult1 = LocalDateTime.of(1, 1, 1, 1, 1);
        actualProductForm.setUpdatedAt(ofResult1);
        String actualToStringResult = actualProductForm.toString();
        assertSame(ofResult, actualProductForm.getCreatedAt());
        assertEquals("42", actualProductForm.getId());
        assertEquals(ProductCondition.BELONGTOOWNER, actualProductForm.getProductCondition());
        assertEquals("Product Description", actualProductForm.getProductDescription());
        assertEquals("Product Name", actualProductForm.getProductName());
        assertEquals(ProductType.TECHNICS, actualProductForm.getProductType());
        assertEquals(10.0d, actualProductForm.getProductWeight());
        assertSame(ofResult1, actualProductForm.getUpdatedAt());
        assertEquals("Product{id='42', productType=TECHNICS, productCondition=BELONGTOOWNER, productName='Product Name',"
                + " productWeight=10.0, productDescription='Product Description', createdAt=0001-01-01T01:01, updatedAt"
                + "=0001-01-01T01:01}", actualToStringResult);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ProductForm#ProductForm(String, String)}
     *   <li>{@link ProductForm#setCreatedAt(LocalDateTime)}
     *   <li>{@link ProductForm#setId(String)}
     *   <li>{@link ProductForm#setProductCondition(ProductCondition)}
     *   <li>{@link ProductForm#setProductDescription(String)}
     *   <li>{@link ProductForm#setProductName(String)}
     *   <li>{@link ProductForm#setProductType(ProductType)}
     *   <li>{@link ProductForm#setProductWeight(double)}
     *   <li>{@link ProductForm#setUpdatedAt(LocalDateTime)}
     *   <li>{@link ProductForm#toString()}
     *   <li>{@link ProductForm#getCreatedAt()}
     *   <li>{@link ProductForm#getId()}
     *   <li>{@link ProductForm#getProductCondition()}
     *   <li>{@link ProductForm#getProductDescription()}
     *   <li>{@link ProductForm#getProductName()}
     *   <li>{@link ProductForm#getProductType()}
     *   <li>{@link ProductForm#getProductWeight()}
     *   <li>{@link ProductForm#getUpdatedAt()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        ProductForm actualProductForm = new ProductForm("Name", "Product Description");
        LocalDateTime ofResult = LocalDateTime.of(1, 1, 1, 1, 1);
        actualProductForm.setCreatedAt(ofResult);
        actualProductForm.setId("42");
        actualProductForm.setProductCondition(ProductCondition.BELONGTOOWNER);
        actualProductForm.setProductDescription("Product Description");
        actualProductForm.setProductName("Product Name");
        actualProductForm.setProductType(ProductType.TECHNICS);
        actualProductForm.setProductWeight(10.0d);
        LocalDateTime ofResult1 = LocalDateTime.of(1, 1, 1, 1, 1);
        actualProductForm.setUpdatedAt(ofResult1);
        String actualToStringResult = actualProductForm.toString();
        assertSame(ofResult, actualProductForm.getCreatedAt());
        assertEquals("42", actualProductForm.getId());
        assertEquals(ProductCondition.BELONGTOOWNER, actualProductForm.getProductCondition());
        assertEquals("Product Description", actualProductForm.getProductDescription());
        assertEquals("Product Name", actualProductForm.getProductName());
        assertEquals(ProductType.TECHNICS, actualProductForm.getProductType());
        assertEquals(10.0d, actualProductForm.getProductWeight());
        assertSame(ofResult1, actualProductForm.getUpdatedAt());
        assertEquals("Product{id='42', productType=TECHNICS, productCondition=BELONGTOOWNER, productName='Product Name',"
                + " productWeight=10.0, productDescription='Product Description', createdAt=0001-01-01T01:01, updatedAt"
                + "=0001-01-01T01:01}", actualToStringResult);
    }

    /**
     * Method under test: {@link ProductForm#ProductForm(String, ProductType, ProductCondition, String, double, String, LocalDateTime)}
     */
    @Test
    void testConstructor3() {
        ProductForm actualProductForm = new ProductForm("42", ProductType.TECHNICS, ProductCondition.BELONGTOOWNER,
                "Product Name", 10.0d, "Product Description", LocalDateTime.of(1, 1, 1, 1, 1));

        assertEquals("01:01", actualProductForm.getCreatedAt().toLocalTime().toString());
        assertEquals(10.0d, actualProductForm.getProductWeight());
        assertEquals(ProductType.TECHNICS, actualProductForm.getProductType());
        assertEquals("Product Name", actualProductForm.getProductName());
        assertEquals("Product Description", actualProductForm.getProductDescription());
        assertEquals(ProductCondition.BELONGTOOWNER, actualProductForm.getProductCondition());
        assertEquals("42", actualProductForm.getId());
    }

    /**
     * Method under test: {@link ProductForm#ProductForm(String, ProductType, ProductCondition, String, double, String, LocalDateTime)}
     */
    @Test
    void testConstructor4() {
        ProductForm actualProductForm = new ProductForm("42", ProductType.JEWELER, ProductCondition.BELONGTOOWNER,
                "Product Name", 10.0d, "Product Description", LocalDateTime.of(1, 1, 1, 1, 1));

        assertEquals("01:01", actualProductForm.getCreatedAt().toLocalTime().toString());
        assertEquals(10.0d, actualProductForm.getProductWeight());
        assertEquals(ProductType.JEWELER, actualProductForm.getProductType());
        assertEquals("Product Name", actualProductForm.getProductName());
        assertEquals("Product Description", actualProductForm.getProductDescription());
        assertEquals(ProductCondition.BELONGTOOWNER, actualProductForm.getProductCondition());
        assertEquals("42", actualProductForm.getId());
    }

    /**
     * Method under test: {@link ProductForm#ProductForm(String, ProductType, ProductCondition, String, double, String, LocalDateTime)}
     */
    @Test
    void testConstructor5() {
        ProductForm actualProductForm = new ProductForm("42", ProductType.TOYS, ProductCondition.BELONGTOOWNER,
                "Product Name", 10.0d, "Product Description", LocalDateTime.of(1, 1, 1, 1, 1));

        assertEquals("01:01", actualProductForm.getCreatedAt().toLocalTime().toString());
        assertEquals(10.0d, actualProductForm.getProductWeight());
        assertEquals(ProductType.TOYS, actualProductForm.getProductType());
        assertEquals("Product Name", actualProductForm.getProductName());
        assertEquals("Product Description", actualProductForm.getProductDescription());
        assertEquals(ProductCondition.BELONGTOOWNER, actualProductForm.getProductCondition());
        assertEquals("42", actualProductForm.getId());
    }

    /**
     * Method under test: {@link ProductForm#ProductForm(String, ProductType, ProductCondition, String, double, String, LocalDateTime)}
     */
    @Test
    void testConstructor6() {
        ProductForm actualProductForm = new ProductForm("42", ProductType.CLOTHES, ProductCondition.BELONGTOOWNER,
                "Product Name", 10.0d, "Product Description", LocalDateTime.of(1, 1, 1, 1, 1));

        assertEquals("01:01", actualProductForm.getCreatedAt().toLocalTime().toString());
        assertEquals(10.0d, actualProductForm.getProductWeight());
        assertEquals(ProductType.CLOTHES, actualProductForm.getProductType());
        assertEquals("Product Name", actualProductForm.getProductName());
        assertEquals("Product Description", actualProductForm.getProductDescription());
        assertEquals(ProductCondition.BELONGTOOWNER, actualProductForm.getProductCondition());
        assertEquals("42", actualProductForm.getId());
    }

    /**
     * Method under test: {@link ProductForm#ProductForm(String, ProductType, ProductCondition, String, double, String, LocalDateTime)}
     */
    @Test
    void testConstructor7() {
        ProductForm actualProductForm = new ProductForm("42", ProductType.OTHERS, ProductCondition.BELONGTOOWNER,
                "Product Name", 10.0d, "Product Description", LocalDateTime.of(1, 1, 1, 1, 1));

        assertEquals("01:01", actualProductForm.getCreatedAt().toLocalTime().toString());
        assertEquals(10.0d, actualProductForm.getProductWeight());
        assertEquals(ProductType.OTHERS, actualProductForm.getProductType());
        assertEquals("Product Name", actualProductForm.getProductName());
        assertEquals("Product Description", actualProductForm.getProductDescription());
        assertEquals(ProductCondition.BELONGTOOWNER, actualProductForm.getProductCondition());
        assertEquals("42", actualProductForm.getId());
    }

    /**
     * Method under test: {@link ProductForm#ProductForm(String, ProductType, ProductCondition, String, double, String, LocalDateTime, LocalDateTime)}
     */
    @Test
    void testConstructor8() {
        LocalDateTime createdAt = LocalDateTime.of(1, 1, 1, 1, 1);
        ProductForm actualProductForm = new ProductForm("42", ProductType.TECHNICS, ProductCondition.BELONGTOOWNER,
                "Product Name", 10.0d, "Product Description", createdAt, LocalDateTime.of(1, 1, 1, 1, 1));

        assertEquals("01:01", actualProductForm.getCreatedAt().toLocalTime().toString());
        assertEquals("01:01", actualProductForm.getUpdatedAt().toLocalTime().toString());
        assertEquals(10.0d, actualProductForm.getProductWeight());
        assertEquals(ProductType.TECHNICS, actualProductForm.getProductType());
        assertEquals("Product Name", actualProductForm.getProductName());
        assertEquals("Product Description", actualProductForm.getProductDescription());
        assertEquals(ProductCondition.BELONGTOOWNER, actualProductForm.getProductCondition());
        assertEquals("42", actualProductForm.getId());
    }

    /**
     * Method under test: {@link ProductForm#ProductForm(String, ProductType, ProductCondition, String, double, String, LocalDateTime, LocalDateTime)}
     */
    @Test
    void testConstructor9() {
        LocalDateTime createdAt = LocalDateTime.of(1, 1, 1, 1, 1);
        ProductForm actualProductForm = new ProductForm("42", ProductType.JEWELER, ProductCondition.BELONGTOOWNER,
                "Product Name", 10.0d, "Product Description", createdAt, LocalDateTime.of(1, 1, 1, 1, 1));

        assertEquals("01:01", actualProductForm.getCreatedAt().toLocalTime().toString());
        assertEquals("01:01", actualProductForm.getUpdatedAt().toLocalTime().toString());
        assertEquals(10.0d, actualProductForm.getProductWeight());
        assertEquals(ProductType.JEWELER, actualProductForm.getProductType());
        assertEquals("Product Name", actualProductForm.getProductName());
        assertEquals("Product Description", actualProductForm.getProductDescription());
        assertEquals(ProductCondition.BELONGTOOWNER, actualProductForm.getProductCondition());
        assertEquals("42", actualProductForm.getId());
    }

    /**
     * Method under test: {@link ProductForm#ProductForm(String, ProductType, ProductCondition, String, double, String, LocalDateTime, LocalDateTime)}
     */
    @Test
    void testConstructor10() {
        LocalDateTime createdAt = LocalDateTime.of(1, 1, 1, 1, 1);
        ProductForm actualProductForm = new ProductForm("42", ProductType.TOYS, ProductCondition.BELONGTOOWNER,
                "Product Name", 10.0d, "Product Description", createdAt, LocalDateTime.of(1, 1, 1, 1, 1));

        assertEquals("01:01", actualProductForm.getCreatedAt().toLocalTime().toString());
        assertEquals("01:01", actualProductForm.getUpdatedAt().toLocalTime().toString());
        assertEquals(10.0d, actualProductForm.getProductWeight());
        assertEquals(ProductType.TOYS, actualProductForm.getProductType());
        assertEquals("Product Name", actualProductForm.getProductName());
        assertEquals("Product Description", actualProductForm.getProductDescription());
        assertEquals(ProductCondition.BELONGTOOWNER, actualProductForm.getProductCondition());
        assertEquals("42", actualProductForm.getId());
    }

    /**
     * Method under test: {@link ProductForm#ProductForm(String, ProductType, ProductCondition, String, double, String, LocalDateTime, LocalDateTime)}
     */
    @Test
    void testConstructor11() {
        LocalDateTime createdAt = LocalDateTime.of(1, 1, 1, 1, 1);
        ProductForm actualProductForm = new ProductForm("42", ProductType.CLOTHES, ProductCondition.BELONGTOOWNER,
                "Product Name", 10.0d, "Product Description", createdAt, LocalDateTime.of(1, 1, 1, 1, 1));

        assertEquals("01:01", actualProductForm.getCreatedAt().toLocalTime().toString());
        assertEquals("01:01", actualProductForm.getUpdatedAt().toLocalTime().toString());
        assertEquals(10.0d, actualProductForm.getProductWeight());
        assertEquals(ProductType.CLOTHES, actualProductForm.getProductType());
        assertEquals("Product Name", actualProductForm.getProductName());
        assertEquals("Product Description", actualProductForm.getProductDescription());
        assertEquals(ProductCondition.BELONGTOOWNER, actualProductForm.getProductCondition());
        assertEquals("42", actualProductForm.getId());
    }

    /**
     * Method under test: {@link ProductForm#ProductForm(String, ProductType, ProductCondition, String, double, String, LocalDateTime, LocalDateTime)}
     */
    @Test
    void testConstructor12() {
        LocalDateTime createdAt = LocalDateTime.of(1, 1, 1, 1, 1);
        ProductForm actualProductForm = new ProductForm("42", ProductType.OTHERS, ProductCondition.BELONGTOOWNER,
                "Product Name", 10.0d, "Product Description", createdAt, LocalDateTime.of(1, 1, 1, 1, 1));

        assertEquals("01:01", actualProductForm.getCreatedAt().toLocalTime().toString());
        assertEquals("01:01", actualProductForm.getUpdatedAt().toLocalTime().toString());
        assertEquals(10.0d, actualProductForm.getProductWeight());
        assertEquals(ProductType.OTHERS, actualProductForm.getProductType());
        assertEquals("Product Name", actualProductForm.getProductName());
        assertEquals("Product Description", actualProductForm.getProductDescription());
        assertEquals(ProductCondition.BELONGTOOWNER, actualProductForm.getProductCondition());
        assertEquals("42", actualProductForm.getId());
    }

    /**
     * Method under test: {@link ProductForm#equals(Object)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEquals13() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.time.LocalDateTime.equals(Object)" because the return value of "edu.mosk.lombardapp.form.product.ProductForm.getCreatedAt()" is null
        //       at edu.mosk.lombardapp.form.product.ProductForm.equals(ProductForm.java:126)
        //   In order to prevent equals(Object)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   equals(Object).
        //   See https://diff.blue/R013 to resolve this issue.

        ProductForm productForm = new ProductForm("42", ProductType.TECHNICS, ProductCondition.BELONGTOOWNER,
                "Product Name", 10.0d, "Product Description", null);
        Product product = mock(Product.class);
        when(product.getUpdatedAt()).thenReturn(LocalDateTime.of(1, 1, 1, 1, 1));
        when(product.getCreatedAt()).thenReturn(LocalDateTime.of(1, 1, 1, 1, 1));
        when(product.getProductDescription()).thenReturn("Product Description");
        when(product.getProductName()).thenReturn("Product Name");
        when(product.getProductCondition()).thenReturn(ProductCondition.BELONGTOOWNER);
        when(product.getProductType()).thenReturn(ProductType.TECHNICS);
        when(product.getProductWeight()).thenReturn(10.0d);
        when(product.getId()).thenReturn("42");
        assertThrows(NullPointerException.class, () -> productForm.equals(product));
    }

    /**
     * Method under test: {@link ProductForm#equals(Object)}
     */
    @Test
    void testEquals() {
        assertNotEquals(new ProductForm("Name", "Product Description"), null);
        assertNotEquals(new ProductForm("Name", "Product Description"), "Different type to ProductForm");
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ProductForm#equals(Object)}
     *   <li>{@link ProductForm#hashCode()}
     * </ul>
     */
    @Test
    void testEquals2() {
        ProductForm productForm = new ProductForm("Name", "Product Description");
        assertEquals(productForm, productForm);
        int expectedHashCodeResult = productForm.hashCode();
        assertEquals(expectedHashCodeResult, productForm.hashCode());
    }

    /**
     * Method under test: {@link ProductForm#equals(Object)}
     */
    @Test
    void testEquals3() {
        ProductForm productForm = new ProductForm("Name", "Product Description");
        assertNotEquals(productForm, new ProductForm("Name", "Product Description"));
    }

    /**
     * Method under test: {@link ProductForm#equals(Object)}
     */
    @Test
    void testEquals4() {
        ProductForm productForm = new ProductForm("Name", "Product Description");

        Product product = new Product();
        product.setCreatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        product.setId("42");
        product.setProductCondition(ProductCondition.BELONGTOOWNER);
        product.setProductDescription("Product Description");
        product.setProductName("Product Name");
        product.setProductType(ProductType.TECHNICS);
        product.setProductWeight(10.0d);
        product.setUpdatedAt(LocalDateTime.of(1, 1, 1, 1, 1));
        assertNotEquals(productForm, product);
    }

    /**
     * Method under test: {@link ProductForm#equals(Object)}
     */
    @Test
    void testEquals5() {
        ProductForm productForm = new ProductForm("Name", "Product Description");
        Product product = mock(Product.class);
        when(product.getProductWeight()).thenReturn(10.0d);
        when(product.getId()).thenReturn("42");
        assertNotEquals(productForm, product);
    }

    /**
     * Method under test: {@link ProductForm#equals(Object)}
     */
    @Test
    void testEquals6() {
        ProductForm productForm = new ProductForm("42", ProductType.TECHNICS, ProductCondition.BELONGTOOWNER,
                "Product Name", 10.0d, "Product Description", LocalDateTime.of(1, 1, 1, 1, 1));
        Product product = mock(Product.class);
        when(product.getUpdatedAt()).thenReturn(LocalDateTime.of(1, 1, 1, 1, 1));
        when(product.getCreatedAt()).thenReturn(LocalDateTime.of(1, 1, 1, 1, 1));
        when(product.getProductDescription()).thenReturn("Product Description");
        when(product.getProductName()).thenReturn("Product Name");
        when(product.getProductCondition()).thenReturn(ProductCondition.BELONGTOOWNER);
        when(product.getProductType()).thenReturn(ProductType.TECHNICS);
        when(product.getProductWeight()).thenReturn(10.0d);
        when(product.getId()).thenReturn("42");
        assertNotEquals(productForm, product);
    }

    /**
     * Method under test: {@link ProductForm#equals(Object)}
     */
    @Test
    void testEquals7() {
        ProductForm productForm = new ProductForm("Product Name", ProductType.TECHNICS, ProductCondition.BELONGTOOWNER,
                "Product Name", 10.0d, "Product Description", LocalDateTime.of(1, 1, 1, 1, 1));
        Product product = mock(Product.class);
        when(product.getUpdatedAt()).thenReturn(LocalDateTime.of(1, 1, 1, 1, 1));
        when(product.getCreatedAt()).thenReturn(LocalDateTime.of(1, 1, 1, 1, 1));
        when(product.getProductDescription()).thenReturn("Product Description");
        when(product.getProductName()).thenReturn("Product Name");
        when(product.getProductCondition()).thenReturn(ProductCondition.BELONGTOOWNER);
        when(product.getProductType()).thenReturn(ProductType.TECHNICS);
        when(product.getProductWeight()).thenReturn(10.0d);
        when(product.getId()).thenReturn("42");
        assertNotEquals(productForm, product);
    }

    /**
     * Method under test: {@link ProductForm#equals(Object)}
     */
    @Test
    void testEquals8() {
        ProductForm productForm = new ProductForm("42", ProductType.JEWELER, ProductCondition.BELONGTOOWNER,
                "Product Name", 10.0d, "Product Description", LocalDateTime.of(1, 1, 1, 1, 1));
        Product product = mock(Product.class);
        when(product.getUpdatedAt()).thenReturn(LocalDateTime.of(1, 1, 1, 1, 1));
        when(product.getCreatedAt()).thenReturn(LocalDateTime.of(1, 1, 1, 1, 1));
        when(product.getProductDescription()).thenReturn("Product Description");
        when(product.getProductName()).thenReturn("Product Name");
        when(product.getProductCondition()).thenReturn(ProductCondition.BELONGTOOWNER);
        when(product.getProductType()).thenReturn(ProductType.TECHNICS);
        when(product.getProductWeight()).thenReturn(10.0d);
        when(product.getId()).thenReturn("42");
        assertNotEquals(productForm, product);
    }

    /**
     * Method under test: {@link ProductForm#equals(Object)}
     */
    @Test
    void testEquals9() {
        ProductForm productForm = new ProductForm("42", ProductType.TECHNICS, ProductCondition.BELONGTOLOMBARD,
                "Product Name", 10.0d, "Product Description", LocalDateTime.of(1, 1, 1, 1, 1));
        Product product = mock(Product.class);
        when(product.getUpdatedAt()).thenReturn(LocalDateTime.of(1, 1, 1, 1, 1));
        when(product.getCreatedAt()).thenReturn(LocalDateTime.of(1, 1, 1, 1, 1));
        when(product.getProductDescription()).thenReturn("Product Description");
        when(product.getProductName()).thenReturn("Product Name");
        when(product.getProductCondition()).thenReturn(ProductCondition.BELONGTOOWNER);
        when(product.getProductType()).thenReturn(ProductType.TECHNICS);
        when(product.getProductWeight()).thenReturn(10.0d);
        when(product.getId()).thenReturn("42");
        assertNotEquals(productForm, product);
    }

    /**
     * Method under test: {@link ProductForm#equals(Object)}
     */
    @Test
    void testEquals10() {
        ProductForm productForm = new ProductForm("42", ProductType.TECHNICS, ProductCondition.BELONGTOOWNER, "42", 10.0d,
                "Product Description", LocalDateTime.of(1, 1, 1, 1, 1));
        Product product = mock(Product.class);
        when(product.getUpdatedAt()).thenReturn(LocalDateTime.of(1, 1, 1, 1, 1));
        when(product.getCreatedAt()).thenReturn(LocalDateTime.of(1, 1, 1, 1, 1));
        when(product.getProductDescription()).thenReturn("Product Description");
        when(product.getProductName()).thenReturn("Product Name");
        when(product.getProductCondition()).thenReturn(ProductCondition.BELONGTOOWNER);
        when(product.getProductType()).thenReturn(ProductType.TECHNICS);
        when(product.getProductWeight()).thenReturn(10.0d);
        when(product.getId()).thenReturn("42");
        assertNotEquals(productForm, product);
    }

    /**
     * Method under test: {@link ProductForm#equals(Object)}
     */
    @Test
    void testEquals11() {
        ProductForm productForm = new ProductForm("42", ProductType.TECHNICS, ProductCondition.BELONGTOOWNER,
                "Product Name", 10.0d, "42", LocalDateTime.of(1, 1, 1, 1, 1));
        Product product = mock(Product.class);
        when(product.getUpdatedAt()).thenReturn(LocalDateTime.of(1, 1, 1, 1, 1));
        when(product.getCreatedAt()).thenReturn(LocalDateTime.of(1, 1, 1, 1, 1));
        when(product.getProductDescription()).thenReturn("Product Description");
        when(product.getProductName()).thenReturn("Product Name");
        when(product.getProductCondition()).thenReturn(ProductCondition.BELONGTOOWNER);
        when(product.getProductType()).thenReturn(ProductType.TECHNICS);
        when(product.getProductWeight()).thenReturn(10.0d);
        when(product.getId()).thenReturn("42");
        assertNotEquals(productForm, product);
    }

    /**
     * Method under test: {@link ProductForm#equals(Object)}
     */
    @Test
    void testEquals12() {
        ProductForm productForm = new ProductForm("42", ProductType.TECHNICS, ProductCondition.BELONGTOOWNER,
                "Product Name", 10.0d, "Product Description", LocalDateTime.of(0, 1, 1, 1, 1));
        Product product = mock(Product.class);
        when(product.getUpdatedAt()).thenReturn(LocalDateTime.of(1, 1, 1, 1, 1));
        when(product.getCreatedAt()).thenReturn(LocalDateTime.of(1, 1, 1, 1, 1));
        when(product.getProductDescription()).thenReturn("Product Description");
        when(product.getProductName()).thenReturn("Product Name");
        when(product.getProductCondition()).thenReturn(ProductCondition.BELONGTOOWNER);
        when(product.getProductType()).thenReturn(ProductType.TECHNICS);
        when(product.getProductWeight()).thenReturn(10.0d);
        when(product.getId()).thenReturn("42");
        assertNotEquals(productForm, product);
    }

    /**
     * Method under test: {@link ProductForm#equals(Object)}
     */
    @Test
    void testEquals14() {
        ProductForm productForm = new ProductForm("42", ProductType.TECHNICS, ProductCondition.BELONGTOOWNER,
                "Product Name", 10.0d, "Product Description", LocalDateTime.of(1, 1, 1, 1, 1));
        Product product = mock(Product.class);
        when(product.getUpdatedAt()).thenReturn(null);
        when(product.getCreatedAt()).thenReturn(LocalDateTime.of(1, 1, 1, 1, 1));
        when(product.getProductDescription()).thenReturn("Product Description");
        when(product.getProductName()).thenReturn("Product Name");
        when(product.getProductCondition()).thenReturn(ProductCondition.BELONGTOOWNER);
        when(product.getProductType()).thenReturn(ProductType.TECHNICS);
        when(product.getProductWeight()).thenReturn(10.0d);
        when(product.getId()).thenReturn("42");
        assertEquals(productForm, product);
    }
}

