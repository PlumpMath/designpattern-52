package com.achui.designpattern.observer;

import java.util.Observable;
import java.util.Observer;

public class CurrentDashBoard implements Observer,DisplayElement{
	private double temperature;
	private double humidity;

	public void display() {
		System.out.println("Current conditions:" + temperature +"F degrees, "+humidity + "% humidity");
		
	}

	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData){
			WeatherData weatherData = (WeatherData)o;
			temperature = weatherData.getTemperature();
			humidity = weatherData.getHumidity();
		}
	}

}
