//assertion program
class AssertDemo
{
 public static void main(String...arg)
 {
  int n=0;
  
  n=10;
  assert n>0 : "alert[1] - n is negative..";
  
  n=25;
  assert n>0 : "alert[2] - n is negative..";
  
  n=-5;
  assert n>0 : "alert[3] - n is negative..";
  
  System.out.println("\nsqr.root : "+Math.sqrt(n));

  System.out.println("\nend of code...\n");
 }
}
