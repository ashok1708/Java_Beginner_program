interface Alfa
{
 int x=10;

 default void show()
 {
  System.out.println("Alfa[x] : "+x);
 }

 void print();
}

interface Beta
{
 default void show()
 {
  System.out.println("Beta");
 }
}

class Gama implements Alfa,Beta
{
 public void show()
 {
  System.out.println("Gama-show");
  Alfa.super.show();
  Beta.super.show();
 }

 public void print()
 {
  System.out.println("Gama[x] : "+x);
 }
}

class DefaultMethod
{
 public static void main(String...arg)
 {
  Alfa a;

  a=new Alfa(){
               public void print()
               {
                System.out.println("Anonymous[x] : "+x);
               }
              };   //Anonymous class
  a.show();
  a.print();

  a=new Gama();
  a.show();
 }
}
  