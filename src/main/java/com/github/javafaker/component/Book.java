package com.github.javafaker.component;

import com.github.javafaker.Faker;
import com.github.javafaker.FakerElement;

public class Book extends FakerElement {
	
    /**
	 * @param faker
	 */
	public Book(Faker faker) {
		super(faker);
	}

	public String author() {
        return faker.fakeValuesService().resolve("book.author", this, faker);
    }

    public String title() {
        return faker.fakeValuesService().resolve("book.title", this, faker);
    }

    public String publisher() {
        return faker.fakeValuesService().resolve("book.publisher", this, faker);
    }

    public String genre() {
        return faker.fakeValuesService().resolve("book.genre", this, faker);
    }
}
