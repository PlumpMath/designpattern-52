package com.achui.designpattern.decorate;

import org.junit.Test;


public class IPadAir2Test {

	@Test
	public void testDecorate() {
		//我要一台16G带wifi的IPAD air 2
		AbstractPad iPadAir2 = new IPadAir2();
		AbstractPad memory16 = new Memory16G(iPadAir2);
		AbstractPad wifiModule = new ModuleWithWifi(memory16);
		System.out.println(wifiModule.getDescription()+" cost:"+wifiModule.cost());
		
		//我要一台64G带wifi和4G模块的IPAD air2
		AbstractPad iPadAir64 = new IPadAir2();
		AbstractPad memory64 = new Memory64G(iPadAir64);
		AbstractPad wifiModule1 = new ModuleWithWifi(memory64);
		AbstractPad module4G = new ModuleWith4G(wifiModule1);
		System.out.println(wifiModule.getDescription()+" cost:"+module4G.cost());
	}

}
