package com.blogspot.javaclickonline.javasamples.generics1;

public interface Predicate<T> {

	boolean isFilterApplicable(T source);
}
