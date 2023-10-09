package com.sept9;


import java.util.Scanner;

public class Test2 {

 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  
  System.out.println("Enter value for a:");
  
  int a=sc.nextInt();

  System.out.println("Enter value for b:");
  
  int b=sc.nextInt();
  
  int ch;
  do {
   System.out.println("*Arithmatic Menu Driven Application****");;
   System.out.println("1.addition");
   System.out.println("2.substraction");
   System.out.println("3.multiplication");
   System.out.println("4.division");
   System.out.println("5.Exit");
   System.out.println("Enter choice:");
   
    ch=sc.nextInt();
   switch(ch) {
   case 1:
    int add=a+b;
    System.out.println("Addition:"+add);
   break;
   case 2:
    int sub=a-b;
    System.out.println("Substraction:"+sub);
   break;
   case 3:
    int mul=a*b;
    System.out.println("Multiplication:"+mul);
   break;
   case 4:
    int div=a/b;
    System.out.println("Division:"+div);
   break;
   
  case 5:
   System.out.println("Bye Bye");
  break;
  default:
   System.out.println("Wrong choice");
   } 
  }while(ch!=5);
  

 }

}
