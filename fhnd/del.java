import java.io.*;

class del 
{
 public static void main(String...arg) throws IOException
 {
  if(arg.length==0)
  {
   System.err.println("\nrequired parameters missing...\n");
   System.exit(1);
  }
 
  for(String s : arg)
  {
   File f = new File(s);
   if(f.delete())
    System.out.printf("\ndeleted succesfully -  %s",s );
   else
    System.out.printf("\ndeletion failed     - %s",s);
  }

  System.out.println();
 }
}
