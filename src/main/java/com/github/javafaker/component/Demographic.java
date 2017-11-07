package com.github.javafaker.component;

import com.github.javafaker.Faker;
import com.github.javafaker.FakerElement;

public class Demographic extends FakerElement {


    /**
	 * @param faker
	 */
	public Demographic(Faker faker) {
		super(faker);
	}

	public String race() {
        return faker.fakeValuesService().fetchString("demographic.race");
    }

    public String educationalAttainment() {
        return faker.fakeValuesService().fetchString("demographic.educational_attainment");
    }

    public String demonym() {
        return faker.fakeValuesService().fetchString("demographic.demonym");
    }

    public String sex() {
        return faker.fakeValuesService().fetchString("demographic.sex");
    }

    public String maritalStatus() {
        return faker.fakeValuesService().fetchString("demographic.marital_status");
    }
}
