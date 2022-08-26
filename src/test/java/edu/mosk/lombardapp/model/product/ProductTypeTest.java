package edu.mosk.lombardapp.model.product;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class ProductTypeTest {
    /**
     * Method under test: {@link ProductType#valueOf(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testValueOf() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: No enum constant edu.mosk.lombardapp.model.product.ProductType.Name
        //       at java.lang.Enum.valueOf(Enum.java:273)
        //       at edu.mosk.lombardapp.model.product.ProductType.valueOf(ProductType.java:9)
        //   In order to prevent valueOf(String)
        //   from throwing IllegalArgumentException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   valueOf(String).
        //   See https://diff.blue/R013 to resolve this issue.

        ProductType.valueOf("Name");
    }

    /**
     * Method under test: {@link ProductType#valueOf(String)}
     */
    @Test
    void testValueOf2() {
        // TODO: Complete this test.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by valueOf(String)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        ProductType.valueOf("CLOTHES");
    }

    /**
     * Method under test: {@link ProductType#valueOf(String)}
     */
    @Test
    void testValueOf3() {
        // TODO: Complete this test.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by valueOf(String)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        ProductType.valueOf("JEWELER");
    }

    /**
     * Method under test: {@link ProductType#valueOf(String)}
     */
    @Test
    void testValueOf4() {
        // TODO: Complete this test.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by valueOf(String)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        ProductType.valueOf("OTHERS");
    }

    /**
     * Method under test: {@link ProductType#valueOf(String)}
     */
    @Test
    void testValueOf5() {
        // TODO: Complete this test.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by valueOf(String)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        ProductType.valueOf("TECHNICS");
    }

    /**
     * Method under test: {@link ProductType#valueOf(String)}
     */
    @Test
    void testValueOf6() {
        // TODO: Complete this test.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by valueOf(String)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        ProductType.valueOf("TOYS");
    }

    /**
     * Method under test: {@link ProductType#values()}
     */
    @Test
    void testValues() {
        ProductType[] actualValuesResult = ProductType.values();
        assertEquals(5, actualValuesResult.length);
        assertEquals(ProductType.TECHNICS, actualValuesResult[0]);
        assertEquals(ProductType.JEWELER, actualValuesResult[1]);
        assertEquals(ProductType.TOYS, actualValuesResult[2]);
        assertEquals(ProductType.CLOTHES, actualValuesResult[3]);
        assertEquals(ProductType.OTHERS, actualValuesResult[4]);
    }
}

