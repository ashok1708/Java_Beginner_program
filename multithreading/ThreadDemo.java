class MyThd extends Thread
{
 private int lo,hi;

 MyThd(int lo,int hi)
 {
  this.lo=lo;
  this.hi=hi;
  start();
 }

 public void run()
 {
  while(lo<=hi)
  {
   System.out.println(lo);
   lo++;
  }
 }
}

class ThreadDemo 
{
 public static void main(String...arg) throws InterruptedException
 {
  System.out.println();

  MyThd x = new MyThd(40241,40250);
  MyThd y = new MyThd(3975,3985);

  x.join();
  y.join();
  
  System.out.println("\nend of code...\n");
 }
}

   