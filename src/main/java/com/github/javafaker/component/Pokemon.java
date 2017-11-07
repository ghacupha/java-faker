package com.github.javafaker.component;

import com.github.javafaker.Faker;
import com.github.javafaker.FakerElement;

public class Pokemon extends FakerElement {

    /**
	 * @param faker
	 */
	public Pokemon(Faker faker) {
		super(faker);
	}

	public String name() {
        return faker.resolve("pokemon.names");
    }

    public String location() {
        return faker.resolve("pokemon.locations");
    }
}
