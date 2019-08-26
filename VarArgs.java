class VarArgs
{
 public static void main(String...arg)
 {
  System.out.println();
  System.out.println("20+10+30+15    : "+sum(20,10,30,15));
  System.out.println("50+25+10       : "+sum(50,25,10));
  System.out.println("sum of 1,2,3,4 : "+sum(new int[]{1,2,3,4}));
  System.out.println();
 }

 static int sum(int...arr)
 {
  int s=0;

  for(int n : arr)
   s+=n;

  return s;
 }
}
 


