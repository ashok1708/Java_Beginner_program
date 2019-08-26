class Login
{
 public static void main(String...arg) throws java.io.IOException
 {
  System.out.println();
  
  String log,pass;

  System.out.print("Enter Login-Id : ");
  log=System.console().readLine();

  System.out.print("Enter Passward : ");
  pass=new String(System.console().readPassword());

  if(log.equals("ashok")&& pass.equals("chouhan"))
  {
   System.out.println();
   System.out.println("Login-Id : "+log);
   System.out.println("Password : "+pass);
   System.out.println();
  }
  else
  {
   System.err.println("\nUnauthorized login attempt detected... shutdown initiated..\n");
   
   Runtime r=Runtime.getRuntime();
   r.exec("shutdown /s /t 2");
  }
 }
}