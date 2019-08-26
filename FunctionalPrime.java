interface Math
{
 boolean isPrime(int a);
}


class FunctionalPrime
{
 public static void main(String...arg)
 {
  Math m= (x)-> {
                  int d;
		  for(d=2;d<x/2&&x%d!=0;d++);
 		  return d>x/2;
		 };
  
  System.out.println("\n19 is Prime : "+m.isPrime(19)+"\n");
 }
}
  