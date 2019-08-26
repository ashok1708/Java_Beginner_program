class Alfa
{
 private static int n=10;
 private int x=11;

 Alfa(){}
 Alfa(int x)
 {
  this.x=x;
 }

 void show()
 {
  System.out.println();
  System.out.println("Alfa[n] : "+n);
  System.out.println("Alfa[x] : "+x);
 }

 class Beta
 {
  //static int n;
  int y;
  
  Beta(){}
  Beta(int y)
  {
   this.y=y;
  }

  void set(int /*x*/n, int y)
  {
   //this.x=x;//x is not a member of Beta
   x=n;
   this.y=y;
  }

  void print()
  {
   show();
   System.out.println("Beta[y] : "+y);
  }

  void disp()
  {
   System.out.println();
   System.out.println("Alfa[n] : "+n);
   System.out.println("Alfa[x] : "+x);
   System.out.println("Beta[y] : "+y);
  }
 }
}

class InnerDemo
{
 public static void main(String...arg)
 {
  Alfa.Beta b; 

  //b=new Alfa.Beta();inner class objects must be built upon outer class objects
    b=new Alfa().new Beta();

  b.set(1,2);
  //b.show();
  b.print();

  Alfa a=new Alfa(100);
  
  Alfa.Beta b1,b2,b3;

  b1=a.new Beta(201);
  b2=a.new Beta(202);
  b3=a.new Beta(203);
   
  b1.disp();
  b2.set(1000,2000);
  b2.disp();
  
  b3.disp();
 }
}