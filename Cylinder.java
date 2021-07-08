/*16. Write a program in java to calculate the volume of a cylinder.
Sample Output:
Calculate the volume of a cylinder :
-----------------------------------------
Input the radius of the cylinder : 6
Input the height of the cylinder : 8
The volume of a cylinder is : 904.32
*/

class Cylinder{
      public static void main(String []args){
         double r=6 , h=8 , v , pi=3.14;
         System.out.println("The radius of cylinder : "+r);
         System.out.println("The height of cylinder : "+h);
         v = pi*r*r*h;
         System.out.println("The Volume of cylinder is : "+v); 
   }
}