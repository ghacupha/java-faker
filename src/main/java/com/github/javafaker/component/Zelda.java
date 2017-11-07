package com.github.javafaker.component;

import com.github.javafaker.Faker;
import com.github.javafaker.FakerElement;

public class Zelda extends FakerElement {

    /**
	 * @param faker
	 */
	public Zelda(Faker faker) {
		super(faker);
	}

	public String game() {
        return faker.resolve("zelda.games");
    }

    public String character() {
        return faker.resolve("zelda.characters");
    }
}
