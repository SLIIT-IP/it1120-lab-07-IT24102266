import java.util.Scanner;

public class IT24102266Lab7Q2B
{
 public static void main(String args[])
 {
  int x ,y;
  
  x=1;
  while(x<=5)
  {
   y=1;
   System.out.print(x + " - ");

   while(y<=x)
   {
    System.out.print( " * ");
    y++;
   }
   System.out.println("\t");
   x++;
  }
}
}
