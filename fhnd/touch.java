import java.io.*;
import java.util.*;
import java.text.*;

class touch
{
 public static void main(String...arg)
 {
  SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy HH:mm");
  sdf.setLenient(false);

  if(arg.length<1)
  {
   System.err.println("\nrequired parameters missing...\n");
   System.exit(1);
  }

  if(arg.length>2)
  {
   System.err.println("\ntoo many parameters ...\n");
   System.exit(1);
  }

  Date dt = new Date();
  
  if(arg.length==2)
  {
   try
   {
    dt=sdf.parse(arg[0]);
   }
   catch(ParseException e)
   {
    System.err.println("\ninvaild date - "+arg[0]+"\n");
    System.exit(3);
   }
  }
  
  File f = new File(arg[arg.length-1]);
  
  if(!f.setLastModified(dt.getTime()))
   System.err.println("\ncannot touch - "+f.getName()+"\n");
 }
}


   