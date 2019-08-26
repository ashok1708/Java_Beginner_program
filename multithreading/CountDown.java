import java.util.*;
import java.awt.Toolkit;

class CountDown
{
 Timer tmr;
 volatile boolean ok=true;

 void start()
 {
  tmr=new Timer();
  tmr.schedule(new ActionClass(),2000,1000);

  while(ok);
  System.out.println("\ncountdown ends..\n");
 }

 class ActionClass extends TimerTask
 {
  Toolkit tk=Toolkit.getDefaultToolkit();
  int n=9;

  public void run()
  {
   tk.beep();
   System.out.print("\t"+n);
   n--;
  
   if(n<0)
   {
    tmr.cancel();
    System.out.println();
    ok=false;
   }
  }
 }

 public static void main(String...arg)
 {
  new CountDown().start();;
 }
}