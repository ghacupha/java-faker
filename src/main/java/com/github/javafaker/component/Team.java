package com.github.javafaker.component;

import com.github.javafaker.Faker;
import com.github.javafaker.FakerElement;

public class Team extends FakerElement {

    /**
	 * @param faker
	 */
	public Team(Faker faker) {
		super(faker);
	}

	public String name() {
        return faker.fakeValuesService().resolve("team.name", this, faker);
    }

    public String creature() {
        return faker.fakeValuesService().resolve("team.creature", this, faker);
    }

    public String state() {
        return faker.fakeValuesService().resolve("address.state", this, faker);
    }

    public String sport() {
        return faker.fakeValuesService().resolve("team.sport", this, faker);
    }
}
