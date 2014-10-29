package com.achui.designpattern.decorate;

public class ModuleWith4G extends PadDecorate{

	AbstractPad pad;
	
	public ModuleWith4G(AbstractPad pad){
		this.pad = pad;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return pad.getDescription()+" with 4G";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0;
	}

}
