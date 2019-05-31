import sensor.*;
// Assignment 2
// Class: CS 410
// Author: Garth Scheck
// Rev: A.01
// Date: 5/24/2019

// radiation sensor adapter: wraps radiation Sensor class
public class RadiationSensorAdapter implements SensorInterface {
	RadiationSensor sensor;
	public RadiationSensorAdapter()
	{
		sensor = new RadiationSensor();
	}

	// read value method returns radiation measurement
	@Override
	public double readValue() {
		return sensor.getRadiationValue();
	}

	@Override
	public String type() {
		return sensor.getName();
	}

	// return sensor report
	@Override
	public String report() {
		return sensor.getStatusInfo();
	}
}
