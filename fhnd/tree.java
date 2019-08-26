import java.io.*;

class MyFilter implements FilenameFilter
{
  public boolean accept(File d,String f)
 {
  return new File(d,f).isDirectory();
 }
}

class tree
{
 public static void main(String...arg) throws IOException
 {
  String dn =".";
   
  if(arg.length==1)
  {
   dn=arg[0];
  }

  File d= new File(dn);
  if(!d.isDirectory())
  {
   System.err.println("\ndirectory not found - "+arg[0]+"\n");
   System.exit(2);
  }

  System.out.println("\n"+d.getCanonicalPath());

  new tree().expandDir(d,"   ");
 }


 void expandDir(File d, String spc)
 {
  
  for(File f : d.listFiles(new MyFilter()))
  {
   System.out.println(spc+f.getName());
   expandDir(f,spc+"   ");
  }
 }
}