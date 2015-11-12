package net.juude.java.generics;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Why generics
 * 1. type cast
 * 2. type check 
 * 		1. bound 
 *      2. 
 * 3. 
 * */
public class Generics<T> {
	private T mValue;
	
	public Generics() {
	}
	
	public void setValue(T value) {
		mValue = value;
	}
	
	public T getValue() {
		return mValue;
	}
	
	public static void main(String[] args) {
		
		//int value
		Generics<Integer> intValue = new Generics<Integer>();
		intValue.setValue(100);
		System.out.println("intValue : " + intValue.getValue());
		
		//String this will not compile
		//intValue.setValue("ff");
		
		//bounds
		Generics<? extends Number> numValue = new Generics<Integer>(); //ok
		//Generics<? extends Number> numValue2 = new Generics<String>();//error

	}
	
	private void testLinkedHashMap() {
		LinkedHashMap map = new LinkedHashMap();
		map.put(1, "fsf");
		map.put("sdf", "");
	}
}
