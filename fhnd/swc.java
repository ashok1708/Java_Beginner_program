import java.io.*;
import java.util.*;

class swc
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
   BufferedReader br = new BufferedReader(fr);

   String str = br.readLine();
   StringTokenizer stn;

   int l,w,c;
   l=w=c=0;

   while(str!=null)
   {
    l++;0.
    c=c+str.length()+2;

    stn = new StringTokenizer(str," \t");

    w=w+stn.countTokens();    
    str=br.readLine();
    
   }
  
   fr.close();

  
   System.out.println();
   System.out.println("Counts of Chars  : "+c);
   System.out.println("Counts of words  : "+w);
   System.out.println("Counts of lines  : "+l);
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




