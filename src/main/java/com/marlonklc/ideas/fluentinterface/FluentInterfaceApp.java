package com.marlonklc.ideas.fluentinterface;

import com.marlonklc.ideas.fluentinterface.domain.Sale;
import com.marlonklc.ideas.fluentinterface.domain.Salesman;

public class FluentInterfaceApp {

    public static Sale createSale() {
        return Salesman.of("Heisenberg", "01234567890")
                .sell()
                .toClient("Bad man")
                .product("Flour", 15.0)
                .product("Bluish stone", 50.0)
                .withDiscount(5.0);
    }
}
