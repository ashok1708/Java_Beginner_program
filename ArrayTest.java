class ArrayTest
{
 public static void main(String...arg)
 {
  int x[][][]={{{1},{2,3,4}},{{11,12,13,14}},{{21,22,23},{31,32,33,34}},{{50}}};
  
   System.out.println(x.length);
   System.out.println(x[0].length);
   //System.out.println(x[1][2].length);
   System.out.println(x[2][1].length);

   Object o=x[2][1];

  // o[3]=100;

   ((int[])o)[3]=100;    
  
   System.out.println("\n");
   
   for(int blocks[][]: x)
   {
    for(int rows[] : blocks)
    {
     for(int val : rows)
     {
      System.out.printf("%2d ",val);
     }
      System.out.println();
    }
     System.out.println();
   }
  }
 }


