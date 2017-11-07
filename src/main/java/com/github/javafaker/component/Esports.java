package com.github.javafaker.component;

import com.github.javafaker.Faker;
import com.github.javafaker.FakerElement;

public class Esports extends FakerElement {
	
    /**
	 * @param faker
	 */
	public Esports(Faker faker) {
		super(faker);
		// TODO Auto-generated constructor stub
	}

	public String player() {
        return faker.resolve("esports.players");
    }

    public String team() {
        return faker.resolve("esports.teams");
    }

    public String event() {
        return faker.resolve("esports.events");
    }

    public String league() {
        return faker.resolve("esports.leagues");
    }

    public String game() {
        return faker.resolve("esports.games");
    }
}
