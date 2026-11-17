package com.bootcamp.helper;

public class TaxCalculator {

   private double IVA_RATE;

   public TaxCalculator(double IVA_RATE) { this.IVA_RATE = IVA_RATE; }

   public double calculateIva(double price) {
	  return price * IVA_RATE / 100;
   }
}
