class Shape
{
 protected int left,top,right,bottom;
 
 Shape()
 {
  System.out.println("Shape-Default");
 }
 
 Shape(int left,int top,int right,int bottom)
 {
  System.out.println("Shape-Parameterize");
 }
}

class Circle extends Shape
{
 private int cx,cy,radius;

 Circle()
 {
  System.out.println("Circle-Default");
 }

 Circle(int cx,int cy,int radius)
 {
  super(cx-radius,cy-radius,cx+radius,cy+radius);
  System.out.println("Circle-Default");
 }
}

class SubCons
{
 public static void main(String...arg)
 {
  System.out.println();
  new Circle();
  System.out.println();
  new Circle(100,100,50);
  System.out.println();
 }
}
