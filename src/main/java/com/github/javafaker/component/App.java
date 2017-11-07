package com.github.javafaker.component;

import com.github.javafaker.Faker;
import com.github.javafaker.FakerElement;

public class App extends FakerElement {

	
	
    /**
	 * @param faker
	 */
	public App(Faker faker) {
		super(faker);
	}

	public String name() {
        return faker.fakeValuesService().resolve("app.name", this, faker);
    }

    public String version() {
        return faker.numerify(faker.fakeValuesService().resolve("app.version", this, faker));
    }

    public String author() {
        return faker.fakeValuesService().resolve("app.author", this, faker);
    }
}
