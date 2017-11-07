package com.github.javafaker.component;

import com.github.javafaker.Faker;
import com.github.javafaker.FakerElement;

public class Cat extends FakerElement {

    /**
	 * @param faker
	 */
	public Cat(Faker faker) {
		super(faker);
	}

	public String name() {
        return faker.fakeValuesService().resolve("cat.name", this, faker);
    }

    public String breed() {
        return faker.fakeValuesService().resolve("cat.breed", this, faker);
    }

    public String registry() {
        return faker.fakeValuesService().resolve("cat.registry", this, faker);
    }
}
