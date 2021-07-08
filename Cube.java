/*15. Write a program in Java to calculate the volume of a cube.
Sample Output:
Calculate the volume of a cube :
---------------------------------------
Input the side of a cube : 5
The volume of a cube is : 125
*/

class Cube{
      public static void main(String []args){
       int s=5; int v;
       System.out.println("The side of cube is : "+s);
       v=s*s*s;
       System.out.println("The volue of a cube is : "+v);
   }
}