package com.github.javafaker.component;

import com.github.javafaker.Faker;
import com.github.javafaker.FakerElement;

public class Ancient extends FakerElement {


	public Ancient(Faker faker) {
		super(faker);
	}

	public String god() {
        return faker.resolve("ancient.god");
    }

    public String primordial() {
        return faker.resolve("ancient.primordial");
    }

    public String titan() {
        return faker.resolve("ancient.titan");
    }

    public String hero() {
        return faker.resolve("ancient.hero");
    }
}
