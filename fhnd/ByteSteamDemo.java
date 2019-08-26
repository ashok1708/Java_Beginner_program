import java.io.*;

class ByteSteamDemo
{
 public static void main(String...arg)
 {
  if(arg.length==0)
  {
   System.err.println("\nrequired parametr missing..\n");
   System.exit(1);
  }

  try
  {
   FileInputStream fs= new FileInputStream(arg[0]);
   long n= fs.available();

   System.out.println();
   System.out.println("Bytes availablr in the begining : "+n);
   
   fs.skip(n/2);
 
   n=fs.available();

   System.out.println("Bytes available after skipping  : "+n);
  
   fs.skip(-n/2);
   n=fs.available();
   System.out.println("Bytes available after re-skkping : "+n);

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


    