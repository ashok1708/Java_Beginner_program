package dmatics;
import java.io.*;

public class Input
{
 

 public static char getChar()
 {
  BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
  
  char x;
  try
  {
   x=(char)br.read();
  }
  catch(IOException e)
  {
   x=(char)0;
  }
  return x;
 }

 public static String getString()
 {
  BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
  
  String s;
  try
  {
   s=br.readLine();
  }
  catch(IOException e)
  {
   s="";
  }
  return s;
 }
  
 public static int getInt()
 {
  BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

  int n;
  
  try
  {
   n= Integer.parseInt(br.readLine());
  }
  catch(IOException|NumberFormatException e)
  {
   n=0;
  }
  return n;
 }   
 
 public static float getFloat()
 {
  BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

  float n;
  
  try
  {
   n= Float.parseFloat(br.readLine());
  }
  catch(IOException|NumberFormatException e)
  {
   n=0;
  }
  return n;
 }

}

