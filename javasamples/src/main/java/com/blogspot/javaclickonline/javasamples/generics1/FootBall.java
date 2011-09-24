package com.blogspot.javaclickonline.javasamples.generics1;

public class FootBall extends AbstractBall {

	private double weight;
	
	public FootBall(double weight) {
		super();
		this.weight = weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double getWeight() {
		return weight;
	}
	
	@Override
	public String ballToString() {

		return "FootBall[weight: " + this.weight + "]";
	}
}
