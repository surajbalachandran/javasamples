package com.blogspot.javaclickonline.javasamples.generics;

public class Rectangle extends AbstractShape {

	private int length;
	private int width;
	
	public Rectangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	@Override
	protected String showShapeAsString() {
		
		return "Rectangle [length: " + this.length + ", width: " + this.width + "]";
	}
	
	@Override
	public String toString() {
		
		return "Rectangle [length: " + this.length + ", width: " + this.width + "]";
	}
}
