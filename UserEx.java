//UserException Generation Custom Handling

class MyExcep extends Exception
{
 private String msg="MyExcep : ";

 MyExcep()
 {
  msg=msg+"unknown Exception";
 }
 
 MyExcep(String s)
 {
  msg=msg+s;
 }
 
 public String getMessage()
 {
  return msg;
 }

 public String toString()
 {
  return msg;
 }
}

class ManualEx
{
 public static void main(String...arg)
 {
  int n=1,d=0,q;
    
  try
  {
   if(d==0)
    throw new AirthmeticException();
  
   if(d>n)
    throw new MyExcep("denominator is larger");  
   q=n/d;

   System.out.println("\noperation succesfull..\n");
  }

  catch(AirthmeticException e)
  {
   System.out.println();
   System.out.println("alert[1] - "+e);
   System.out.println("message  - "+e.getMessage);
   q=0;
  }
 
 catch(MyExcep e)
  {
   System.out.println();
   System.out.println("alert[2] - "+e);
   System.out.println("message  - "+e.getMessage);
   q=-1;
  }
  
  System.out.println("\nQuontion : "+q+"\n");
 }
}

 