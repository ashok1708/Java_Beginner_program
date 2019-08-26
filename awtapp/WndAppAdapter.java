import java.awt.*;
import java.awt.event.*;

 
class WndFrame extends Frame 
{
 WndFrame()
 {
  super("My First Window Application");
  //setTitile("My First Window Application");
  setSize(700,500);
  setLocation(200,100);
  setBackground(new Color(153,204,255));
 
  addWindowListener(new WndAdapter());
 }
}

class WndAdapter extends WindowAdapter
{
 public void windowClosing(WindowEvent we)
 {
  System.exit(0);
 }
}

class WndAppAdapter
{
 public static void main(String...arg)
 {
  WndFrame wf=new WndFrame();
  wf.setVisible(true);
 }
}