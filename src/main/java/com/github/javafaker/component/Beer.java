package com.github.javafaker.component;

import com.github.javafaker.Faker;
import com.github.javafaker.FakerElement;

public class Beer extends FakerElement {

	/**
	 * @param faker
	 */
	public Beer(Faker faker) {
		super(faker);
	}

	public String name() {
        return faker.fakeValuesService().resolve("beer.name", this, faker);
    }

    public String style() {
        return faker.fakeValuesService().resolve("beer.style", this, faker);
    }

    public String hop() {
        return faker.fakeValuesService().resolve("beer.hop", this, faker);
    }

    public String yeast() {
        return faker.fakeValuesService().resolve("beer.yeast", this, faker);
    }

    public String malt() {
        return faker.fakeValuesService().resolve("beer.malt", this, faker);
    }
}
