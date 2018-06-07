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

import java.text.DecimalFormat;
import java.util.SortedSet;
import java.util.TreeSet;

public class Commerce extends FakerElement {

    /**
     * @param faker
     */
    public Commerce(Faker faker) {
        super(faker);
    }

    public String color() {
        return faker.fakeValuesService().resolve("color.name", this, faker);
    }

    public String department() {
        int numberOfDepartments = Math.max(faker.random().nextInt(4), 1);
        SortedSet<String> departments = new TreeSet<String>();
        while (departments.size() < numberOfDepartments) {
            departments.add(faker.fakeValuesService().resolve("commerce.department", this, faker));
        }
        if (departments.size() > 1) {
            String lastDepartment = departments.last();
            return StringUtils.join(departments.headSet(lastDepartment), ", ") + " & " + lastDepartment;
        } else {
            return departments.first();
        }
    }

    public String productName() {
        return StringUtils.join(
            new String[] {faker.fakeValuesService().resolve("commerce.product_name.adjective", this, faker), faker.fakeValuesService().resolve("commerce.product_name.material", this, faker),
                faker.fakeValuesService().resolve("commerce.product_name.product", this, faker)}, " ");
    }

    public String material() {
        return faker.fakeValuesService().resolve("commerce.product_name.material", this, faker);
    }

    /**
     * Generate a random price between 0.00 and 100.00
     */
    public String price() {
        return price(0, 100);
    }

    public String price(double min, double max) {
        double price = min + (faker.random().nextDouble() * (max - min));
        return new DecimalFormat("#0.00").format(price);
    }

    public String promotionCode() {
        return promotionCode(6);
    }

    public String promotionCode(int digits) {
        return StringUtils.join(faker.resolve("commerce.promotion_code.adjective"), faker.resolve("commerce.promotion_code.noun"), faker.number().digits(digits));
    }
}
