//code by CW Coleman

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JavaPlot2 extends JFrame {

  public JavaPlot2() {
    super("java plot");
    setSize(800, 600);
    setVisible(true);
  }

  public void paint(Graphics g) {

    // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    // only change code below this line
    int h, k, t;
    int iRed, iGreen, iBlue, aiRed;//integer RGB
    h = 0;
    k = 0;
    t = 0;
    iRed = 127;
    iGreen = 64;
    iBlue = 0;
    aiRed = 3;  // adjust integer Red
    for (t = 0; t < 800; t++) {

      if (iRed > 255) {
        iRed = 0;
      }
      if (iRed < 0) {
        iRed = 255;
      }

      g.setColor(new Color(iRed, iGreen, iBlue));
      g.drawLine(0, 0, 800 - h, 600 + k);
      iRed = iRed + aiRed;
      h = h + 1;
      k = k + 1;

      System.out.println("Ctrl+c to stop. t = " + t + " h= " + h + " k =" + k);

      // only change code above this line
      // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    }
  }

  // execute application
  public static void main(String args[]) {
    JavaPlot2 myobject = new JavaPlot2();//change this

    // adapter to handle only windowClosing event
    myobject.addWindowListener(
        new WindowAdapter() {
          public void windowClosing(WindowEvent event) {
            System.exit(0);
          }
        }  // end anonymous inner class
    ); // end call to addWindowListener
  }
}// end class Painter
