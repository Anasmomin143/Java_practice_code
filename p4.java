class Th implements Runnable
{
 Thread ob;
 Th()
   {
 ob=new Thread(this);
 ob.start();
   }
 public void run ( )
  {
 try
    {
	for(int i=1;i<=30;i++)
	 {
	 System.out.print("Hello\n");
	 ob.sleep(1000);
	 }
	}catch(Exception ex){}
  }
}
class p4
{
public static void main(String arg[])
 {
  new Th();
 }
}