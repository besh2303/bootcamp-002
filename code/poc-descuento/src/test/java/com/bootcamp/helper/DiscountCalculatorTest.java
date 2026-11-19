package com.bootcamp.helper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DiscountCalculatorTest {

    private static final double DELTA = 0.0001;

    @Test
    void shouldCalculateDiscountWhenPriceIsGreaterThanZero() {
        double valorProducto = 100.0;
        double porcentajeDescuento = 20.0;

        DiscountCalculator calculator = new DiscountCalculator();

        double valorConDescuento = calculator.calculateDiscount(
            valorProducto,
            porcentajeDescuento
        );

        assertEquals(80.0, valorConDescuento, DELTA);
    }
}
