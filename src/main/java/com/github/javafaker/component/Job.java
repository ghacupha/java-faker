package com.github.javafaker.component;

import com.github.javafaker.Faker;
import com.github.javafaker.FakerElement;

public class Job extends FakerElement {

    /**
	 * @param faker
	 */
	public Job(Faker faker) {
		super(faker);
	}

	public String field() {
        return faker.fakeValuesService().resolve("job.field", this, faker);
    }

    public String seniority() {
        return faker.fakeValuesService().resolve("job.seniority", this, faker);
    }

    public String position() {
        return faker.fakeValuesService().resolve("job.position", this, faker);
    }

    public String keySkills() {
        return faker.fakeValuesService().resolve("job.key_skills", this, faker);
    }

    public String title() {
        return faker.fakeValuesService().resolve("job.title", this, faker);
    }
}
