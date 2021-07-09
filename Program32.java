//32. Write a program in Java to check whether a number is positive, negative or zero.
import java.util.*;
class Program32{
      public static void main(String []args){
      Scanner sc= new Scanner(System.in); 
      System.out.print("Enter a number: ");
      int num= sc.nextInt(); 
      if(num==0){
         System.out.println("Number is Zero");
     } else if((num%2)==0) {
          System.out.println("Nmber is Positive");
      } else{
             System.out.println("Number is Negative"); 
     }     
  }
}