//Array implementation in Java
import java.util.*;
import java.util.stream.*;

class ArrayDemo
{
 public static void main(String...arg)
 {
  int x[]={20,45,10,15,30};
  
  System.out.println();
  System.out.println("Original Array  : "+Arrays.toString(x));

  Arrays.sort(x);
 
  System.out.println("Ascending sort  : "+Arrays.toString(x));

  List<Integer> lst= Arrays.stream(x).boxed().collect (Collectors.toList());
  Collections.sort(lst,Collections.reverseOrder());

  x=lst.stream().mapToInt(n->n).toArray();
  

  System.out.println("Descending Sort : "+Arrays.toString(x));
  System.out.println();
 }
}
