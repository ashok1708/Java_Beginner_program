class Sample
{
 static
 {
  System.out.println("Stativ-1");
 }
 
 {
  System.out.println("initializatier-1");
 }

 Sample()
 {
  System.out.println("Default constructor");
 }

 static
 {
  System.out.println("Static-2");
 }

 Sample(int n)
 {
  System.out.println("parameterized constructor"); 
 }

 {
  System.out.println("initializatier-2");
 }
}

class InitializerBlock
{
 public static void main(String...arg)
 {
  System.out.println();
  new Sample();
  
  System.out.println();
  new Sample(10);
 }
}
 