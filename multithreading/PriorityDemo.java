class MyThd extends Thread
{
 private long ctr;

 MyThd(String name,int p)
 {
  super(name);
  setPriority(p);
  start();
 }
 
 public void run()
 {
  while(true)
  ctr++;
 }

 public String toString()
 {
  return getName()+" : "+ctr;
 }
}

class PriorityDemo
{
 public static void main(String...arg) throws InterruptedException
 {
  MyThd ta = new MyThd("Alfa",3);
  MyThd tb = new MyThd("Beta",8);
  MyThd tg = new MyThd("Gama",5);

  Thread.sleep(3000);
 
  ta.stop();
  tb.stop();
  tg.stop();

  System.out.println();
  System.out.println(ta);
  System.out.println(tb);
  System.out.println(tg);
  System.out.println();
 }
}