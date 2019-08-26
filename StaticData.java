class Sample
{
 private int a=1;
 private static int x=2;
 int b=10;
 static int y=20;
}
 
class StaticDemo
{ 
 public static void main(String...arg)
 {
  //Sample.a=11;
  //Sample.x=21;
  //Sample.b=101;
  Sample.y=201;

  Sample s=new Sample();
  
  //System.out.ptintln(s.a);
  //System.out.ptintln(s.x);
  System.out.println(s.b);
  System.out.println(s.y);
 }
}
