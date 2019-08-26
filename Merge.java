import java.util.*;
import java.util.stream.*;

class Merge
{
 public static void main(String...arg)
 {
  int x[]={20,45,10,30,15,35};
  int y[]={10,40,25,33,47,22,37,12};
  int z[];

 /* z=mergeAAA(x,y);

  System.out.println();
  System.out.println("x : "+Arrays.toString(x));
  System.out.println("y : "+Arrays.toString(y));
  System.out.println("z : "+Arrays.toString(z));
  System.out.println();
 
  z=mergeAAD(x,y);

  System.out.println();
  System.out.println("x : "+Arrays.toString(x));
  System.out.println("y : "+Arrays.toString(y));
  System.out.println("z : "+Arrays.toString(z));
  System.out.println();*/

  z=getUnion(x,y);

  System.out.println();
  System.out.println("x : "+Arrays.toString(x));
  System.out.println("y : "+Arrays.toString(y));
  System.out.println("z : "+Arrays.toString(z));
  System.out.println();

  z=getIntersection(x,y);

  System.out.println();
  System.out.println("x : "+Arrays.toString(x));
  System.out.println("y : "+Arrays.toString(y));
  System.out.println("z : "+Arrays.toString(z));
  System.out.println();
 }
 
 static void sortDesc(int arr[])
 {
  
  List<Integer> lst= Arrays.stream(arr).boxed().collect (Collectors.toList());
  Collections.sort(lst,Collections.reverseOrder());

  int tmp[]=lst.stream().mapToInt(n->n).toArray();

  for(int i=0;i<tmp.length;i++)
  {
   arr[i]=tmp[i];
  }
 }

 static int[] mergeAAA(int x[],int y[])
 {
  Arrays.sort(x);
  Arrays.sort(y);

  int z[]=new int[x.length+y.length];

  int i,j,k;
  i=j=k=0;

  while(i<x.length&&j<y.length)
  {
   if(x[i]<y[j])
    z[k++]=x[i++];
   
   else
    z[k++]=y[j++];
  }

  while(i<x.length) z[k++]=x[i++];
  while(j<y.length) z[k++]=y[j++];
  
  return z;
 }

 static int[] mergeAAD(int x[],int y[])
 {
  Arrays.sort(x);
  Arrays.sort(y);

  int z[]=new int[x.length+y.length];

  int i,j,k;
  i=j=0;
  k=(z.length)-1;

  while(i<x.length&&j<y.length)
  {
   if(x[i]<y[j])
    z[k--]=x[i++];
   
   else
    z[k--]=y[j++];
  }

  while(i<x.length) z[k--]=x[i++];
  while(j<y.length) z[k--]=y[j++];
  
  return z;
 }

 static int[] getUnion(int x[],int y[])
 {
  Arrays.sort(x);
  Arrays.sort(y);

  x=Arrays.stream(x).distinct().toArray();
  y=Arrays.stream(y).distinct().toArray();

  Vector <Integer> vct= new Vector<>();

  int i,j;
  i=j=0;
 
  while(i<x.length && j<y.length)
  {
   if(x[i]<y[j])
    vct.add(x[i++]);
 
   else
    if(y[j]<x[i])
    vct.add(y[j++]);
  
    else
    {
     vct.add(x[i++]);
     j++;
    }
  }
 
  while(i<x.length) vct.add(x[i++]);
  while(j<y.length) vct.add(y[j++]);   

  int z[]=new int[vct.size()];

  for(i=0;i<vct.size();i++)
   z[i]=vct.get(i);

  return z;
 }

 static int[] mergeAAD(int x[],int y[])
 {
  Arrays.sort(x);
  Arrays.sort(y);

  int z[]=new int[x.length+y.length];

  int i,j,k;
  i=j=0;
  k=(z.length)-1;

  while(i<x.length&&j<y.length)
  {
   if(x[i]<y[j])
    z[k--]=x[i++];
   
   else
    z[k--]=y[j++];
  }

  while(i<x.length) z[k--]=x[i++];
  while(j<y.length) z[k--]=y[j++];
  
  return z;
 }

 static int[] getIntersection(int x[],int y[])
 {
  Arrays.sort(x);
  Arrays.sort(y);

  x=Arrays.stream(x).distinct().toArray();
  y=Arrays.stream(y).distinct().toArray();

  Vector <Integer> vct= new Vector<>();

  int i,j;
  i=j=0;
 
  while(i<x.length && j<y.length)
  {
   if(x[i]<y[j])
    i++;
 
   else
    if(y[j]<x[i])
    j++;
  
    else
    {
     vct.add(x[i++]);
     j++;
    }
  }
 
 

  int z[]=new int[vct.size()];

  for(i=0;i<vct.size();i++)
   z[i]=vct.get(i);

  return z;
 }
}


  
