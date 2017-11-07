package com.github.javafaker.component;

import com.github.javafaker.Faker;
import com.github.javafaker.FakerElement;

public class TwinPeaks extends FakerElement {

    /**
	 * @param faker
	 */
	public TwinPeaks(Faker faker) {
		super(faker);
	}

	public String character() {
        return faker.resolve("twin_peaks.characters");
    }

    public String location() {
        return faker.resolve("twin_peaks.locations");
    }

    public String quote() {
        return faker.resolve("twin_peaks.quotes");
    }
}
