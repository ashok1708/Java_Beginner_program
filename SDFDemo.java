import java.util.*;
import java.text.*;

class SDFDemo
{
 public static void main(String...arg)
 {
  SimpleDateFormat sdf= new SimpleDateFormat("EEEE MMM dd,y");

  String s= sdf.format(new Date());
  
  System.out.println();
  System.out.println("\nToday is : "+s);
  System.out.println();

  sdf= new SimpleDateFormat("dd/mm/yy");
  sdf.setLenient(fala

  System.out.print("\nEnter Date(dd/mm/yy) : ");
  s= System.console().readLine();
  
  Date d;
  try
  {
   d=sdf.parse(s);
  }
  
  catch(ParseException e)
  {
   System.out.println("\ninvaild date....\n");
   d=null;
  }
  System.out.println("Date  : "+d);


 }
}
