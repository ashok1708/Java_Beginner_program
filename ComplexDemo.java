//Implementation of Complex Problem
class ComplexDemo
{ 
 public static void main(String...arg)
 {
  Complex x,y,z;
  x=new Complex();
  y=new Complex();
 
  x.set(1.5,2.7);
  y.set(1.1,2.2);
  
  z=Complex.add(x,y);

  System.out.println();

  System.out.print("x : ");
  x.print();

  System.out.print("y : ");
  y.print();

  System.out.print("z : ");
  z.print();

  System.out.println();
 }
}
