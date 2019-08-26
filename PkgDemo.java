import dmatics.*;
import dmatics.math.*;

class PkgDemo
{
 public static void main(String...arg)
 {
  Record x,y,z;

  x=new Record();
  x.set("Tammy",20,2345.75);

  y=new Record("Dwight",25,10000);

  z=new Record();
  z.get();

  System.out.println();


  System.out.println("x  : "+x);
  System.out.println("y  : "+y);
  System.out.println("z  : "+z);

  System.out.println("\n\n");

  Complex c,d,e;

  c=new Complex();
  c.get();

  d=new Complex(1.1,2.5);
  
  e=Complex.add(c,d);
  
  System.out.println("c  : "+c);
  System.out.println("d  : "+d);
  System.out.println("e  : "+e);
  System.out.println();


 }
}