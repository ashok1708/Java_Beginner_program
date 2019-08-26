class Resource
{
 private static final String words[]={"Zero ","One ","Two ","Three ","Four ","Five ","Six ","Seven ","Eight ","Nine ",};
 
 /*synchronized*/ void print(int n)
 {
  System.out.println();
  for(char c : String.valueOf(n).toCharArray())
  {
   for(char x : words[c-48].toCharArray())
   {
    System.out.print(x);
    try
    {
     Thread.sleep(10);
    }
    catch(InterruptedException e){}
   }
  }
 }
}

class MyThd extends Thread
{
 private Resource res;
 private int lo,hi;

 MyThd(int lo,int hi,Resource res)
 {
  this.lo=lo;
  this.hi=hi;
  this.res=res;
  
  start();
 }

 public void run()
 {
  while(lo<=hi)
  {
   synchronized(res)
   {
    res.print(lo);
   }
   lo++;
  }
 }
}

class SyncDemo
{
 public static void main(String...arg)
 {
  Resource r = new Resource();
  new MyThd(20331,20340,r);
  new MyThd(9675,9685,r);
 }
}

