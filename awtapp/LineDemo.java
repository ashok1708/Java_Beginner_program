import java.awt.*;
import java.awt.event.*;
import java.util.*;

class LineDemoFram extends Frame implements MouseListener,MouseMotionListener
{
 int cx,cy,px,py;
 boolean draw;

 LineDemoFram()
 {
  setTitle("LineDemo");
  setSize(700,500);
  setLocation(200,100);
  

  addWindowListener(new MarkqueeXORAdapter());
  addMouseListener(this);
  addMouseMotionListener(this);
 
 }

 public void paint(Graphics g)
 {
   
 }

 public void mouseEntered(MouseEvent me) {}
 public void mouseExited(MouseEvent me)  {}
 public void mouseReleased(MouseEvent me){}
 public void mouseClicked(MouseEvent me) {}
 public void mouseMoved(MouseEvent me)   {}
 
 public void mouseDragged(MouseEvent me)
 {


 }

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

class LineDemoAdapter extends WindowAdapter
{
 public void windowClosing(WindowEvent we)
 {
  System.exit(0);
 }
}

class LineDemo
{
 public static void main(String...arg)
 {
  LineDemoFram ld= new LineDemoFram();
  ld.setVisible(true);
 }
} 
