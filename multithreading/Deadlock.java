class TAlfa extends Thread
{
 String res1,res2;

 TAlfa(String res1,String res2)
 {
  this.res1=res1;
  this.res2=res2;
  start();
 }

 public void run()
 {
  synchronized(res2)
  {
   System.out.println("TAlfa - locked " +res2);
   try
   {
    Thread.sleep(50);
   }
   catch(InterruptedException e) {}

   System.out.println("TAlfa - attempting to access " +res2);
 
   synchronized(res2)
   {
    System.out.println("TAlfa - locked " +res2);
   }
  }
 }
}


class TBeta extends Thread
{
 String res1,res2;

 TBeta(String res1,String res2)
 {
  this.res1=res1;
  this.res2=res2;
  start();
 }

 public void run()
 {
  synchronized(res1)
  {
   System.out.println("TBeta - locked " +res1);
   try
   {
    Thread.sleep(50);
   }
   catch(InterruptedException e) {}

   System.out.println("TBeta - attempting to access " +res1);
 
   synchronized(res1)
   {
    System.out.println("TBeta - locked " +res1);
   }
  }
 }
}


  
class Deadlock
{
 public static void main(String...arg)
 {
  String s1 ="Hyundai";;
  String s2 = "Hond";

  TAlfa ta = new TAlfa(s1,s2);
  TBeta tb = new TBeta(s1,s2);
  
  System.out.println("\nend of code..\n");
 }
}