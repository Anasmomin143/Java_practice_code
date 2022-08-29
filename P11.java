import java.awt.*;
import java.awt.event.*;
class P11 extends Frame implements ActionListener
{
	Label lb1=new Label("Enter 1st no");
	TextField tf1=new TextField(50);
	Label lb2=new Label("Enter 2nd no");
	TextField tf2=new TextField(50);
	Label lb3=new Label("Result");
	TextField tf3=new TextField(50);
	Button b1=new Button("+");
	Button b2=new Button("-");
	Button b3=new Button("*");
	Button b4=new Button("/");
	Button b5=new Button("exit");
	P11()
	{
		setSize(500,500);
		setTitle("TF");
		show();
		setLayout(new FlowLayout());
		add(lb1); add(tf1);
		add(lb2); add(tf2);
		add(b1); add(b2); add(b3); add(b4);
		add(lb3); add(tf3);
		add(b1);
		b1.addActionListener(this);
    }
	public static void main (String arg[])
	  {
		  new P11();
	  }
	  public void actionPerformed(ActionEvent ae)
	   {
		  String s; int a,b; Double add,sub,multi,div;
		  s=tf1.getText();
		  s=tf2.getText();
		  a=Integer.parseInt(s);
		  s=tf3.getText();
		  b=Integer.parseInt(s);
		  if(ae.getSource()==b1)
		   {
			  add=a+b;
			  tf3.setText(""+result);
			  sub=a-b;
			  tf3.setText(""+result);
			  multi=a*b;
			  tf3.setText(""+result);
			  div=a/b;
           }
		if(ae.getSource()==b2)
		 {
            System.exit(0);	
		 }			
	   }
}
			  