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
package com.github.javafaker.matchers;

import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class CountOfCharactersMatcher extends TypeSafeMatcher<String> {

    private final char character;
    private Matcher<Integer> matcher;

    public CountOfCharactersMatcher(char character, Matcher<Integer> matcher) {
        this.character = character;
        this.matcher = matcher;
    }

    @Factory
    public static <T> Matcher<String> countOf(char character, Matcher<Integer> matcher) {
        return new CountOfCharactersMatcher(character, matcher);
    }

    @Override
    protected boolean matchesSafely(String item) {
        int count = count(item);
        return matcher.matches(count);
    }

    private int count(String item) {
        int count = 0;
        for (char c : item.toCharArray()) {
            count += (c == character) ? 1 : 0;
        }
        return count;
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("count of " + character + " ").appendDescriptionOf(matcher);
    }

    @Override
    protected void describeMismatchSafely(String item, Description mismatchDescription) {
        mismatchDescription.appendText("count of " + character + " ");
        matcher.describeMismatch(count(item), mismatchDescription);
    }
}
