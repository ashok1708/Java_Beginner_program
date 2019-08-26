import java.awt.*;
import java.awt.event.*;
import java.util.*;

class MarkqueeXORFram extends Frame implements Runnable,MouseListener
{
 Thread thd;
 Dimension dm;
 int x=700;
 int px,py;
 boolean draw;

 MarkqueeXORFram()
 {
  setTitle("Markquee");
  setSize(700,500);
  setLocation(200,100);
  setFont(new Font("lucida console",Font.PLAIN|Font.BOLD,20));

  addWindowListener(new MarkqueeXORAdapter());
  addMouseListener(this);
 
 }

 public void paint(Graphics g)
 {
  dm=getSize();
  x=dm.width;

  if(thd==null)
  {
   thd=new Thread(this);
   thd.start();
  }
  
 }

 public void run()
 {
  Graphics g = getGraphics();
  

  while(true)
  {
   g.setColor(Color.blue);
   g.drawString("ASHOK CHOUHAN",x,100);
   
   try
   {
    Thread.sleep(25);
   }
   catch(InterruptedException e){}
   
   g.setColor(Color.white);
   g.drawString("ASHOK CHOUHAN",x,100);

   x=x-2;
   if(x<=-150)
   x=dm.width;
  }
 }

 public void mouseEntered(MouseEvent me) {}
 public void mouseExited(MouseEvent me)  {}
 public void mouseReleased(MouseEvent me){}
 public void mouseClicked(MouseEvent me) {}

 public void mousePressed(MouseEvent me) 
 {
  if((me.getButton()&2)==2)
  {
   draw=false;
   return;
  }

  Graphics g =getGraphics();
  int x=me.getX();
  int y=me.getY();

  g.setColor(Color.blue);
  g.fillOval(x-4,y-4,8,8);
 
  if(draw)
  {
   g.setColor(Color.blue);
   g.drawLine(px,py,x,y);
  }

  px=x;
  py=y;
  draw=true;
 }
}

class MarkqueeXORAdapter extends WindowAdapter
{
 public void windowClosing(WindowEvent we)
 {
  System.exit(0);
 }
}

class MarkqueeXOR
{
 public static void main(String...arg)
 {
  MarkqueeXORFram mq = new MarkqueeXORFram();
  mq.setVisible(true);
 }
} 
