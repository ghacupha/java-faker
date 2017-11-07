package com.github.javafaker.component;

import com.github.javafaker.Faker;
import com.github.javafaker.FakerElement;

public class Artist  extends FakerElement {

	/**
	 * @param faker
	 */
	public Artist(Faker faker) {
		super(faker);
	}

	public String name() {
        return faker.fakeValuesService().fetchString("artist.names");
    }
}
