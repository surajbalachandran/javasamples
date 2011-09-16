package com.blogspot.javaclickonline.javasamples.generics;

import java.util.ArrayList;
import java.util.List;

public class CustomFunctionals<S,D> {

	public List<D> map(List<? extends S> sourceList, MapDefinition<? super S,D> mapDefinition) {
		
		List<D> destList = new ArrayList<D>();
		for(S source : sourceList) {
			
			destList.add(mapDefinition.map(source));
		}
		return destList;
	}
}
