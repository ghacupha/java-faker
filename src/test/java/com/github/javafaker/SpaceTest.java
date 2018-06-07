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

public class SpaceTest extends AbstractFakerTest {

    @Test
    public void planet() {
        assertThat(faker.space().planet(), matchesRegularExpression("(\\w+ ?){2,3}"));
    }

    @Test
    public void moon() {
        assertThat(faker.space().moon(), matchesRegularExpression("(\\w+ ?){2,3}"));
    }

    @Test
    public void galaxy() {
        assertThat(faker.space().galaxy(), matchesRegularExpression("(\\w+ ?){2,3}"));
    }

    @Test
    public void nebula() {
        assertThat(faker.space().nebula(), matchesRegularExpression("(\\w+ ?){2,3}"));
    }

    @Test
    public void starCluster() {
        assertThat(faker.space().starCluster(), matchesRegularExpression("(\\w+[ -]?){1,3}"));
    }

    @Test
    public void constellation() {
        assertThat(faker.space().constellation(), matchesRegularExpression("(\\w+ ?){2,3}"));
    }

    @Test
    public void star() {
        assertThat(faker.space().star(), matchesRegularExpression("(\\w+[ -]?){2,3}"));
    }

    @Test
    public void agency() {
        assertThat(faker.space().agency(), matchesRegularExpression("(\\w+ ?){2,5}"));
    }

    @Test
    public void agencyAbbreviation() {
        assertThat(faker.space().agencyAbbreviation(), matchesRegularExpression("(\\w+ ?){2,3}"));
    }

    @Test
    public void nasaSpaceCraft() {
        assertThat(faker.space().nasaSpaceCraft(), matchesRegularExpression("(\\w+ ?){2,3}"));
    }

    @Test
    public void company() {
        assertThat(faker.space().company(), matchesRegularExpression("(\\w+ ?){2,4}"));
    }

    @Test
    public void distanceMeasurement() {
        assertThat(faker.space().distanceMeasurement(), matchesRegularExpression("(\\w+ ?){2,3}"));
    }

    @Test
    public void meteorite() {
        assertThat(faker.space().meteorite(), matchesRegularExpression("(?U)([\\w()]+[ -–]?){1,4}"));
    }
}
