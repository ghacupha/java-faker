package com.github.javafaker.component;

import com.github.javafaker.Faker;
import com.github.javafaker.FakerElement;

public class Color extends FakerElement {
	
    /**
	 * @param faker
	 */
	public Color(Faker faker) {
		super(faker);
	}

	public String name() {
        return faker.fakeValuesService().resolve("color.name", this, faker);
    }
}
