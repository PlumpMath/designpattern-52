package com.achui.designpattern.decorate;

public class WifiModule extends PadDecorate{

	AbstractPad pad;
	public WifiModule(AbstractPad pad){
		this.pad = pad;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return pad.getDescription() + " with Wifi";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return pad.cost() + 400;
	}

}
