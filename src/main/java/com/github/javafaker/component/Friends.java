package com.github.javafaker.component;

import com.github.javafaker.Faker;
import com.github.javafaker.FakerElement;

public class Friends extends FakerElement {
	
    /**
	 * @param faker
	 */
	public Friends(Faker faker) {
		super(faker);
	}

	public String character() {
        return faker.resolve("friends.characters");
    }

    public String location() {
        return faker.resolve("friends.locations");
    }

    public String quote() {
        return faker.resolve("friends.quotes");
    }
}