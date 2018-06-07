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

import com.github.javafaker.Faker;

public class EnIdNumber {
    private static final String[] invalidSSNPatterns = {"0{3}-\\\\d{2}-\\\\d{4}", "\\d{3}-0{2}-\\d{4}", "\\d{3}-\\d{2}-0{4}", "666-\\d{2}-\\d{4}", "9\\d{2}-\\d{2}-\\d{4}"};

    public String getValidSsn(Faker f) {
        String ssn = f.regexify("[0-8]\\d{2}-\\d{2}-\\d{4}");

        boolean isValid = true;
        for (int i = 0; i < invalidSSNPatterns.length; i++) {
            if (ssn.matches(invalidSSNPatterns[i])) {
                isValid = false;
                break;
            }
        }
        if (!isValid) {
            ssn = getValidSsn(f);
        }
        return ssn;
    }
}
