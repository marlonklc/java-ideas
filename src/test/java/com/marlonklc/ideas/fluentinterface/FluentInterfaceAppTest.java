package com.marlonklc.ideas.fluentinterface;

import com.marlonklc.ideas.fluentinterface.domain.Sale;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FluentInterfaceAppTest {

    @Test
    public void havingAllPropertiesShouldReturnThem() {

        Sale result = FluentInterfaceApp.createSale();

        assertNotNull(result);
        assertNotNull(result.getSalesman());
        assertNotNull(result.getClient());
        assertNotNull(result.getDiscountCoupon());
        assertNotNull(result.getProducts());
        assertEquals(2, result.sizeOfProducts());
    }

    @Test
    public void havingTwoProductsShouldReturnEqualsSizeOfProducts() {

        Sale result = FluentInterfaceApp.createSale();

        assertEquals(2, result.sizeOfProducts());
    }
}
