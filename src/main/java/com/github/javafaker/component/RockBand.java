package com.github.javafaker.component;

import com.github.javafaker.Faker;
import com.github.javafaker.FakerElement;

public class RockBand extends FakerElement {

    /**
	 * @param faker
	 */
	public RockBand(Faker faker) {
		super(faker);
	}

	public String name() {
        return faker.resolve("rock_band.name");
    }
}
