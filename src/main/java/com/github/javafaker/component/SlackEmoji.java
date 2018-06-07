/*
 * The MIT License
 * Copyright © 2018 Edwin Njeru
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
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
