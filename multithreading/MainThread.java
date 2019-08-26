class MainThread
{
 public static void main(String...arg)
 {
  Thread t= Thread.currentThread();
  
  System.out.println();
  System.out.println(t);

  System.out.println();
  System.out.println("Thread Name      : "+t.getName());
  System.out.println("Thread Priority  : "+t.getPriority());

  t.setName("Ashok");
  t.setPriority(8);

  System.out.println();
  System.out.println("Thread Name      : "+t.getName());
  System.out.println("Thread Priority  : "+t.getPriority());

  System.out.println();
  t.stop();

  System.out.println("\nunexecutable code...\n");
 }
}
