package net.juude.java.generics;

import java.util.ArrayList;
import java.util.Collection;


public class CollectionUtils {
	
	@SuppressWarnings("unchecked")
	public static <T> Collection<T> filter(Collection<T> collection, Predicate<T> predicate) {
		if(collection == null || predicate == null) {
			return null;
		}
		Collection<T> resultCollections = null; 
		try {
			resultCollections = collection.getClass().newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
			return null;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			return null;
		}
		for(T item : collection) {
			if(predicate.apply(item)) {
				resultCollections.add(item);
			}
		}
		return resultCollections;
	}
	
	public static void main(String[] args) {
		ArrayList<String> strings= new ArrayList<String>();
		strings.add("a");
		strings.add("b");
		strings.add("abd");
		strings.add("c");
		strings.add("jlsf");
		strings.add("f");
		strings.add(null);
		strings.add("null");
		Collection<String> s = filter(strings, new Predicate<String>() {
			@Override
			public boolean apply(String input) {
				return input != null && input.length() == 1;
			}
		});
		System.out.println(strings);
		System.out.println(s + "  " + s.getClass());
	}
}
