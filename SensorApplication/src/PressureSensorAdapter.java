import sensor.*;
// Assignment 2
// Class: CS 410
// Author: Garth Scheck
// Rev: A.01
// Date: 5/24/2019

// pressure sensor adapter: wraps Pressure Sensor class
public class PressureSensorAdapter implements SensorInterface {
	PressureSensor sensor;
	public PressureSensorAdapter()
	{
		sensor = new PressureSensor();
	}
	// read value method returns pressure measurement
	@Override
	public double readValue() {
		return sensor.readValue();
	}

	@Override
	public String type() {
		return sensor.getSensorName();
	}

	// return sensor report
	@Override
	public String report() {
		return sensor.getReport();
	}
}
