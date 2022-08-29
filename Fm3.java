import java.awt.*;
import java.awt.event.*;
class Fm3 extends Frame
{
Button b1=new Button("ok");
Button b2=new Button("cancel");
Fm3()
 {
	setSize(400,700);
	setTitle("Frame");
	show();
	addWindowListener(new closeclass1());
	add(b1); add(b2);
	setLayout(new FlowLayout());
 }
public static void main(String arg[])
  {
	  new Fm3();
  }
  class closeclass1 extends WindowAdapter
   {
	  public void windowClosing(WindowEvent we)
	  {
		  System.exit(0);
	  }
   }
}
	