package com.blogspot.javaclickonline.javasamples.generics1;

import java.util.ArrayList;
import java.util.List;

public class CustomFilters<T> {

	public List<T> filter(List<T> sourceList, Predicate<T> filterPredicate) {
		
		List<T> destList = new ArrayList<T>();
		for(T source : sourceList) {
			
			
			if(filterPredicate.isFilterApplicable(source)) {
				destList.add(source);
			}
		}
		return destList;
	}
}
