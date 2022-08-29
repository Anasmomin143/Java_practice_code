import java.awt.*;
import java.awt.event.*;
import java.util.*;
class P9 extends Frame implements ActionListener,Runnable
{
	Label lb1=new Label("D&T");
	Button b1=new Button("start");
	Thread th;
	P9()
	{
	setSize(500,500);
	setTitle("D&T");
	show();
	setLayout(new FlowLayout());
	add(lb1); add(b1);
	th=new Thread(this);
	b1.addActionListener(this);
	} 
	 public static void main (String arg[])
	  {
		new P9();
      }
	public void actionPerformed(ActionEvent ae)
	   {
		th.start();
	   }
	public void run()
	{ 
	  try
        {
		 for(;;)
		    {
		
	 lb1.setText(" "+new Date());
	 th.sleep (1000);
		    }
	    
        }catch(Exception ex){}
    }

} 