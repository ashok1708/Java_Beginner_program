class Sample
{
 private int n=1;
 private static int x=2;

 void set(int n,int x)
 {
  this.n=n;
  this.x=x;
  print();
  show();
 }

 static void set(int x)
 {
  //n=x;
  //this.x=x;
  Sample.x=x;
  //print();
  show();
 
  Sample s=new Sample();
  s.n=x;
  s.x=x;
  s.print();
  s.show();
 }

 void print()
 {
  System.out.println("n  : "+n);

  System.out.println("x  : "+x);
 }

 static void show()
 {
  //System.out.println("n  : "+n);

  System.out.println("x  : "+x);
 }
}

class StaticMethod
{
 public static void main(String...arg)
 {
  //Sample.set(1,2);
  Sample.show();

  Sample s=new Sample();

  s.set(10);
  s.print();
 }
}