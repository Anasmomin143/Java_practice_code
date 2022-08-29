import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class P17 extends Frame implements ActionListener
{
	Label lb1=new Label("Enter city name");
	TextField tf1=new TextField(100);
	Checkbox cb1=new Checkbox("BOLD");
	Checkbox cb2=new Checkbox("ITALIC");
	Button b2=new Button("close");
	P17()
	{
		setSize(800,500);
		setTitle("Style");
		show();
		setLayout(new FlowLayout());
		add(lb1); add(tf1);
		add(b2);
		b1.addActionListener(this);
		cb1.addMouseListener (new Eventclass ());
		cb2.addMouseListener (new Eventclass ());
	}
	public static void main (String arg[])
	   {
		  P17();
	   }
	  class Eventclass extends MouseAdapter
	  {
		  public void mouseClicked(MouseEvent e)
		  {
            public void actionPerformed(ActionEvent ae) 
		  }
		  JOptionPane.showMessageDialog(new JFrame(),"cb1"+cb1.getState()+"cb2="+cb2.getState());
          tf1.getText();tf1.setText();
		  if(cb1.getState())
		  tf1.setFont(new font("BOLD"));
	      if(cb2.getState())
		  tf1.setFont(new font("Italic"));
	  }
}
          