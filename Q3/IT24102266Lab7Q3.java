import java.util.Scanner;

public class IT24102266Lab7Q3
{
 public static void main(String args[])
 {
  int cus = 1;
  double discount=0 , t_amount=0, b_amount=0;
  char method;
 
  Scanner aa = new Scanner (System.in);
  
  while(cus<=5)
  { 
    System.out.println( "Customer " + cus);
    System.out.print("Enter total bill amount :");
    b_amount=aa.nextInt();

    System.out.print("Enter mode of payment (C for cash , O for other ): ");
    method=aa.next().charAt(0);
 
    if(method=='c' || method=='C')
    {
     discount=b_amount*5/100;
     t_amount=b_amount-discount;
    }
    else if(method=='o' || method=='O')
    {
     discount=0;
     t_amount=b_amount-discount;

    }
    else
    {
    System.out.println("Payment Mode is Not Valid ");
    continue;
    }
    System.out.println( "Enter total bill amount :" + b_amount);
    System.out.println( "Discount is : " + discount);
    System.out.println( "Amount to be paid : " + t_amount);
   
  cus++;
  }
 }
}
    