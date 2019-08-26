import java.awt.*;
import java.awt.event.*;
import java.util.*;

class EventFrame extends Frame implements MouseListener
{
 EventFrame()
 {
  setTitle("Event Demo");
  setSize(700,500);
  setLocation(200,100);
  setFont(new Font("lucida console",Font.PLAIN|Font.ITALIC,15));

  addWindowListener(new EventAdapter());
 }

 public void mouseEntered(MouseEvent me) {}
 public void mouseExited(MouseEvent me)  {}
 public void mouseReleased(MouseEvent me){}
 public void mouseClicked(MouseEvent me) {}

 public void mousePressed(MouseEvent me) 
 {
  Random r= new Random(new Date().getTime());
  int red,grn,blu;

  red=r.nextInt(256);
  grn=r.nextInt(256);
  blu=r.nextInt(256);

  Graphics g=getGraphics();
  g.setColor(new Color(red,grn,blu));

  int x=me.getX();
  int y=me.getY();

  g.drawString("ASHOK",x,y);
 }
}

class EventAdapter extends WindowAdapter
{
 public void windowClosing(WindowEvent we)
 {
  System.exit(0);
 }
}

class EventDemo
{
 public static void main(String...arg)
 {
  EventFrame ef = new EventFrame();
  ef.setVisible(true);
 }
} 
