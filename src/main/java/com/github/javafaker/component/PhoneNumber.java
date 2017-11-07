package com.github.javafaker.component;

import com.github.javafaker.Faker;
import com.github.javafaker.FakerElement;

public class PhoneNumber extends FakerElement {
	
    /**
	 * @param faker
	 */
	public PhoneNumber(Faker faker) {
		super(faker);
	}

	public String cellPhone() {
        return faker.numerify(faker.fakeValuesService().resolve("cell_phone.formats", this, faker));
    }

    public String phoneNumber() {
        return faker.numerify(faker.fakeValuesService().resolve("phone_number.formats", this, faker));
    }
}
