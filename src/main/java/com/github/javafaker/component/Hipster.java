package com.github.javafaker.component;

import com.github.javafaker.Faker;
import com.github.javafaker.FakerElement;

public class Hipster extends FakerElement {

    /**
	 * @param faker
	 */
	public Hipster(Faker faker) {
		super(faker);
	}

	public String word() {
        return faker.resolve("hipster.words");
    }
}
