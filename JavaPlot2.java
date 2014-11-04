//JavaPlot2 code by CWColeman

import java.awt.*;
import java.awt.event.*; 
import javax.swing.*;

 class Wait {
  public static void oneSec() {
     try {
       Thread.currentThread().sleep(1000);
       }
     catch (InterruptedException e) {
       e.printStackTrace();
       }
     }  
  public static void manySec(long s) {
     try {
       Thread.currentThread().sleep(s * 1000);
       }
     catch (InterruptedException e) {
       e.printStackTrace();
       }
     }
      public static void millSec(long s) {
     try {
       Thread.currentThread().sleep(s);
       }
     catch (InterruptedException e) {
       e.printStackTrace();
       }
     }
}


public class JavaPlot2 extends JFrame { 

   public JavaPlot2()
   {
      super( "java plot" );
      setSize(800,600);  
      setVisible( true );   
   }

   public void paint( Graphics g )
   {
	   int x, y, h, k, t;	
	   int iRed, iGreen, iBlue;//integer RGB
	   double sRed, sGreen, sBlue;// double start RGB
	   double eRed, eGreen, eBlue;// double end RGB
	   double aRed, aGreen, aBlue;// ajust RGB
		x = 0;  y = 0; h = 0; k = 0; t = 0;
	for (t = 0;t <800;t++){
		// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		// only change code below this line
		iRed = 127;
		iGreen = 64;
		iBlue = 0;
			
		g.setColor(new Color(iRed,iGreen,iBlue));
		g.drawLine(0,0,800-h,600+k);
		h = h + 1;
		k = k + 1;
		
		// call to Wait class
		System.out.println("Ctrl+c to stop. t = " + t+" h= "+h+" k ="+k);
		//Wait.millSec(125);
	
		// only change code above this line
		// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	} 
}

  // execute application
   public static void main( String args[] )
   {
	   JavaPlot2 myobject = new JavaPlot2();//change this 
	 
	   	// adapter to handle only windowClosing event
		myobject.addWindowListener(
			new WindowAdapter() {
				public void windowClosing( WindowEvent event )
				{System.exit( 0 );}
			}  // end anonymous inner class
		); // end call to addWindowListener
   }
}// end class Painter

