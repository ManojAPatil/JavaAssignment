/*19. Write a program in Java to find the area and circumference of a circle.
Sample Output:
Find the area and circumference of any circle :
----------------------------------------------------
Input the radius(1/2 of diameter) of a circle : 5
The area of the circle is : 78.5397
The circumference of the circle is : 31.4159
*/

class Circle{
      public static void main(String []args){
              double r=5 , pi=3.14 , a , c;
              System.out.println("Radius of circle : "+r);
              a = pi * r * r;
              c = 2 * pi * r;
              System.out.println("Area of circle : "+a);
              System.out.println("Circumference of circle : "+c);
   }
}