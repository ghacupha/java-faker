package com.github.javafaker.component;

import com.github.javafaker.Faker;
import com.github.javafaker.FakerElement;

public class University extends FakerElement {

    /**
	 * @param faker
	 */
	public University(Faker faker) {
		super(faker);
	}

	public String name() {
        return faker.fakeValuesService().resolve("university.name", this, faker);
    }

    public String prefix() {
        return faker.fakeValuesService().resolve("university.prefix", this, faker);
    }

    public String suffix() {
        return faker.fakeValuesService().resolve("university.suffix", this, faker);
    }
}
