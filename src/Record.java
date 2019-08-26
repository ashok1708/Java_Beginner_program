package dmatics;
import java.util.Scanner;

public class Record
{
 private String name;
 private int age;
 private float basic;

 public Record(){}

 public Record(String name,int age,double basic)
 {
  this.name=name;
  this.age=age;
  this.basic=(float)basic;
 }

 public void set(String name,int age,double basic)
 {
  this.name=name;
  this.age=age;
  this.basic=(float)basic;
 }

 public void get()
 {
  Scanner sc=new Scanner(System.in);
  System.out.println();

  System.out.print("Enter Name   : ");
  name=sc.nextLine();

  System.out.print("Enter age    : ");
  age=sc.nextInt();

  System.out.print("Enter Basic  : ");
  basic=sc.nextFloat();
 }

 public String toString()
 {
  return String.format("%-20s  %2d  %9.2f",name,age,basic);
 }
}