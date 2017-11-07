package com.github.javafaker.component;

import com.github.javafaker.Faker;
import com.github.javafaker.FakerElement;

public class Music extends FakerElement {

    /**
	 * @param faker
	 */
	public Music(Faker faker) {
		super(faker);
	}

	private static final String[] KEYS = new String[] { "C", "D", "E", "F", "G", "A", "B" };
    private static final String[] KEY_VARIANTS = new String[] { "b", "#", "" };
    private static final String[] CHORD_TYPES = new String[] { "", "maj", "6", "maj7", "m", "m7", "-7", "7", "dom7", "dim", "dim7", "m7b5"};

    public String instrument() {
        return faker.resolve("music.instruments");
    }

    public String key() {
        return faker.pickRandom().fromArray(KEYS) + faker.pickRandom().fromArray(KEY_VARIANTS);
    }

    public String chord() {
        return key() + faker.pickRandom().fromArray(CHORD_TYPES);
    }
}
