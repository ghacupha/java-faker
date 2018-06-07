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

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class RandomFakerTest extends AbstractFakerTest {

    private static final int CONSTANT_SEED_VALUE = 10;
    private Faker faker;
    private Random random;

    @Before
    public void before() {
        super.before();
        random = new Random();
        faker = new Faker(random);
    }

    @Test
    public void testNumerifyRandomnessCanBeControlled() {
        resetRandomSeed();
        final String firstInvocation = faker.numerify("###");

        resetRandomSeed();
        final String secondInvocation = faker.numerify("###");
        assertThat(firstInvocation, is(secondInvocation));
    }

    @Test
    public void testLetterifyRandomnessCanBeControlled() {
        resetRandomSeed();
        final String firstInvocation = faker.letterify("???");

        resetRandomSeed();
        final String secondInvocation = faker.letterify("???");
        assertThat(firstInvocation, is(secondInvocation));
    }

    @Test
    public void testNameRandomnessCanBeControlled() {
        resetRandomSeed();
        final String firstInvocation = faker.name().name();

        resetRandomSeed();
        final String secondInvocation = faker.name().name();
        assertThat(firstInvocation, is(secondInvocation));
    }

    @Test
    public void testEmailRandomnessCanBeControlled() {
        resetRandomSeed();
        final String firstInvocation = faker.internet().emailAddress();

        resetRandomSeed();
        final String secondInvocation = faker.internet().emailAddress();
        assertThat(firstInvocation, is(secondInvocation));
    }

    private void resetRandomSeed() {
        random.setSeed(CONSTANT_SEED_VALUE);
    }
}
