//Command Line Arguments program
class CmdArg
{
 public static void main(String arg[])
 {
  System.out.println("\nCount of arguments : "+arg.length);
  
  for(int i=0;i<arg.length;i++)
  {
  System.out.printf("\nArgumnets #%d       : %s ",i+1,arg[i]);
  }

  System.out.println();
 }
}
   
