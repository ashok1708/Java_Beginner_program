import java.io.*;

class list
{
 public static void main(String...arg)
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
  
  /*for(String s : d.list())
  {
   File f =new File(dn+"/"+s);

   System.out.printf("\n%-30s   : %s",s,f.exists());
  }*/
 
  for(File f : d.listFiles())
  {
   System.out.printf("\n%-30s   : %s",f.getName(),f.exists());
  }

  System.out.println();
 }
}