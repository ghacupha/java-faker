package com.github.javafaker.component;

import com.github.javafaker.Faker;
import com.github.javafaker.FakerElement;

public class Bool extends FakerElement {

    /**
	 * @param faker
	 */
	public Bool(Faker faker) {
		super(faker);
	}

	public boolean bool() {
        return faker.random().nextBoolean();
    }
}
