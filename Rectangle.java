/*17. Write a program in Java to find the Area and Perimeter of a Rectangle.
Sample Output:
Find the Area and Perimeter of a Rectangle :
-------------------------------------------------
Input the length of the rectangle : 10
Input the width of the rectangle : 15
The area of the rectangle is : 150
The perimeter of the rectangle is : 50
*/
class Rectangle{
      public static void main(String []args){
              int l=10 , w=15 , a , p ;
              System.out.println("Length of rectangle : "+l);
              System.out.println("Width of rectangle : "+w);
              a = l * w ;
              p = 2 * (l + w);
              System.out.println("Area of rectangle : "+a);
              System.out.println("Perimeter of rectangle : "+p);
  }
}