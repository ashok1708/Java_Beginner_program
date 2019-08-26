import java.io.*;

class MyFilter implements FilenameFilter
{
 private String ext;
 
 MyFilter(String ext)
 {
  this.ext=ext;
 }

 public boolean accept(File d,String f)
 {
  return f.endsWith(ext);
 }
}

class FilterDemo
{
 public static void main(String...arg)
 {
  String ext="";
   
  if(arg.length==1)
  {
   ext=arg[0];
  }

  MyFilter mf= new MyFilter(ext);
  
  File d= new File(".");

  System.out.println();
  
  for(String s : d.list(mf))
  {
   System.out.println(s);
  }
  System.out.println();
 }
}
  