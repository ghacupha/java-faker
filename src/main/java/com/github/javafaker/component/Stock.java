package com.github.javafaker.component;

import com.github.javafaker.Faker;
import com.github.javafaker.FakerElement;

public class Stock extends FakerElement {

	/**
	 * @param faker
	 */
	public Stock(Faker faker) {
		super(faker);
	}

	public String nsdqSymbol() {
		return faker.fakeValuesService().resolve("stock.symbol_nsdq", this, faker);
	}
	
	public String nyseSymbol() {
		return faker.fakeValuesService().resolve("stock.symbol_nyse", this, faker);
	}
	
}
