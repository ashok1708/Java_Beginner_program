import java.util.*;

class TokenizenDemo
{
 public static void main(String...arg)
 {
  String str="One    two--three_four; ;five::six\n\tseven...eight,nine   ten   ";
  
  StringTokenizer stn = new StringTokenizer(str," :;,-_\n\t.");

  System.out.println();
  System.out.println("No. of Tokens  : "+stn.countTokens());
  System.out.println();


  int n=stn.countTokens();

  /*for(int i=1; i<=n;i++)
  {
   System.out.printf("\nTokens #%2d : %s",i,stn.nextToken());
  }*/
  System.out.println();

  int i=1;
  while(stn.hasMoreTokens())
  {
   System.out.printf("\nTokens #%2d : %s",i,stn.nextToken());
   i++;
  }

 }
}

 


