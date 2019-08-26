import java.util.*;

class Fibonacci extends Thread
{
 int terms[];

 int[] getTerms(int n)
 {
  terms= new int[n];
  start();
  return terms;
 }

 public void run()
 {
  int a=0,b=1;
  for(int i =0;i<terms.length;i++)
  {
   terms[i]=a;
   a=a+b;
   b=a-b;
  }
 }
}

class Camelback extends Thread
{
 int terms[];

 int[] getTerms(int n)
 {
  terms= new int[n];
  start();
  return terms;
 }

 public void run()
 {
  int a=0,b=1;
  for(int i =0;i<terms.length;i++)
  {
   terms[i]=a;
   a=a+b;
   b++;
  }
 }
}

class MergeSeries
{
 public static void main(String...arg) throws InterruptedException
 {
  Fibonacci f = new Fibonacci();
  Camelback c = new Camelback();

  int x[]=f.getTerms(10);
  int y[]=c.getTerms(10);

  f.join();
  c.join();

  int z[]=new int[x.length+y.length];

  Arrays.sort(x);
  Arrays.sort(y);


  int i,j,k;
  i=j=k=0;

  while(i<x.length && j<y.length)
  {
   if(x[i]<y[j])
    z[k++]=x[i++];
   
   else
    z[k++]=y[j++];
  }

  while(i<x.length) z[k++]=x[i++];
  while(j<y.length) z[k++]=y[j++];

  System.out.println();
  System.out.println("x : "+Arrays.toString(x));
  System.out.println("y : "+Arrays.toString(y));
  System.out.println("z : "+Arrays.toString(z));
  System.out.println();
 }
}


