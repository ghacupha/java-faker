package com.github.javafaker.component;

import java.util.List;

import com.github.javafaker.Faker;
import com.github.javafaker.FakerElement;

/**
 * Pick random items from items provided through varargs string parameters an
 * enum or array.
 * 
 * @deprecated This class's methods have been implemented afresh in {@code PickRandom} 
 * class where all arguments are generic making the object more dynamic
 * 
 * @see {@code PickRandom}
 * @author edwin.njeru
 *
 */
@Deprecated
public class Options extends FakerElement {

    /**
	 * @param faker
	 */
	public Options(Faker faker) {
		super(faker);
	}

	public String option(String... options) {
        return options[faker.random().nextInt(options.length)];
    }

    public <E extends Enum<E>> E option(Class<E> enumeration) {
        E[] enumConstants = enumeration.getEnumConstants();
        return enumConstants[faker.random().nextInt(enumConstants.length)];
    }

    /**
     * Returns a random element from an array.
     *
     * @param array The array to take a random element fom.
     * @param <E>   The type of the elements in the array.
     * @return A randomly selected element from the array.
     */
    public <E> E nextElement(E[] array) {
        return array[faker.random().nextInt(array.length)];
    }

    /**
     * Returns a random element from a list.
     *
     * @param list The list to take a random element fom.
     * @param <E>  The type of the elements in the list.
     * @return A randomly selected element from the list.
     */
    public <E> E nextElement(List<E> list) {
        return list.get(faker.random().nextInt(list.size()));
    }
}
