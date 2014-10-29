package com.achui.designpattern.observer;

import org.junit.Test;

public class WeatherDataTest {

	@Test
	public void test() {
		WeatherData weatherData = new WeatherData();
		weatherData.addObserver(new CurrentDashBoard());
		
		weatherData.weatherDataChanged(100, 50, 82.8);
		weatherData.weatherDataChanged(106, 80, 100.7);
	}

}
