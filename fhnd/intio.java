import java.io.*;
import java.util.*;

class writeint
{
 public static void main(String...arg)
 {
  Scanner sc = new Scanner(System.in);

  try
  {
   FileOutputStream fs= new FileOutputStream(arg[0],true);
   DataOutputStream ds= new DataOutputStream(fs);

   System.out.println();
   while(true)
   {
    System.out.print("Enter a Number[0 to stop] : ");
    int n =sc.nextInt();
    if(n==0) break;

    ds.writeInt(n);
    ds.flush();
   }
  }
  catch(IOException e){}
 }
}


class readint
{
 public static void main(String...arg)
 {
    try
  {
   FileInputStream fs= new FileInputStream(arg[0]);
   DataInputStream ds= new DataInputStream(fs);

   System.out.println();

   while(fs.available()>0)
   {
    System.out.print(ds.readInt());
   }
   fs.close();
  }
  catch(IOException e){}
 }
}
    
   