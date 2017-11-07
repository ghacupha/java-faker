package com.github.javafaker.component;

import com.github.javafaker.Faker;
import com.github.javafaker.FakerElement;

public class LordOfTheRings extends FakerElement {

    /**
	 * @param faker
	 */
	public LordOfTheRings(Faker faker) {
		super(faker);
	}

	public String character() {
        return faker.resolve("lord_of_the_rings.characters");
    }

    public String location() {
        return faker.resolve("lord_of_the_rings.locations");
    }
}
