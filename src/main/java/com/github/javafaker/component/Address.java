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

public class Address extends FakerElement {

    public Address(Faker faker) {
        super(faker);
    }

    public String streetName() {
        return faker.fakeValuesService().resolve("address.street_name", this, faker);
    }

    public String streetAddressNumber() {
        return String.valueOf(faker.random().nextInt(1000));
    }

    public String streetAddress() {
        return faker.fakeValuesService().resolve("address.street_address", this, faker);
    }

    public String streetAddress(boolean includeSecondary) {
        String streetAddress = faker.fakeValuesService().resolve("address.street_address", this, faker);
        if (includeSecondary) {
            streetAddress = streetAddress + " " + secondaryAddress();
        }
        return streetAddress;
    }

    public String secondaryAddress() {
        return faker.numerify(faker.fakeValuesService().resolve("address.secondary_address", this, faker));
    }

    public String zipCode() {
        return faker.bothify(faker.fakeValuesService().resolve("address.postcode", this, faker));
    }

    public String zipCodeByState(String stateAbbr) {
        return faker.fakeValuesService().resolve("address.postcode_by_state." + stateAbbr, this, faker);
    }

    public String streetSuffix() {
        return faker.fakeValuesService().resolve("address.street_suffix", this, faker);
    }

    public String streetPrefix() {
        return faker.fakeValuesService().resolve("address.street_prefix", this, faker);
    }

    public String citySuffix() {
        return faker.fakeValuesService().resolve("address.city_suffix", this, faker);
    }

    public String cityPrefix() {
        return faker.fakeValuesService().resolve("address.city_prefix", this, faker);
    }

    public String city() {
        return faker.fakeValuesService().resolve("address.city", this, faker);
    }

    public String cityName() {
        return faker.fakeValuesService().resolve("address.city_name", this, faker);
    }

    public String state() {
        return faker.fakeValuesService().resolve("address.state", this, faker);
    }

    public String stateAbbr() {
        return faker.fakeValuesService().resolve("address.state_abbr", this, faker);
    }

    public String firstName() {
        return faker.name().firstName();
    }

    public String lastName() {
        return faker.name().lastName();
    }

    public String latitude() {
        return String.format("%.8g", (faker.random().nextDouble() * 180) - 90);
    }

    public String longitude() {
        return String.format("%.8g", (faker.random().nextDouble() * 360) - 180);
    }

    public String timeZone() {
        return faker.fakeValuesService().resolve("address.time_zone", this, faker);
    }

    public String country() {
        return faker.fakeValuesService().resolve("address.country", this, faker);
    }

    public String countryCode() {
        return faker.fakeValuesService().resolve("address.country_code", this, faker);
    }

    public String buildingNumber() {
        return faker.numerify(faker.fakeValuesService().resolve("address.building_number", this, faker));
    }

    public String fullAddress() {
        return faker.fakeValuesService().resolve("address.full_address", this, faker);
    }
}
