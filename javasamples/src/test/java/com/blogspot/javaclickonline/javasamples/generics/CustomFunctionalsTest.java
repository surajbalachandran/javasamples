package com.blogspot.javaclickonline.javasamples.generics;

import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.hasItems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;


public class CustomFunctionalsTest {

	@Test
	public void testMapDefinition1() {
		
		// Invariance
		CustomFunctionals<String, Integer> customFunctionals = new CustomFunctionals<String, Integer>();
		List<String> sourceList = Arrays.asList("1", "2", "3");
		List<Integer> destList = customFunctionals.map(sourceList, new MapDefinition<String, Integer>() {
			
			public Integer map(String source) {

				return Integer.valueOf(source);
			}
		});
		assertThat(destList, hasItems(1,2,3));
	}
	
	@Test
	public void testMapDefinition2() {
		
		// Invariance
		CustomFunctionals<Rectangle, String> customFunctionals = new CustomFunctionals<Rectangle, String>();
		List<Rectangle> sourceList = new ArrayList<Rectangle>();
		sourceList.add(new Rectangle(3,2));
		List<String> destList = customFunctionals.map(sourceList, new MapDefinition<Rectangle, String>() {
			
			public String map(Rectangle source) {

				return source.showShapeAsString();
			}
		});
		assertThat(destList, hasItems("Rectangle [length: 3, width: 2]"));
	}
	
	MapDefinition<Object, String> mapDefinition = new MapDefinition<Object, String>() {
		public String map(Object source) {
			return source.toString();
		}
	};
	
	@Test
	public void testMapDefinition3() {
		
		// Covariance - ? extends Shape
		CustomFunctionals<Shape, String> customFunctionals = new CustomFunctionals<Shape, String>();
		List<Rectangle> sourceList = new ArrayList<Rectangle>();
		sourceList.add(new Rectangle(3,2));
		List<String> destList = customFunctionals.map(sourceList, new MapDefinition<Shape, String>() {
			public String map(Shape source) {
				return source.toString();
			}
		});
		assertThat(destList, hasItems("Rectangle [length: 3, width: 2]"));
	}
	@Test
	public void testMapDefinition4() {

		// Contravariance ? super AbstractShape
		CustomFunctionals<Shape, String> customFunctionals = new CustomFunctionals<Shape, String>();
		List<Rectangle> sourceList = new ArrayList<Rectangle>();
		sourceList.add(new Rectangle(3,2));
		List<String> destList = customFunctionals.map(sourceList, mapDefinition);
		assertThat(destList, hasItems("Rectangle [length: 3, width: 2]"));
	}

	@Test
	public void testMapDefinition5() {
		
		methodWithListShape(new ArrayList<Rectangle>());
	}
	public void methodWithListShape(List<? extends Shape> shapes){
		
		// Covariance - ? extends Shape
	}
}
