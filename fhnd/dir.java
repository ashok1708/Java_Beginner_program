import java.io.*;
import java.util.*;
import java.text.*;

class dir
{
 public static void main(String...arg) throws IOException
 {
  String dn=".";

  if(arg.length==1)
  {
   dn=arg[0];
  }
  
  File d = new File(dn);
  
  if(!d.isDirectory())
  {
   System.err.println("\nDirectory not found - "+dn+"\n");
   System.exit(2);
  }

  System.out.println();
  
  SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy  HH:mm");
  sdf.setLenient(false);

  
  System.out.println("  Directory of "+d.getCanonicalPath());
   
  int dcnt,fcnt;
  long tot;
 
  tot=dcnt=fcnt=0;

  for(File f : d.listFiles())
  {
   System.out.printf("\n%s",sdf.format(new Date(f.lastModified())));

   if(f.isDirectory())
   {
    dcnt++;
    System.out.printf("%4s<DIR>%9s","","");
   }
   else
   {
    fcnt++;
    tot=tot+f.length();
    System.out.printf("%,18d",f.length());
   }
   
   System.out.printf(" %s",f.getName());     
  }

  System.out.println();
  System.out.printf("\n%8d File(s) %,18d bytes",fcnt,tot);
  System.out.printf("\n%8d Dir(s)  %,18d bytes free",dcnt,d.getFreeSpace());

  System.out.println();

 }
}