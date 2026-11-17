package com.bootcamp.helper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TaxCalculatorTest {

    private static final double DELTA = 0.0001;

    @Test
    void shouldCalculateIvaWhenPriceIsGreaterThanZero() {
        double valorProducto = 100.0;
        TaxCalculator calculator = new TaxCalculator(16.0);

        double ivaCalculado = calculator.calculateIva(valorProducto);

        assertEquals(16.0, ivaCalculado, DELTA);
    }

 }