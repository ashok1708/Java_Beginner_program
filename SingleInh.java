class Alfa
{
 private int n=10;
 protected int x=11;
 int y=12;

 void set(int n,int x,int y)
 {
  this.n=n;
  this.x=x;
  this.y=y;
 }

 void print()
 {
  System.out.println();
  System.out.println("Alfa[n] : "+n);
  System.out.println("Alfa[x] : "+x);
  System.out.println("Alfa[y] : "+y);
 }
}


class Beta extends Alfa
{
 private String x;
 void set(int n,int x,int y,String s)
 {
  //this.n=n; private member of super class are not accessible in sub class

  //this.x-x; incomplitble types

  //super.x=x;
  //this.y=y;
  //super.y=y;

  //instead of all of the above
  set(n,x,y);
  this.x=s;
  }
  void print()
  {
   super.print();
   System.out.println("Beta[x] : "+x);
  }
  
  void show()
  {
   System.out.println();
   System.out.println("Alfa[x] : "+super.x);
   System.out.println("Alfa[y] : "+super.y);
   System.out.println("Beta[x] : "+x);
  }
}


class SingleInh
{
 public static void main(String...arg)
 {
  Alfa a;
  a=new Alfa();
  a.set(1,2,3);
  
  Beta b;
  b=new Beta();
  b.set(1,2,3);
  b.print(); //invoke print of beta

  a=new Beta(); //super class reference can refer to subclass object
  //a.set(1,2,3,"Ron"); super clas reference connot access exclusive member of the sub class

  a.print();

  //b=new Alfa();
 
 }
}