import java.awt.*;
import java.awt.event.*;
import java.util.*;

class JoinPointsFrame extends Frame implements MouseListener
{
 boolean draw;
 int px,py;
 JoinPointsFrame()
 {
  setTitle("Event Demo");
  setSize(700,500);
  setLocation(200,100);
  setFont(new Font("lucida console",Font.PLAIN|Font.ITALIC,15));

  addMouseListener(this);
  addWindowListener(new JoinAdapter());
 }

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

 public void mouseEntered(MouseEvent me) 
 {
  setCursOr(Cursor.getPredefined(Cursor.CROSSHAIR_CURSOR));
 }

 public void mouseExited(MouseEvent me)  
 { 
 setCursOr(Cursor.getPredefined(Cursor.DEFAULT_CURSOR));
 }
 
}

class JoinAdapter extends WindowAdapter
{
 public void windowClosing(WindowEvent we)
 {
  System.exit(0);
 }
}

class JoinPoints
{
 public static void main(String...arg)
 {
  JoinPointsFram ef = new JoinPointsFram();
  ef.setVisible(true);
 }
} 
