class WrapperDemo
{
 public static void main(String...arg)
 {
  Integer a,b,c,x,y,z;

  a=200;
  b=200;
  c= new Integer(200);
  x=100;
  y=100;
  z= new Integer(100);

  System.out.println();
  System.out.println(a==b);
  System.out.println(b==c);
  System.out.println();
  System.out.println(x==y);//(both x and y refer to the same integer object inthe Integer pool Interger poll contains predefined integ)
  System.out.println(y==z);
  System.out.println();

  x=127;
  y=126;
  
  y++;

  System.out.println();
  System.out.println(x==y);
  System.out.println(x==127);
  System.out.println(x<y);



  
 }
}