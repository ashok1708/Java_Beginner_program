import java.util.*;

class DateDemo
{
 public static void main(String...arg)
 {
  Date x,y;
  
  x=new Date();
 
  y= new Date(x.getTime()+(60L*60*24*50*1000));

  System.out.println();
  System.out.println("x : "+x);
  System.out.println("y : "+y);
  System.out.println();

  Date z=new Date("1950/12/25 17:30");

  long s= (z.getTime()-x.getTime())/1000;
  long m= s/60;
  s=s%60;
  long h= m/60;
  m=m%60;
  long d= h/24;
  h=h%24;

  System.out.println();
  System.out.println("Years : "+(d/365));
  System.out.println("z-x   : "+d+" days "+h+" hours "+m+" minuts "+s+" seconds ");



 }
}