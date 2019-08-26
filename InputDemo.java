import dmatics.*;

class InputDemo
{
 public static void main(String...arg)
 {
  String nam;
  int age;
  float bas;
 
  System.out.println();

  System.out.print("\nEnter Name   : ");
  nam=Input.getString();

  System.out.print("\nEnter Age    : ");
  age=Input.getInt();

  System.out.print("\nEnter Basic  : ");
  bas=Input.getFloat();


  System.out.println();

  System.out.println("Name   : "+nam);
  System.out.println("Age    : "+age);
  System.out.println("Basic  : "+bas);

  System.out.println();
 }
} 



