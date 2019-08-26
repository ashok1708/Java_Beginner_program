import java.io.*;

class stype
{
 public static void main(String...arg)
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
   FileReader fr = new FileReader(arg[0]);
   BufferedReader br= new BufferedReader(fr);

   int l=1;
   String s=br.readLine();

   while(s!=null)
   {
    System.out.printf("\n%3d %s",l++,s);
    s=br.readLine();
   }
   
   fr.close();
   System.out.println();
  }

  catch(FileNotFoundException e)
  {
   System.err.println("\nfile not found - "+arg[0]+"\n");
  }
  
  catch(IOException e)
  {
   System.err.println("\ni/o alert  - "+e.getMessage()+"\n");
  }
 }
}