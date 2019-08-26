//Manaul Exception Generation Custom Handling

class ManualEx
{
 public static void main(String...arg)
 {
  
  try
  {
   if(d==0)
    throw new AirthmeticException();
  
   if(d>n)
    throw new IndexOutOfBoundsException("denominator is larger  ");
  
   q=n/d;

   System.out.println("\noperation succesfull.."\n);
  }

  catch(AirthmeticException e)
  {
   System.out.println();
   System.out.println("alert[1] - "+e);
   System.out.println("message  - "+e.getMessage);
   q=0;
  }
 
 catch(IndexOutOfBoundsException e)
  {
   System.out.println();
   System.out.println("alert[2] - "+e);
   System.out.println("message  - "+e.getMessage);
   q=-1;
  }
  
  System.out.println("\nQuontion : "+q);
 }
}

 