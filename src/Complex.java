package dmatics.math;
import java.util.Scanner;

public class Complex
{
 private float real,imag;
 
 public Complex() {}

 public Complex(double real,double imag)
 {
  this.real=(float)real;
  this.imag=(float)imag;
 }
 
 public Complex(Complex c)
 {
  real=c.real;
  imag=c.imag;
 }

 public void set(double real,double imag)
 {
  this.real=(float)real;
  this.imag=(float)imag;
  
  //print();
 }
  
 public void get()
 {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter Real part   : ");
  real=sc.nextFloat();
 
  System.out.print("Enter Imag Part   : ");
  imag=sc.nextFloat();
 }

 public void print()
 {
  System.out.println("("+real+","+imag+")");
 }

 public static Complex add(Complex c1,Complex c2)
 {
  Complex c3=new Complex();
  
  c3.real=c1.real+c2.real;
  c3.imag=c1.imag+c2.imag;

  return c3;
 }

 public Complex add(Complex c1)
 {
  Complex c2=new Complex();
  
  c2.real=real+c1.real;
  c2.imag=imag+c1.imag;

  return c2;
 }

 public static Complex subtract(Complex c1,Complex c2)
 {
  Complex c3=new Complex();
  
  c3.real=c1.real-c2.real;
  c3.imag=c1.imag-c2.imag;

  return c3;
 }

 public Complex subtract(Complex c1)
 {
  Complex c2=new Complex();
  
  c2.real=real-c1.real;
  c2.imag=imag-c1.imag;

  return c2;
 }

 public String toString()
 {
  return "["+real+","+imag+"i]";
 }
}



