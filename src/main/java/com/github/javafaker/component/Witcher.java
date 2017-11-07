package com.github.javafaker.component;

import com.github.javafaker.Faker;
import com.github.javafaker.FakerElement;

public class Witcher extends FakerElement {
    
    /**
	 * @param faker
	 */
	public Witcher(Faker faker) {
		super(faker);
	}

	public String character() {
        return faker.fakeValuesService().resolve("witcher.characters", this, faker);
    }
    
    public String witcher() {
        return faker.fakeValuesService().resolve("witcher.witchers", this, faker);
    }
    
    public String school() {
        return faker.fakeValuesService().resolve("witcher.schools", this, faker);
    }
    
    public String location() {
        return faker.fakeValuesService().resolve("witcher.locations", this, faker);
    }
    
    public String quote() {
        return faker.fakeValuesService().resolve("witcher.quotes", this, faker);
    }
    
    public String monster() {
        return faker.fakeValuesService().resolve("witcher.monsters", this, faker);
    }
}
