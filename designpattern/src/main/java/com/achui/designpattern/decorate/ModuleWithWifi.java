package com.achui.designpattern.decorate;

public class ModuleWithWifi extends PadDecorate{

	AbstractPad pad;
	public ModuleWithWifi(AbstractPad pad){
		this.pad = pad;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return pad.getDescription() + " with WIFI";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return pad.cost() + 400;
	}

}
