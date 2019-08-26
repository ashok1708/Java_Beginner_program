import java.io.*;

class stoupper
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

  File src= new File(arg[0]);
  File dst= new File("001.tmp");


  try
  {
   FileReader fr = new FileReader(src);
   FileWriter fw = new FileWriter(dst);

   BufferedReader br= new BufferedReader(fr);
   BufferedWriter bw= new BufferedWriter(fw);

   String s = br.readLine();
  
   while(s!=null)
   {
    bw.write(s.toUpperCase()+"\r\n");
    
    bw.flush();
    s=br.readLine();
   }

   fr.close();
   fw.close();

   src.delete();
   dst.renameTo(src);
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