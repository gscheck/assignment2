
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.GridBagConstraints;
import javax.swing.JFrame;

// Assignment 2
// Class: CS 410
// Author: Garth Scheck
// Rev: A.01
// Date: 5/24/2019

public class SensorTrackerMain extends JFrame {
	private static final long serialVersionUID = 1L;

	public SensorTrackerMain() {
		GridBagConstraints c = new GridBagConstraints();
		setTitle("Sensor Tracker");

		// set layout of frame
		setLayout(new GridLayout(3,1));

		// create adapters
		SensorInterface TSA = new TemperatureSensorAdapter();
		SensorInterface PSA = new PressureSensorAdapter();
		SensorInterface RSA = new RadiationSensorAdapter();

		// sensor panels
		SensorPanel tPanel = new SensorPanel(TSA);
		SensorPanel pPanel = new SensorPanel(PSA);
		SensorPanel rPanel = new SensorPanel(RSA);

		// add panels to frame
		add(tPanel);
		add(pPanel);
		add(rPanel);
		setPreferredSize(new Dimension(600,600));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		pack();
		}
	  
	
	public static void main(String[] args) {
		SensorTrackerMain app = new SensorTrackerMain();
		}
}
