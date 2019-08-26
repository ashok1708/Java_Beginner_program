import java.io.*;

class type
{
 public static void main(String...arg) throws InterruptedException
 {
  if(arg.length<1)
  {
   System.err.println("\nrequired parametr missing..\n");
   System.exit(1);
  }

  if(arg.length>1)
  {
   System.err.println("\ntoo many parameters..\n");
   System.exit(1);
  } 

  try
  {
   FileInputStream fs= new FileInputStream(arg[0]);
   char x= (char)fs.read();
 
   while(x!=(char)-1)
   {
    System.out.print(x);
    Thread.sleep(10);
    x=(char)fs.read();

   } 

   fs.close();
  }

  catch(FileNotFoundException e)
  {
   System.err.println("\nFile not found - "+arg[0]);
  }
  
  catch(IOException e)
  {
   System.err.println("\ni/o alert  - "+e.getMessage());
  }
 }
}


    