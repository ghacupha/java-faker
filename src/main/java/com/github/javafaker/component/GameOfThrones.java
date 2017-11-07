package com.github.javafaker.component;

import com.github.javafaker.Faker;
import com.github.javafaker.FakerElement;

public class GameOfThrones extends FakerElement {

    /**
	 * @param faker
	 */
	public GameOfThrones(Faker faker) {
		super(faker);
	}

	public String character() {
        return faker.resolve("game_of_thrones.characters");
    }

    public String house() {
        return faker.resolve("game_of_thrones.houses");
    }

    public String city() {
        return faker.resolve("game_of_thrones.cities");
    }

    public String dragon() {
        return faker.resolve("game_of_thrones.dragons");
    }

    public String quote() {
      return faker.resolve("game_of_thrones.quotes");
    }
}
