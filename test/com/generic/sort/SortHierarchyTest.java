package com.generic.sort;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.generic.entities.ClassA;
import com.generic.entities.ClassB;
import com.generic.entities.ClassC;
import com.generic.entities.ClassD;
import com.generic.entities.IClassB;

public class SortHierarchyTest {
	
	SortHierarchy sortHierarchy = null;
	
	@Before
	public void setUp(){
		sortHierarchy = new SortHierarchy();
	}

	@Test
	public void givenRandomClassesThenSortBasedOnCondition() throws Exception {
		List<Class<?>> objects = Arrays.asList(ClassA.class,ClassB.class,ClassC.class,IClassB.class,ClassD.class);
		List<Class<?>> actual = sortHierarchy.sort(objects);
		for(Class<?> class1:actual){
			System.out.println(class1.getCanonicalName());
		}
	}
	
	@Test
	public void givenExceptionHirearchyThenSort() throws Exception {
		List<Class<?>> objects = Arrays.asList(RuntimeException.class,Exception.class);
		List<Class<?>> actual = sortHierarchy.sort(objects);
		for(Class<?> class1:actual){
			System.out.println(class1.getCanonicalName());
		}
	}
	
}
