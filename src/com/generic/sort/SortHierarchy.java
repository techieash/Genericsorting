package com.generic.sort;

import java.util.Collections;
import java.util.List;

public class SortHierarchy {

	public List<Class<?>> sort(List<Class<?>> classes) {
		Collections.sort(classes, new ClassHierarchyComparator<Class<?>>());
		
		return classes;
	}

}
