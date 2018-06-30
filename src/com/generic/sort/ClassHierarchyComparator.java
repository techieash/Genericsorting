package com.generic.sort;

import java.util.Comparator;

public class ClassHierarchyComparator<T> implements Comparator<T> {

	@Override
	public int compare(T c1, T c2) {
		if (c1.equals(c2)) {
			return 0;
		}
		if (((Class<?>) c1).isAssignableFrom((Class<?>) c2)) {
			return -1;
		} else if (((Class<?>) c2).isAssignableFrom((Class<?>) c1)) {
			return 1;
		}
		return 0;
	}

}
