import java.util.*;
import java.text.*;

class cal
{ 
 public static void main(String...arg)
 {
  Date dt= null;

  if(arg.length==0)
  {
   dt= new Date();
   dt=new Date(dt.getYear(),dt.getMonth(),1);
  
  }
  else
  {
   if(arg.length>2)
   {
    System.err.println("\ntoo many arguments...\n");
    System.exit(1);
   }
   else
   {
    String m=null;
    String y=null;

    if(arg.length==1)
    {  
     m=arg[0];
     y=String.valueOf(new Date().getYear()+1900);
    }
    else
    {
     m=arg[0];
     y=arg[1];
    }
    
    SimpleDateFormat sdf= new SimpleDateFormat("d MMM yyyy");
    sdf.setLenient(false);
   
    try
    {
     dt=sdf.parse("1 "+m+" "+y);
    }
    catch(ParseException e)
    {
     System.err.print("\ninvaild arguments..\n");
     System.exit(1);
    }
   }
  }
  int m,y;

  m=dt.getMonth()+1;
  y=dt.getYear()+1900;
  
  int totdays=0;
  
  if(m==1||m==3||m==5||m==7||m==8||m==10||m==12)
   totdays=31;
  else
   {
    if(m==2)
    {
     if(y%4==0 && y%100!=0 && y%400==0)
      totdays=29;
     else
      totdays=28;
    }
    else
    {
     totdays=30;
    }
   }

   int w=dt.getDay();

   String s=new SimpleDateFormat("MMMM yyyy").format(dt);
   
   String spc= new String(new char[20-s.length()/2]);

   System.out.println();

   System.out.println("\n\t"+spc+s);

   System.out.println("\n\t\tSu Mo Tu We Th Fr Sa");

   spc=new String(new char[w*3]);

   System.out.print("\t\t"+spc);
   
   for(int d=1;d<totdays;d++)
   {
    System.out.printf("%2d ",d);
    w++;

    if(w==7)
    {
     System.out.print("\n\t\t");
     w=0;
    }
   }
   System.out.println();

 }
}