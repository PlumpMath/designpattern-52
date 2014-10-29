package com.achui.designpattern.decorate;

public class Memory64G extends AbstractPad{
	AbstractPad pad;
	
	public Memory64G(AbstractPad pad){
		this.pad = pad;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return pad.getDescription() + " memory 64G";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return pad.cost() + 500;
	}
}
