interface Color
{
 int BLACK=0,BLUE=1,RED=2,GREEN=3;

 void setDrawColor(int clr);
 void setFillColor(int clr);
}

abstract class Shape implements Color
{
 protected int left,top,right,bottom;
 private int drawColor,fillColor; 

 Shape(int left,int top,int right,int bottom)
 {
  this.left=left;
  this.top=top;
  this.right=right;
  this.bottom=bottom;
 }

 final void setBounds(int left,int top,int right,int bottom)
 {
  this.left=left;
  this.top=top;
  this.right=right;
  this.bottom=bottom;
 }

 public void setDrawColor(int drawColor)
 {
  this.drawColor=drawColor;
 }

 public void setFillColor(int fillColor)
 {
  this.fillColor=fillColor;
 }

 abstract void create();
 abstract void show();
 abstract protected double area();
 abstract public double perimeter(); 
}

class Circle extends Shape
{
 private int cx,cy,radius;

 Circle()
 {
  super(0,0,0,0);
 }

 Circle(int cx,int cy,int radius)
 {
  super(cx-radius,cy-radius,cx+radius,cy+radius);
  this.cx=cx;
  this.cy=cy;
  this.radius=radius;
 }

 void create()
 {
  int dx=(right-left)/2;
  int dy=(bottom-top)/2;
  cx=left+dx;
  cy=top+dy;
  radius=dx<dy?dx:dy;
  System.out.println("creating circle..");
 }
 
 protected void show()
 {
  System.out.println("showing circle..");
 }

 public double area()
 {
  return Math.PI*Math.pow(radius,2);
 }
 
 public double perimeter()
 {
  return 2*Math.PI*radius;
 }
  
}

class Rectangle extends Shape
{
 private int width,height;

 Rectangle()
 {
  super(0,0,0,0);
 }

 Rectangle(int x,int y,int width,int height)
 {
  super(x,y,x+width,y+height);
  this.width=width;
  this.height=height;
 }

 void create()
 {
  width=right-left;
  height=bottom-top;
  System.out.println("creating Rectagnle..");
 }

 void show()
 {
  System.out.println("Showing Rectangle..");
 }

 protected double area()
 {
  return width*height;
 }
 
 public double perimeter()
 {
  return 2*(width+height);
 }
}


class InterfaceDemo
{
 public static void main(String...arg)
 {
  Color c;
  
  c=new Circle();
  c.setDrawColor(Color.RED);
  //c.setBounds(100,100,200,200);

 }
}
