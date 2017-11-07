package com.github.javafaker.component;

import com.github.javafaker.Faker;
import com.github.javafaker.FakerElement;

public class Matz extends FakerElement {

    /**
	 * @param faker
	 */
	public Matz(Faker faker) {
		super(faker);
	}

	public String quote() {
        return faker.resolve("matz.quotes");
    }
}
