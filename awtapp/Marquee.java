import java.awt.*;
import java.awt.event.*;
import java.util.*;

class MarkqueeFram extends Frame implements Runnable
{
 Thread thd;
 Dimension dm;
 int x=700;

 MarkqueeFram()
 {
  setTitle("Markquee");
  setSize(700,500);
  setLocation(200,100);
  setFont(new Font("lucida console",Font.PLAIN|Font.ITALIC,20));

  thd=new Thread(this);
  thd.start();

  addWindowListener(new MarkqueeAdapter());
 }

 public void paint(Graphics g)
 {
  g.drawString("ASHOK CHOUHAN",x,100);
 }

 public void run()
 {
  while(true)
  {
   x=x-2;
   repaint();
   if(x==-150)
    x=dm.width;

   try
  {
   Thread.sleep(25);
  }
  catch(InterruptedException e){}
  }
 }
}

class MarkqueeAdapter extends WindowAdapter
{
 public void windowClosing(WindowEvent we)
 {
  System.exit(0);
 }
}

class Markquee
{
 public static void main(String...arg)
 {
  MarkqueeFram mq = new MarkqueeFram();
  mq.setVisible(true);
 }
} 
