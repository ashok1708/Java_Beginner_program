import java.io.*;

class copy
{
 public static void main(String...arg)
 {
  if(arg.length<2)
  {
   System.err.println("\nrequired parametr missing..\n");
   System.exit(1);
  }

  if(arg.length>2)
  {
   System.err.println("\ntoo many parameters..\n");
   System.exit(1);
  } 

  File src =new File(arg[0]);
  if(!src.exists())
  {
   System.err.print("\nsource nor found - "+arg[0]+"\n");
   System.exit(2);
  }

  File dst = new File(arg[1]);
  if(dst.exists())
  {
   System.err.print("\ndestination already exists.. overwrite it (y/n) : ");
   String ans = System.console().readLine();
  
   if(!ans.equalsIgnoreCase("Y"))
   {
    System.exit(3);
   }
  }

  try
  {
   FileInputStream fs = new FileInputStream(src);
   FileOutputStream fd = new FileOutputStream(src);

   int x= fs.read();
   while(x!=-1)
   {
    fd.write(x);
    x=fs.read();
   }
   
   fs.close();
   fd.close();
  }
  catch(IOException e)
  {
   System.err.println("\ni/o alert  - "+e.getMessage()+"\n");
  }
 }
}
