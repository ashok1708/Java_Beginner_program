class MyThd extends Thread
{
 private char chr;
 
 MyThd(ThreadGroup tg,String name,char chr)
 {
  super(tg,name);
  this.chr=chr;
  start();
 }

 public void run()
 {
  while(true)
  {
   System.out.print(chr);
  }
 }
}

class ThreadGroupDemo
{
 public static void main(String...arg) throws InterruptedException
 {
  ThreadGroup tg=new ThreadGroup("dmatics");
  
  MyThd ta=new MyThd(tg,"Alfa",'+');
  MyThd tb=new MyThd(tg,"Beta",'-');

  Thread.sleep(1000);

  System.out.println("\n");
  System.out.println(ta);
  System.out.println(tb);

  tg.stop();
  tg.delay(1000);

  System.out.println("\n");
  System.out.println("Alfa is Alive  : "+ta.isAlive());
  System.out.println("Beta is Alive  : "+tb.isAlive());

  System.out.println("\n"); 
 }
}


 