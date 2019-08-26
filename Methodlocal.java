class Alfa
{
 private int x=10;

 void set(int n)
 {
  class Beta
  {
   
    void show()
    {
     x=n;
     //n=0;
     System.out.println();
     System.out.println("Beta[n] : "+n);
     System.out.println("Beta[x] : "+x);
    }
  }
   
   Beta b=new Beta();
   b.show();
 }
}
