import java.sql.*;
import java.util.*;

class SameNameClassesDifferentPackages
{
 public static void main(String...arg)
 {
  //Date dt;
  java.util.Date du;
  java.sql.Date ds;

  du=new java.util.Date();
   
  ds=new java.sql.Date(du.getTime());
  
  System.out.println();
  System.out.println("du  : "+du);
  System.out.println("ds  : "+ds);
  System.out.println(du.getTime());

 }
}