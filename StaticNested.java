class Alfa
{
 int n=10;
 private static int x=11;
 private static int y=12;
 
 static void show()
 {
  System.out.println("Alfa[x] : "+x);
 }
 
 static class Beta
 {
  String x;
  
  void set(int x,int y,String s)
  {
   Alfa.x=x;
   //this.y=y;
   Alfa.y=y;
   this.x=s;
  }

  void disp()
  {
   show();
   System.out.println("Beta[x] : "+x);
  }

  void print()
  {
   System.out.println();
   //System.out.println("Alfa[n] : "+n);
   System.out.println("Alfa[x] : "+Alfa.x);
   System.out.println("Alfa[y] : "+y);
   System.out.println("Beta[x] : "+x);
  }
 
  public static void main(String...arg)
  {
   System.out.println("\ninside Beta...");
  }
 }
}

class StaticNested
{
 public static void main(String...arg)
 {
  //Beta b; BEta is nested inside Alfa

  Alfa.Beta b;

  b=new Alfa.Beta();

  //b.show(); show() not a member of Beta

  b.set(101,102,"Ron");
  b.print();
 }
}






