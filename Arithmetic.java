/*7. Write a program in C++ to display various type or arithmetic operation using mixed data type.
Sample output:
Display arithmetic operations with mixed data type :
---------------------------------------------------------
5 + 7 = 12
3.7 + 8.0 = 11.7
5 + 8.0 = 13.0
5 - 7 = -2
3.7 - 8.0 = -4.3
5 - 8.0 = -3.0
5 * 7 = 35
3.7 * 8.0 = 29.6
5 * 8.0 = 40.0

5 / 7 = 0
3.7 / 8.0 = 0.5
5 / 8.0 = 0.6*/

class Arithmetic{
      public static void main(String [] args){
           int a=5; int b=7; double c=3.7; double d=8.0;
           System.out.println("5 + 7 = "+(a+b));
           System.out.println("3.7 + 8.0 = "+(c+d));
           System.out.println("5 + 8.0 = "+(a+d));
           System.out.println("5 - 7 = "+(a-b));
           System.out.println("3.7 - 8.0 = "+(c-d));
           System.out.println("5 - 8.0 = "+(a-d));
           System.out.println("5 * 7 = "+(a*b));
           System.out.println("3.7 * 8.0 = "+(c*d));
           System.out.println("5 * 8.0 = "+(a*d));
           System.out.println("5 / 7 = "+(a/b));
           System.out.println("3.7 / 8 = "+(c/d));
           System.out.println("5 / 8.0 = "+(a/d));
   }
}