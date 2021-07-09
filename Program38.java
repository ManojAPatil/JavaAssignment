//38. Write a program in Java that takes a number as input and prints its multiplication table upto 10.

import java.util.*;
class Program38{
      public static void main(String []args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number");
            int num = sc.nextInt();
            for(int i=1;i<11;i++){
               System.out.println(num+"*"+i+"="+(num*i));
     }
  }
}