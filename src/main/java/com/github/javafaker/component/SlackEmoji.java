package com.github.javafaker.component;

import com.github.javafaker.Faker;
import com.github.javafaker.FakerElement;

public class SlackEmoji extends FakerElement {

    /**
	 * @param faker
	 */
	public SlackEmoji(Faker faker) {
		super(faker);
	}

	public String people() {
        return faker.resolve("slack_emoji.people");
    }

    public String nature() {
        return faker.resolve("slack_emoji.nature");
    }

    public String foodAndDrink() {
        return faker.resolve("slack_emoji.food_and_drink");
    }

    public String celebration() {
        return faker.resolve("slack_emoji.celebration");
    }

    public String activity() {
        return faker.resolve("slack_emoji.activity");
    }

    public String travelAndPlaces() {
        return faker.resolve("slack_emoji.travel_and_places");
    }

    public String objectsAndSymbols() {
        return faker.resolve("slack_emoji.objects_and_symbols");
    }

    public String custom() {
        return faker.resolve("slack_emoji.custom");
    }

    public String emoji() {
        return faker.fakeValuesService().resolve("slack_emoji.emoji", this, faker);
    }
}
