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
package com.github.javafaker.service;

import java.net.IDN;

/**
 * Created by tshick on 10/30/16.
 */
public class FakerIDN {
    /**
     * {@link IDN#toASCII(String)} is too picky for our needs.  It was throwing exceptions for fa.yml and
     * he.yml as they're Bidi languages and something was causing them to die.  This is kind of a brute force
     * fix but it appears to fix the issue.
     */
    public static final String toASCII(String in) {
        try {
            return IDN.toASCII(in);
        } catch (Exception e) {
            // let's continue with the character by character encoding hack.
        }
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < in.length(); i++) {
            try {
                sb.append(IDN.toASCII(in.substring(i, i + 1)));
            } catch (Exception e) {
            }
        }
        if (sb.length() == 0) {
            throw new RuntimeException("Unable to convert " + in + " to ASCII");
        }
        return sb.toString();
    }
}
