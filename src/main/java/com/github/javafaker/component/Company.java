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
import com.github.javafaker.service.FakerIDN;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

import static org.apache.commons.lang3.StringUtils.join;

public class Company extends FakerElement {


    /**
     * @param faker
     */
    public Company(Faker faker) {
        super(faker);
    }

    public String name() {
        return faker.fakeValuesService().resolve("company.name", this, faker);
    }

    public String suffix() {
        return faker.fakeValuesService().resolve("company.suffix", this, faker);
    }

    public String industry() {
        return faker.fakeValuesService().resolve("company.industry", this, faker);
    }

    public String profession() {
        return faker.fakeValuesService().resolve("company.profession", this, faker);
    }

    public String buzzword() {
        @SuppressWarnings("unchecked") List<List<String>> buzzwordLists = (List<List<String>>) faker.fakeValuesService().fetchObject("company.buzzwords");
        List<String> buzzwords = new ArrayList<String>();
        for (List<String> buzzwordList : buzzwordLists) {
            buzzwords.addAll(buzzwordList);
        }
        return buzzwords.get(faker.random().nextInt(buzzwords.size()));
    }

    /**
     * Generate a buzzword-laden catch phrase.
     */
    public String catchPhrase() {
        @SuppressWarnings("unchecked") List<List<String>> catchPhraseLists = (List<List<String>>) faker.fakeValuesService().fetchObject("company.buzzwords");
        return joinSampleOfEachList(catchPhraseLists, " ");
    }

    /**
     * When a straight answer won't do, BS to the rescue!
     */
    public String bs() {
        @SuppressWarnings("unchecked") List<List<String>> buzzwordLists = (List<List<String>>) faker.fakeValuesService().fetchObject("company.bs");
        return joinSampleOfEachList(buzzwordLists, " ");
    }

    /**
     * Generate a random company logo url in PNG format.
     */
    public String logo() {
        int number = faker.random().nextInt(13) + 1;
        return "https://pigment.github.io/fake-logos/logos/medium/color/" + number + ".png";
    }

    public String url() {
        return join(new Object[] {"www", ".", FakerIDN.toASCII(domainName()), ".", domainSuffix()});
    }

    private String domainName() {
        return StringUtils.deleteWhitespace(name().toLowerCase().replaceAll(",", "").replaceAll("'", ""));
    }

    private String domainSuffix() {
        return faker.fakeValuesService().resolve("internet.domain_suffix", this, faker);
    }

    private String joinSampleOfEachList(List<List<String>> listOfLists, String separator) {
        List<String> words = new ArrayList<String>();
        for (List<String> list : listOfLists) {
            words.add(list.get(faker.random().nextInt(list.size())));
        }
        return join(words, separator);
    }
}
