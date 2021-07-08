/*13. Write a program in C++ to swap two numbers.
Sample Output:
Swap two numbers :
-----------------------
Input 1st number : 25
Input 2nd number : 39
After swapping the 1st number is : 39
After swapping the 2nd number is : 25
*/

class SwapNumbers{
      public static void main(String []args){
           int a=25; int b=39; int temp;
           System.out.println("1st number : "+a);
           System.out.println("2nd number : "+b);
           temp = a;
           a = b;
           b = temp;
           System.out.println("After swapping the 1st number is : "+a);
           System.out.println("After swapping the 2nd number is : "+b);
   }
}