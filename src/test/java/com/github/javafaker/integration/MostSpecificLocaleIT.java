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
package com.github.javafaker.integration;

import com.github.javafaker.service.FakeValuesService;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Locale;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertThat;

/**
 * The purpose of these tests is to ensure that the Locales have been properly configured
 * and that methods return values. The unit tests should ensure what the values returned
 * are correct. These tests just ensure that the methods can be invoked.
 */
public class MostSpecificLocaleIT {

    private FakeValuesService en;
    private FakeValuesService en_US;

    @Before
    public void setupFakers() {
        en = new FakeValuesService(new Locale("en"), null);
        en_US = new FakeValuesService(new Locale("en", "US"), null);
    }

    @Test
    @SuppressWarnings("unchecked")
    public void resolvesTheMostSpecificLocale() {
        final List<String> enDefaultCountries = (List<String>) en.fetchObject("address.default_country");
        final List<String> enUsDefaultCountries = (List<String>) en_US.fetchObject("address.default_country");

        assertThat(enDefaultCountries, hasSize(1));
        assertThat(enUsDefaultCountries, hasSize(3));

        assertThat("the default country for en is not en_US", enDefaultCountries, is(not(enUsDefaultCountries)));
    }
}
