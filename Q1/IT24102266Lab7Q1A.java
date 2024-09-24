import java.util.Scanner;

public class IT24102266Lab7Q1A
{
 public static void main(String args[])
 { 
  int marks , total = 0 , x=1 , a=1;
  float avg;
  String grade;
   
  Scanner ga = new Scanner (System.in);

  while(x<=4)
  {
  System.out.print("Enter Subject marks " +  a++ +":");
  marks = ga.nextInt();
  
  total=marks + total;
  x++;
  }
  avg=total/4;
   
  if(avg<=100 && avg>=75)
   grade="Distinction";
  
  else if (avg<=74 && avg>=50)
   grade="Credit";
  
  else
    grade="Fail";
  
 

  System.out.println(" Average is : " + avg);
  System.out.print( " Over all Grade is : " + grade);
 }






















}