package com.achui.designpattern.observer;

import java.util.Observable;

public class WeatherData extends Observable{
	
	private double temperature;
	private double pressure;
	private double humidity;
	
	public void weatherDataChanged(double temperature, double pressure, double humidity){
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		this.setChanged();
		this.notifyAll();
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	public double getPressure() {
		return pressure;
	}
	public void setPressure(double pressure) {
		this.pressure = pressure;
	}
	public double getHumidity() {
		return humidity;
	}
	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}
	
}
