package com.achui.designpattern.decorate;

public class Memory16G extends PadDecorate{
	
	public Memory16G(AbstractPad pad){
		this.pad = pad;
	}

	AbstractPad pad;
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return pad.getDescription() + " memory 16G";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return pad.cost() + 500;
	}

}
