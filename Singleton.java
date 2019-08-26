class Sample
{
 private static Sample s=new Sample();
 private int val;

 private Sample() {}

 void set(int val)
 {
  this.val=val;
 }

 void print()
 {
  System.out.println("val : "+val);
 }

 static Sample getObject()
 {
  return s;
 }

 public String toString()
 {
  return val+"";
 }

}

class Singleton
{
 public static void main(String...arg)
 {
  Sample x,y,z;
  
  //x=new Sample();

  x=Sample.getObject();
  y=Sample.getObject();
  z=Sample.getObject();

  System.out.println();
  System.out.println("x : "+x);
  System.out.println("y : "+y);
  System.out.println("z : "+z);

  x.set(10);
  y.set(20);
  z.set(30);

  System.out.println();
  System.out.println("x : "+x);
  System.out.println("y : "+y);
  System.out.println("z : "+z);
  System.out.println();

 }
}
