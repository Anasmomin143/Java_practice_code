import java.awt.*;
import java.awt.event.*;
class Fm4 extends Frame
{
Button b1=new Button("+");
Button b2=new Button("-");
Button b3=new Button("*");
Button b4=new Button("/");
Fm4()
 {
	setSize(400,700);
	setTitle("Frame");
	show();
	addWindowListener(new closeclass2());
	add(b1); add(b2); add(b3); add(b4);
	
	setLayout(new FlowLayout());
 }
public static void main(String arg[])
  {
	  new Fm4();
  }
  class closeclass2 extends WindowAdapter
   {
	  public void windowClosing(WindowEvent we)
	  {
		  System.exit(0);
	  }
   }
}
	