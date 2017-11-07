package com.github.javafaker.component;


import java.util.Collection;

import com.github.javafaker.Faker;
import com.github.javafaker.FakerElement;

/**
 * Class to pick random items from a known collection, enum, array or VargArgs
 */
public class PickRandom extends FakerElement {

    /**
	 * @param faker
	 */
	public PickRandom(Faker faker) {
		super(faker);
	}

	@SuppressWarnings("unchecked")
	public < T extends Enum<T>>T fromEnum(Class<T> clazz){

        Object[] possibleValues = null;

        if(clazz != null) {

            possibleValues = clazz.getEnumConstants();

        } else {

            throw new IllegalArgumentException("The class passed in the argument is null");
        }


        return fromArray((T[]) possibleValues);
    }

    public <T > T fromArray(T[] array) {

        //Integer  randex = randomHelper.number(array.length - 1);
    	
    	Integer  randex = faker.random().nextInt(array.length - 1);

        return array[randex];
    }


    @SafeVarargs
    public final <T > T fromVarArgs(T... array){

        return fromArray(array);
    }

    @SuppressWarnings("unchecked")
    public <T > T fromCollection(Collection<T> coll){

        return fromArray((T[]) coll.toArray());
    }
}
