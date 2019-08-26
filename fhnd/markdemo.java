import java.io.*;

class markdemo
{
 public static void main(String...arg)
 {
  try
  {
   FileReader fr= new FileReader(arg[0]);
   BufferedReader br= new BufferedReader(fr);

   int offset =0;
   int x= br.read();
  
   while(x!=-1)
   {
    if(offset==20) br.mark(100);
    if(offset==70) br.reset();
   
    System.out.print((char)x);

    x=br.read();
    offset++;
   }

   fr.close();
  }
  catch(IOException e){}
 }
}
    