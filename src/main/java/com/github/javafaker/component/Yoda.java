package com.github.javafaker.component;

import com.github.javafaker.Faker;
import com.github.javafaker.FakerElement;

public class Yoda extends FakerElement {

    /**
	 * @param faker
	 */
	public Yoda(Faker faker) {
		super(faker);
	}

	public String quote() {
        return faker.resolve("yoda.quotes");
    }
}
