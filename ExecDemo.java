import java.io.*;

class ExecDemo 
{
 public static void main(String...arg)throws IOException,InterruptedException
 {
  Runtime r= Runtime.getRuntime();
  
  Process p= r.exec("notepad");
  p.waitFor();

  System.out.println("\nEnd of code..\n");
 }
}