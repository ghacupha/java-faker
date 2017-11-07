package com.github.javafaker.component;

import com.github.javafaker.Faker;
import com.github.javafaker.FakerElement;

public class ChuckNorris extends FakerElement {
	
    /**
	 * @param faker
	 */
	public ChuckNorris(Faker faker) {
		super(faker);
	}

	public String fact() {
        return faker.fakeValuesService().resolve("chuck_norris.fact", this, faker);
    }
}
