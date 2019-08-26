import java.io.*;

class ren
{
 public static void main(String...arg) 
 {
  if(arg.length<2)
  {
   System.err.println("\nrequired parameter(s) missing..\n");
   System.exit(1);
  }
 
  if(arg.length>2)
  {
   System.err.println("\n too many parameter(s)..\n");
   System.exit(1);
  }

  File fs = new File(arg[0]);
  File fd = new File(arg[1]);

  if(!fs.renameTo(fd))
  {
   System.err.println("\ncannot rename - " +arg[0]+"\n");
  }

 }
}
   