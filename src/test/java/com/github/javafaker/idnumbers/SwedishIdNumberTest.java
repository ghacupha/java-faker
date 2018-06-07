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
package com.github.javafaker.idnumbers;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class SwedishIdNumberTest {

    @Test
    public void valid() {
        SvSEIdNumber idNumber = new SvSEIdNumber();
        assertThat(idNumber.validSwedishSsn("670919-9530"), is(true));
        assertThat(idNumber.validSwedishSsn("811228-9874"), is(true));
    }

    @Test
    public void invalid() {
        SvSEIdNumber idNumber = new SvSEIdNumber();
        assertThat(idNumber.validSwedishSsn("8112289873"), is(false));
        assertThat(idNumber.validSwedishSsn("foo228-9873"), is(false));
        assertThat(idNumber.validSwedishSsn("811228-9873"), is(false));
        assertThat(idNumber.validSwedishSsn("811228-9875"), is(false));
        assertThat(idNumber.validSwedishSsn("811200-9874"), is(false));
        assertThat(idNumber.validSwedishSsn("810028-9874"), is(false));
    }
}
