package com.capgemini.currency;

import java.util.Currency;
import java.util.Set;

public class CurrencyExample {
	public static void main(String[] args) {
		Currency currencyCode1 = Currency.getInstance("INR");
		Currency currencyCode2 = Currency.getInstance("USD");

		String currencyCode1Symbol = currencyCode1.getSymbol();
		String currencyCode2Symbol = currencyCode2.getSymbol();
		System.out.println("Indian :" + currencyCode1Symbol);
		System.out.println("US Dollar:" + currencyCode2Symbol);
		
		String currencyCode1DislpayName=currencyCode1.getDisplayName();
		String currencyCode2DislpayName=currencyCode2.getDisplayName();
		System.out.println("Display Name for INR:" + currencyCode1DislpayName);
		System.out.println("Display Name for Dollar:" + currencyCode2DislpayName);
		
		
		Set<Currency> currencies =Currency.getAvailableCurrencies();
		System.out.println(currencies);
System.out.println("**********************************************");
int currencyCode1defaultFraction = currencyCode1.getDefaultFractionDigits();
int currencyCode2defaultFraction = currencyCode2.getDefaultFractionDigits();
System.out.println("Defoalt Fraction of Indian curency:"+currencyCode1defaultFraction);;
System.out.println("Defoalt Fraction of USD curency:"+currencyCode2defaultFraction);
		

	}

}




