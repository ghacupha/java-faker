package com.github.javafaker.component;

import com.github.javafaker.Faker;
import com.github.javafaker.FakerElement;

public class HarryPotter extends FakerElement {

    /**
	 * @param faker
	 */
	public HarryPotter(Faker faker) {
		super(faker);
	}

	public String character() {
        return faker.resolve("harry_potter.characters");
    }

    public String location() {
        return faker.resolve("harry_potter.locations");
    }

    public String quote() {
        return faker.resolve("harry_potter.quotes");
    }

    public String book() {
        return faker.resolve("harry_potter.books");
    }
}
