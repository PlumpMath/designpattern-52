package com.achui.designpattern.strategy;

import org.junit.Test;

public class PersonTest {

	@Test
	public void testTravel() {
		//我要坐飞机去上海
		Person person1 = new Person();
		person1.setTarget("目的地上海");
		person1.setStrategy(new ByAirStrategy());
		person1.travel();
		//我要坐船去鼓浪屿
		Person person2 = new Person();
		person2.setTarget("目的地鼓浪屿");
		person2.setStrategy(new ByShipStrategy());
		person2.travel();
		//我要公交去上班
		Person person3 = new Person();
		person1.setTarget("目的地公司");
		person3.setStrategy(new ByBusStrategy());
		person3.travel();
	}

}
