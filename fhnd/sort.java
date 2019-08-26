import java.io.*;
import java.util.*;

class sort
{
 public static void main(String...arg)
 {
  try
  {
   FileInputStream fs= new FileInputStream(arg[0]);
   DataInputStream ds= new DataInputStream(fs);

   FileOutputStream fd= new FileOutputStream(fs);
   DataOutputStream dd= new DataOutputStream(fd);

   int arr[] = new int[fs.available()/4];

   int i=0;
   while(fs.available()>0)
   {
    arr[i]=ds.readInt();
    i++;
   }

   Arrays.sort(arr);

   i=0;

   while(i<arr.length)
   {
    dd.writeInt(arr[i]);
    dd.flush();
    i++;
   }

   fs.close();
  }

  catch(IOException e){}
 } 
}
    
   

  