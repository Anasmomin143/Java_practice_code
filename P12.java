import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class P12 extends Frame implements ActionListener
{
	Label lb1=new Label("Prod_name");
	TextField tf1=new TextField(100);
	Label lb2=new Label("Rate");
	TextField tf2=new TextField(80);
	Label lb3=new Label("Qty");
	TextField tf3=new TextField(80);
	
    Button b1=new Button("ok");
	
	Label lb4=new Label("Amount");
    TextField tf4=new TextField(50);
	Label lb5=new Label("Disc");
	TextField tf5=new TextField(60);
	Label lb6=new Label ("VAT");
    TextField tf6=new TextField(50);
	Label lb7=new Label("Total_amount");
	TextField tf7=new TextField(80);
	Checkbox cb1=new Checkbox("promo");
	Checkbox cb2=new Checkbox("other");
	Label lb8=new Label("Final_amount");
	TextField tf8=new TextField(80);
	Button b2=new Button("Exit");
	P12()
	{
		setSize(800,800);
		setTitle("Bill");
		show();
		setLayout(new FlowLayout());
		add(lb1); add(tf1);
		add(lb2); add(tf2);
		add(lb3); add(tf3);
		add(b1);
		add(lb4); add(tf4);
		add(lb5); add(tf5);
		add(lb6); add(tf6);
		add(lb7); add(tf7);
		add(b2);
		add(cb1); add(cb2);
		add(lb8); add(tf8);
		b1.addActionListener(this);
	    b2.addActionListener(this);
	    cb1.addMouseListener (new Eventclass ());
		cb2.addMouseListener (new Eventclass());

	}
	public static void main (String arg[])
	  { 
		 new P12();
	  }
	  class Eventclass extends MouseAdapter
	  {
		 public void mouseClicked(MouseEvent e)
		  {  
	       int promo=0,other=0;Double Total_amt,Final_amount;
	        JOptionPane.showMessageDialog(new JFrame(),"cb1"+cb1.getState()+"cb2="+cb2.getState());
			if(cb1.getState())
			 promo=5;
		    else
				promo=0;
			if(cb2.getState())
			 other=10;
		    else
			 other=0;
		    Total_amt=Double.parseDouble(tf7.getText());
			Final_amount=Total_amt-promo-other;
			tf8.setText(""+Final_amount);
			
		  }
	  }

         public void actionPerformed(ActionEvent ae)
		 {
             String s; int r,q,amt;Double disc,vat,Total_amt;
			 s=tf1.getText();
			 s=tf2.getText();
			 r=Integer.parseInt(s);
			 s=tf3.getText();
			 q=Integer.parseInt(s);
			 if(ae.getSource()==b1)
			{
	           amt=r*q;
			   tf4.setText(""+amt);
			   disc=(amt*(5.5)/100);
			   tf5.setText(""+disc);
			   vat=(amt*(3.4)/100);
			   tf6.setText(""+vat);
			   Total_amt=(amt+vat)-disc;
			   tf7.setText(""+Total_amt);
		    }
		  if(ae.getSource()==b2)
		   {
            System.exit(0);	
		   }			
	    }
}
		   