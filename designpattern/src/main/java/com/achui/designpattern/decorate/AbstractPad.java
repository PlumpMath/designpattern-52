package com.achui.designpattern.decorate;

public abstract class AbstractPad {

	String description ="Unknown Phone";
	
	public abstract double cost();

	public String getDescription() {
		return description;
	}

}
