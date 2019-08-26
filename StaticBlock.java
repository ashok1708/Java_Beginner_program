class Sample
{
 int n=1;
 static int x=2;
 
 Sample(){}

 Sample(int n)
 {
  System.out.println("\nInside Constructor..");
  System.out.println("n : "+this.n);
  System.out.println("x : "+x);
  
  this.n=n;
 }
 
 static void show()
 {
  System.out.println("\nInside Show..");
  System.out.println("x : "+x);
 }

 static 
 { 
  System.out.println("\nInside Static Block..");
  System.out.println("x : "+x);
  
  x=20;
 }
}

class StaticBlock
{
public static void main(String...arg)throws ClassNotFoundException
 {
  Sample s;        //creating an object reference does not invoke static block.
  Sample.show(); //static Block is call here
  
  System.out.println("Main[x] : "+Sample.x);
  
  Sample.x=2000;
  System.out.println("Main[x] : "+Sample.x);
  
  
  new Sample(100); //first constructor call then value assigned
  Class.forName("Sample");  //we explicitly load class Sample 
 }
}
 

