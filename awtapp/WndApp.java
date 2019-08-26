import java.awt.*;
import java.awt.event.*;

 
class WndFrame extends Frame implements WindowListener
{
 WndFrame()
 {
  super("My First Window Application");
  //setTitile("My First Window Application");
  setSize(700,500);
  setLocation(200,100);
  setBackground(new Color(153,204,255));
 
  addWindowListener(this);
 }

 public void windowIconified(WindowEvent we)   {}
 public void windowDeactivated(WindowEvent we) {}
 public void windowActivated(WindowEvent we)   {}
 public void windowDeiconified(WindowEvent we) {}
 public void windowClosed(WindowEvent we)      {}
 public void windowOpened(WindowEvent we)      {}
 
 public void windowClosing(WindowEvent we)
 {
  System.exit(0); 
 }
}

class WndApp
{
 public static void main(String...arg)
 {
  WndFrame wf=new WndFrame();
  wf.setVisible(true);
 }
}