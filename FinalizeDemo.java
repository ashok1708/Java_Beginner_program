class Sample
{
 private int val;

 Sample() {}

 Sample(int val)
 {
  System.out.println("constructing object  : " +val);
  this.val=val;
 }

 protected void finalize()
 {
  System.out.println("destroying object    : " +val);
 }
}

class FinalizeDemo
{
 public static void main(String...arg) throws InterruptedException
 {
  System.out.println();

  Sample a,b,c;

  a=new Sample(1);
  new Sample(2);
  b=new Sample(3);

  int n=10;
 
  if(n>5)
  {
   c=new Sample(4);
   Sample d=new Sample(5);
  }

  a=new Sample(6);

  System.out.println();

  System.gc();

  Thread.sleep(50);

  System.out.println("\nEnd of code...\n");
 }
}
