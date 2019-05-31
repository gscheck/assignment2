import sensor.*;
// Assignment 2
// Class: CS 410
// Author: Garth Scheck
// Rev: A.01
// Date: 5/24/2019

// temperature sensor adapter: wraps temperature Sensor class
public class TemperatureSensorAdapter implements SensorInterface {
	TemperatureSensor sensor;

	public TemperatureSensorAdapter()
	{
		sensor = new TemperatureSensor();
	}

	// read value method returns temperature measurement
	@Override
	public double readValue() {
		return sensor.senseTemperature();
	}

	// return sensor type
	@Override
	public String type() {
		return sensor.getSensorType();
	}

	// return sensor report
	@Override
	public String report() {
		return sensor.getTempReport();
	}
}
