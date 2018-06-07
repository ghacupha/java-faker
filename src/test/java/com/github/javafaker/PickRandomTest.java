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

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertTrue;

public class PickRandomTest {

    private Faker faker;

    @Before
    public void setUp() throws Exception {

        faker = new Faker();
    }

    @Test
    public void fromEnum() throws Exception {

        Enum money = faker.pickRandom().fromEnum(CurrencyEnum.class);

        Collection currencyCollection = Arrays.asList(CurrencyEnum.class.getEnumConstants());

        assertTrue(currencyCollection.contains(money));
    }

    @Test
    public void valuesFromEnum() throws Exception {

        Enum money = faker.pickRandom().fromEnum(CurrencyEnum.class);

        Collection currencyCollection = Arrays.asList(CurrencyEnum.class.getEnumConstants());

        assertTrue(currencyCollection.contains(money));
    }

    @Test
    public void fromArray() throws Exception {

        String[] workWeek = new String[] {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        String workDay = faker.pickRandom().fromArray(workWeek);

        Collection workWkColl = Arrays.asList(workWeek);

        assertTrue(workWkColl.contains(workDay));
    }

    @Test
    public void fromVarArgs() throws Exception {

        String[] workWeek = new String[] {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        String workDay = faker.pickRandom().fromVarArgs("Monday", "Tuesday", "Wednesday", "Thursday", "Friday");

        Collection workWkColl = Arrays.asList(workWeek);

        assertTrue(workWkColl.contains(workDay));
    }

    @Test
    public void fromCollection() throws Exception {

        String[] workWeek = new String[] {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        Collection<String> coll = Arrays.asList(workWeek);

        String workDay = faker.pickRandom().fromCollection(coll);

        Collection workWkColl = Arrays.asList(workWeek);

        assertTrue(workWkColl.contains(workDay));
    }

    private enum CurrencyEnum {
        KES(1.00), USD(103.31), GBP(138.3373), EUR(121.12), TZS(0.0463858), UGX(0.0300622);

        double rate = 0.00;

        CurrencyEnum(double r) {
            rate = r;
        }
    }
}