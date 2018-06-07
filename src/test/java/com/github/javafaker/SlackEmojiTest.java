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
package com.github.javafaker;

import org.junit.Test;

import static com.github.javafaker.matchers.MatchesRegularExpression.matchesRegularExpression;
import static org.junit.Assert.assertThat;

public class SlackEmojiTest extends AbstractFakerTest {

    private static final String EMOTICON_REGEX = ":([\\w-]+):";

    @Test
    public void people() {
        assertThat(faker.slackEmoji().people(), matchesRegularExpression(EMOTICON_REGEX));
    }

    @Test
    public void nature() {
        assertThat(faker.slackEmoji().nature(), matchesRegularExpression(EMOTICON_REGEX));
    }

    @Test
    public void food_and_drink() {
        assertThat(faker.slackEmoji().foodAndDrink(), matchesRegularExpression(EMOTICON_REGEX));
    }

    @Test
    public void celebration() {
        assertThat(faker.slackEmoji().celebration(), matchesRegularExpression(EMOTICON_REGEX));
    }

    @Test
    public void activity() {
        assertThat(faker.slackEmoji().activity(), matchesRegularExpression(EMOTICON_REGEX));
    }

    @Test
    public void travel_and_places() {
        assertThat(faker.slackEmoji().travelAndPlaces(), matchesRegularExpression(EMOTICON_REGEX));
    }

    @Test
    public void objects_and_symbols() {
        assertThat(faker.slackEmoji().objectsAndSymbols(), matchesRegularExpression(EMOTICON_REGEX));
    }

    @Test
    public void custom() {
        assertThat(faker.slackEmoji().custom(), matchesRegularExpression(EMOTICON_REGEX));
    }

    @Test
    public void emoji() {
        assertThat(faker.slackEmoji().emoji(), matchesRegularExpression(EMOTICON_REGEX));
    }
}
