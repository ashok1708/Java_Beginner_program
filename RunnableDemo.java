//MultiTHreading by implementing the Runnable Interface

class MyRun implements Runnable
{
 private int lo,hi;
 private Thread thd;

 MyRun(int lo,int hi)
 {
  this.lo=lo;
  this.hi=hi;

  //thd = new Thread();
  thd = new Thread(this);
  thd.start();
 }

 void join() throws InterruptedException
 {
  thd.join();
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

class RunnableDemo 
{
 public static void main(String...arg) throws InterruptedException
 {
  System.out.println();

  MyRun x = new MyRun(40241,40250);
  MyRun y = new MyRun(3975,3985);

  x.join();
  y.join();
  
  System.out.println("\nend of code...\n");
 }
}

   