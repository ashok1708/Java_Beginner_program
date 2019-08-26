//Program of Applets
import java.applet.*;
import java.awt.*;

public class MyApplet extends Applet
{
 String msg="";

 public void init()
 {
  msg=msg+"init...";

  setBackground(Color.yellow);
  setForeground(Color.blue);
  setFont(new Font("lucida consle",Font.PLAIN,15));
 }
 
 public void start()
 {
  msg=msg+"start...";
 }

 public void stop()
 {
  msg=msg+"stop...";
 }

 public void destroy()
 {
  msg=msg+"destroy...";
 }

 public void paint(Graphics g) 
 {
  /*msg=msg+"paint...";
  g.drawString(msg,50,100);*/
  
  g.drawArc(100,250,100,250,100,50);
  
 }
}
