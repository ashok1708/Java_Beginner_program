class Sample 
{
 private static Sample s=new Sample();
 private int n=10;

 Sample() {}

 Sample(int n)
 {
  this.n=n;
 }

 void print()
 {
  System.out.println();
  System.out.println("n    : "+n);
  System.out.println("s[n] : "+s.n);
 }

 void set(int n)
 {
  this.n=n;
 }
 
 void sets(int n)
 {
  s.n=n;
 }

}
 
class Cyclic
{
 public static void main(String...arg)
 {
  Sample x,y;

  x=new Sample(1);
  y=new Sample(2);

  x.print();
  y.print();
 
  x.set(5);
  y.sets(20);

  x.print();
  y.print();
 }
 
}