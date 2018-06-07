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
import org.apache.commons.lang3.StringUtils;

public class Name extends FakerElement {

    /**
     * @param faker
     */
    public Name(Faker faker) {
        super(faker);
    }

    /**
     * <p>
     * A multipart name composed of an optional prefix, a firstname and a lastname
     * or other possible variances based on locale.  Examples:
     * <ul>
     * <li>James Jones Jr.</li>
     * <li>Julie Johnson</li>
     * </ul>
     * </p>
     *
     * @return a random name with given and family names and an optional suffix.
     */
    public String name() {
        return faker.fakeValuesService().resolve("name.name", this, faker);
    }

    /**
     * <p>
     * A multipart name composed of an optional prefix, a given and family name,
     * another 'firstname' for the middle name and an optional suffix such as Jr.
     * Examples:
     * <ul>
     * <li>Mrs. Ella Geraldine Fitzgerald</li>
     * <li>Jason Tom Sawyer Jr.</li>
     * <li>Helen Jessica Troy</li>
     * </ul>
     * </p>
     *
     * @return a random name with a middle name component with optional prefix and suffix
     */
    public String nameWithMiddle() {
        return faker.fakeValuesService().resolve("name.name_with_middle", this, faker);
    }

    /**
     * <p>Returns the same value as {@link #name()}</p>
     *
     * @see Name#name()
     */
    public String fullName() {
        return name();
    }

    /**
     * <p>Returns a random 'given' name such as Aaliyah, Aaron, Abagail or Abbey</p>
     *
     * @return a 'given' name such as Aaliyah, Aaron, Abagail or Abbey
     */
    public String firstName() {
        return faker.fakeValuesService().resolve("name.first_name", this, faker);
    }

    /**
     * <p>Returns a random last name such as Smith, Jones or Baldwin</p>
     *
     * @return a random last name such as Smith, Jones or Baldwin
     */
    public String lastName() {
        return faker.fakeValuesService().resolve("name.last_name", this, faker);
    }

    /**
     * <p>Returns a name prefix such as Mr., Mrs., Ms., Miss, or Dr.</p>
     *
     * @return a name prefix such as Mr., Mrs., Ms., Miss, or Dr.
     */
    public String prefix() {
        return faker.fakeValuesService().resolve("name.prefix", this, faker);
    }

    /**
     * <p>Returns a name suffix such as Jr., Sr., I, II, III, IV, V, MD, DDS, PhD or DVM</p>
     *
     * @return a name suffix such as Jr., Sr., I, II, III, IV, V, MD, DDS, PhD or DVM
     */
    public String suffix() {
        return faker.fakeValuesService().resolve("name.suffix", this, faker);
    }

    /**
     * <p>
     * A three part title composed of a descriptor level and job.  Some examples are :
     * <ul>
     * <li>(template) {descriptor} {level} {job}</li>
     * <li>Lead Solutions Specialist</li>
     * <li>National Marketing Manager</li>
     * <li>Central Response Liaison</li>
     * </ul>
     * </p>
     *
     * @return a random three part job title
     */
    public String title() {
        return StringUtils.join(new String[] {faker.fakeValuesService().resolve("name.title.descriptor", this, faker), faker.fakeValuesService().resolve("name.title.level", this, faker),
            faker.fakeValuesService().resolve("name.title.job", this, faker)}, " ");
    }

    /**
     * <p>
     * A lowercase username composed of the first_name and last_name joined with a '.'. Some examples are:
     * <ul>
     * <li>(template) {@link #firstName()}.{@link #lastName()}</li>
     * <li>jim.jones</li>
     * <li>jason.leigh</li>
     * <li>tracy.jordan</li>
     * </ul>
     * </p>
     *
     * @return a random two part user name.
     * @see Name#firstName()
     * @see Name#lastName()
     */
    public String username() {
        return StringUtils.join(new String[] {firstName().replaceAll("'", "").toLowerCase(), ".", lastName().replaceAll("'", "").toLowerCase()});
    }
}
