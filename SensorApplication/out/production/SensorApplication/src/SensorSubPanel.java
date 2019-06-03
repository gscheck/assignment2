
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

// Assignment 2
// Class: CS 410
// Author: Garth Scheck
// Rev: A.01
// Date: 5/24/2019

// Sub Panel
// Contains rectangle for representing sensor measurement
public class SensorSubPanel extends JPanel {
  private int lMeas = 0;
  String lReport;

  // constructor
  public SensorSubPanel(double meas, String report)
  {
    lReport = report;
    lMeas = scale(meas);
  }

  // paint method for creating rectangle
  public void paint(Graphics g) {
    if(lReport.contains("DANGER"))
      g.setColor(Color.red);
    else if(lReport.contains("CRITICAL"))
      g.setColor(Color.yellow);
    else
      g.setColor(Color.green);

    g.fillRect(5,5, lMeas,50);

  }

  private int scale(double meas)
  {
      double sc = 1.6;
      return (int) (meas * sc);

  }

}