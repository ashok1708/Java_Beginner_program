import static java.lang.System.*;
import static java.lang.Math.*;

class StaticImportMath
{
 public static void main(String...arg)throws ClassNotFoundException
 {
  out.println("Power Function         : "+pow(2,3));
  out.println("Random Value           : "+((int)(random()*10)));
  out.println("Sin(PI/4)              : "+sin((PI/4)));
  out.println("Cos(PI/4)              : "+cos((PI)));
  out.println("Max number b/w (5,6)   : "+max(5,6));
  out.println("SquareRoot of (456)    : "+sqrt(456));
  out.println("E                      : "+E);
  out.println("radian                 : "+toRadians(PI/2));
  out.println("To degree              : "+toDegrees(PI/2));
  
}
 
 
}

   
