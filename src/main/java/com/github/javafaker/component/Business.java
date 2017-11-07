package com.github.javafaker.component;

import com.github.javafaker.Faker;
import com.github.javafaker.FakerElement;

public class Business extends FakerElement {

    /**
	 * @param faker
	 */
	public Business(Faker faker) {
		super(faker);
	}

	public String creditCardNumber() {
        return faker.fakeValuesService().resolve("business.credit_card_numbers", this, faker);
    }

    public String creditCardType() {
        return faker.fakeValuesService().resolve("business.credit_card_types", this, faker);
    }

    public String creditCardExpiry() {
        return faker.fakeValuesService().resolve("business.credit_card_expiry_dates", this, faker);
    }
}
