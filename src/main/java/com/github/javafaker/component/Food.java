package com.github.javafaker.component;

import com.github.javafaker.Faker;
import com.github.javafaker.FakerElement;

public class Food extends FakerElement {
	
    /**
	 * @param faker
	 */
	public Food(Faker faker) {
		super(faker);
	}

	public String ingredient() {
        return faker.fakeValuesService().resolve("food.ingredients", this, faker);
    }

    public String spice() {
        return faker.fakeValuesService().resolve("food.spices", this, faker);
    }

    public String measurement() {
        return faker.fakeValuesService().resolve("food.measurement_sizes", this, faker) +
            " " + faker.fakeValuesService().resolve("food.measurements", this, faker);
    }
}
