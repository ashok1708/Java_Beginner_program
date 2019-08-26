class main
{
 public static void main(String arg[])
 {
  System.out.println("\nExecutable main..");
  new main();
  new main(null);
 }
 
 public main()
 {
  System.out.println("\nDefault constructor..");
 }

 public main(String arg)
 {
  System.out.println("\nPerameterized constructor..");
 }
}  