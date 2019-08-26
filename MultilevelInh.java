class Alfa
{
 private int n=10;
 protected int x=11;
 public int y=12;
 int z=13;

 void set(int n,int x,int y,int z)
 {
  this.n=n;
  this.x=x;
  this.y=y;
  this.z=z;
 }

 void print()
 {
  System.out.println();
  System.out.println("Alfa[n] : "+n);
  System.out.println("Alfa[x] : "+x);
  System.out.println("Alfa[y] : "+y);
  System.out.println("Alfa[z] : "+z);
 }
}


class Beta extends Alfa
{
 private int x;
 protected String z;

 void set(int x,int y,String z)
 {
  this.x=x;
  this.y=y;
  this.z=z;
 }

 void set(int x,int y,int z,int xx,String s)
 {
  super.x=x;
  this.y=y;
  super.z=z;
  this.x=xx;
  this.z=s;
 }

 void disp()
 {
  System.out.println();
  System.out.println("Beta[x] : "+x);
  System.out.println("Beta[y] : "+y);
  System.out.println("Beta[z] : "+z);
 }
  
 void display()
 {
  System.out.println();
  System.out.println("Alfa[x] : "+super.x);
  System.out.println("Alfa[y] : "+y);
  System.out.println("Alfa[z] : "+super.z);
  System.out.println("Beta[x] : "+x);
  System.out.println("Beta[z] : "+z);
 }
}

class Gama extends Beta
{
 void set(int y,String z)
 {
  this.y=y;
  this.z=z;
 }
  
 void show()
 {
  System.out.println();
  System.out.println("Gama[y] : "+y);
  System.out.println("Gama[z] : "+z);
 }
}



class MultilevelInh
{
 public static void main(String...arg)
 {
  Gama g=new Gama();
  g.disp();
  g.set(25,"Ron");
  g.print();
  g.set(1,2,3,4);
  g.disp();
  g.set(100,200,"val");
  g.show();

  Beta b=new Gama();
  b.set(1,2,3,4);
  //b.show();
  b.disp();
  //b.set(50,"Ron");
  b.set(10,20,"val");
  b.print();
  
  Alfa a=new Gama();
  //a.set(1,2,"Ron");
 }
}