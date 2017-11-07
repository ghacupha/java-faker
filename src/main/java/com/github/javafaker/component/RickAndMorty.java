package com.github.javafaker.component;

import com.github.javafaker.Faker;
import com.github.javafaker.FakerElement;

public class RickAndMorty extends FakerElement  {

    /**
	 * @param faker
	 */
	public RickAndMorty(Faker faker) {
		super(faker);
	}

	public String character() {
        return faker.resolve("rick_and_morty.characters");
    }

    public String location() {
        return faker.resolve("rick_and_morty.locations");
    }

    public String quote() {
        return faker.resolve("rick_and_morty.quotes");
    }
}
