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

public class WitcherTest extends AbstractFakerTest {

    @Test
    public void testCharacter() {
        assertThat(faker.witcher().character(), matchesRegularExpression("[A-Za-z' -éúï]+"));
    }

    @Test
    public void testWitcher() {
        assertThat(faker.witcher().character(), matchesRegularExpression("[A-Za-z -ë]+"));
    }

    @Test
    public void testSchool() {
        assertThat(faker.witcher().school(), matchesRegularExpression("[A-Za-z]+"));
    }

    @Test
    public void testLocation() {
        assertThat(faker.witcher().location(), matchesRegularExpression("[A-Za-z -áâé]+"));
    }

    @Test
    public void testQuote() {
        assertThat(faker.witcher().quote(), matchesRegularExpression("[A-Za-z0-9 …\\?\\!\\.’',]+"));
    }

    @Test
    public void testMonster() {
        assertThat(faker.witcher().monster(), matchesRegularExpression("[A-Za-z -]+"));
    }
}
