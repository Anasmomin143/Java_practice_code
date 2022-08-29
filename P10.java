import java.awt.*;
import java.awt.event.*;
class P10 extends Frame implements ActionListener
{
	Label lb1=new Label("Enter a text");
	Label lb2=new Label("copied text");
    Button b1=new Button("copy-paste");
	TextField tf1= new TextField(50);
	TextField tf2= new TextField(50);
	P10()
	{
		setSize(500,500);
		setTitle("Text Field");
		show();
		setLayout(new FlowLayout());
		add(lb1); add(tf1); add(b1);
		add(lb2); add(tf2);
		b1.addActionListener(this);
	}
	public static void main (String arg[])
	  {
		  new P10();
	  }
	  public void actionPerformed(ActionEvent ae)
	    {
			String s=tf1.getText();
			tf2.setText(s);
		}
}