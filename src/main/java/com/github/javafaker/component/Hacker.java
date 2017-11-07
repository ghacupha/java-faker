package com.github.javafaker.component;

import com.github.javafaker.Faker;
import com.github.javafaker.FakerElement;

public class Hacker extends FakerElement {

    /**
	 * @param faker
	 */
	public Hacker(Faker faker) {
		super(faker);
	}

	public String abbreviation() {
        return faker.fakeValuesService().resolve("hacker.abbreviation", this, faker);
    }

    public String adjective() {
        return faker.fakeValuesService().resolve("hacker.adjective", this, faker);
    }

    public String noun() {
        return faker.fakeValuesService().resolve("hacker.noun", this, faker);
    }

    public String verb() {
        return faker.fakeValuesService().resolve("hacker.verb", this, faker);
    }

    public String ingverb() {
        return faker.fakeValuesService().resolve("hacker.ingverb", this, faker);
    }
}
