package com.blogspot.javaclickonline.javasamples.generics1;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.matchers.JUnitMatchers.*;
import static org.hamcrest.CoreMatchers.*;

public class CustomFiltersTests {

	@Test
	public void testFilterPredicate1() {
		
		CustomFilters<Integer> customFilters = new CustomFilters<Integer>();
		
		List<Integer> sourceList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> destList = customFilters.filter(sourceList, new Predicate<Integer>() {
			
			public boolean isFilterApplicable(Integer source) {

				if(source >= 4 && source <=8) {
					
					return true;
				}
				return false;
			}
		});
		assertThat(destList, hasItems(4,5,6,7,8));
	}
	
	@Test
	public void testFilterPredicate2() {
		
		CustomFilters<FootBall> customFilters = new CustomFilters<FootBall>();
		
		List<FootBall> sourceList = Arrays.asList(new FootBall(10.1), new FootBall(12.2), new FootBall(13.3), new FootBall(12.0));
		List<FootBall> destList = customFilters.filter(sourceList, new Predicate<FootBall>() {
			
			public boolean isFilterApplicable(FootBall source) {

				if(Double.valueOf(source.getWeight()) >= 12 && Double.valueOf(source.getWeight()) <=13) {
					
					return true;
				}
				return false;
			}
		});
		assertThat(destList.size(), is(2));
	}
}
