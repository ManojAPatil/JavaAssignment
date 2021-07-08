/*14. Write a program in Java to calculate the volume of a sphere.
Sample Output:
Calculate the volume of a sphere :
---------------------------------------
Input the radius of a sphere : 6
The volume of a sphere is : 904.32
*/

class Sphere{
      public static void main(String []args){
            int r=6; double pi=3.14; double v;
            System.out.println("The radius of sphere is : "+r);
            v = 1.33*pi*r*r*r;
            System.out.println("The volume of sphere is : "+v);
  } 
}