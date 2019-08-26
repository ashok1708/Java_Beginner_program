import java.util.*;

class Resource
{
 char str[];

 Resource (String s)
 {
  str=new char[s.length()];
 }

 synchronized void print(int i,char c)
 {
  str[i]=c;
  System.out.print("\r\t\t\t");
  System.out.print(str);
  try
  {
   Thread.sleep(7);
  }
  catch(InterruptedException e){}
 }

}



class MyThd extends Thread
{
 private char chr;
 private int idx; 
 private Resource res;

 MyThd(Resource res,int idx,char chr)
 {
  this.res=res;
  this.idx=idx;
  this.chr=chr;
  start();
 }
 
 public void run()
 {
  char c;
  Random r = new Random(new Date().getTime());
  
  do
  {
   c=(char)(r.nextInt(58)+65);
   res.print(idx,c);
  }while(c!=chr);

 }

}

class metered
{
 public static void main(String...arg)
 {
  String s="ASHOK";

  if(arg.length==1)
   s=arg[0];
   
  Resource r = new Resource(s);
  
  MyThd arr[]=new MyThd[s.length()];
 
  for(int i=0;i<arr.length;i++)
  {
   arr[i]=new MyThd(r,i,s.charAt(i));
  }  

 }
}