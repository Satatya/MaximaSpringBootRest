package com.maxima.api.Maxima.util;

import java.util.ArrayList;
import java.util.List;

public class CommonUtils {

	public static boolean isListEmpty(List<?> list) {
		if (list != null && (list.size() > 0)) {
			return false;
		}
		return true;
	}

	public static <T> List<T> prepareList(T object) {
		ArrayList<T> list = new ArrayList<>();
		list.add(object);
		return list;
	}
	
	public static <T> Iterable<T> prepareIterable(T object) {
		ArrayList<T> list = new ArrayList<>();
		list.add(object);
		return list;
	}
}
