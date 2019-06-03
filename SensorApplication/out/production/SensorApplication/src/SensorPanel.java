import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import javax.swing.JLabel;

// Assignment 2
// Class: CS 410
// Author: Garth Scheck
// Rev: A.01
// Date: 5/24/2019

// Sensor Panel Class
// Displays Sensor Sub Panel
public class SensorPanel extends JPanel{

    // Constructor, accepts panel label and sensor measurement
    public SensorPanel(SensorInterface sensor)
    {
        double meas = sensor.readValue();
        String report = sensor.report();
        String panelLabel = sensor.type();
        // change to grid layout
        this.setLayout(new GridLayout(2, 0));

        // create Sub Panel
        SensorSubPanel subPanel = new SensorSubPanel(meas, report);
        subPanel.setPreferredSize(new Dimension(500, 100));
        JLabel jlabel = new JLabel(report + " --> " + Double.toString(meas));

        // add Sub Panel and label to panel
        this.add(subPanel);
        this.add(jlabel);
        this.setBorder(new TitledBorder(panelLabel));
    }

}
