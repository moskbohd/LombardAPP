package edu.mosk.lombardapp.model.product;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class ProductConditionTest {
    /**
     * Method under test: {@link ProductCondition#valueOf(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testValueOf() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: No enum constant edu.mosk.lombardapp.model.product.ProductCondition.Name
        //       at java.lang.Enum.valueOf(Enum.java:273)
        //       at edu.mosk.lombardapp.model.product.ProductCondition.valueOf(ProductCondition.java:9)
        //   In order to prevent valueOf(String)
        //   from throwing IllegalArgumentException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   valueOf(String).
        //   See https://diff.blue/R013 to resolve this issue.

        ProductCondition.valueOf("Name");
    }

    /**
     * Method under test: {@link ProductCondition#valueOf(String)}
     */
    @Test
    void testValueOf2() {
        // TODO: Complete this test.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by valueOf(String)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        ProductCondition.valueOf("BELONGTOLOMBARD");
    }

    /**
     * Method under test: {@link ProductCondition#valueOf(String)}
     */
    @Test
    void testValueOf3() {
        // TODO: Complete this test.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by valueOf(String)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        ProductCondition.valueOf("BELONGTOOWNER");
    }

    /**
     * Method under test: {@link ProductCondition#valueOf(String)}
     */
    @Test
    void testValueOf4() {
        // TODO: Complete this test.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by valueOf(String)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        ProductCondition.valueOf("SOLD");
    }

    /**
     * Method under test: {@link ProductCondition#values()}
     */
    @Test
    void testValues() {
        ProductCondition[] actualValuesResult = ProductCondition.values();
        assertEquals(3, actualValuesResult.length);
        assertEquals(ProductCondition.BELONGTOOWNER, actualValuesResult[0]);
        assertEquals(ProductCondition.BELONGTOLOMBARD, actualValuesResult[1]);
        assertEquals(ProductCondition.SOLD, actualValuesResult[2]);
    }
}

