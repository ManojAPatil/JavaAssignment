//22. Write a program in C++ to find the third angle of a triangle.

class Triangle1{
      public static void main(String []args){
            int a=30 , b=60 , c;
            System.out.println("1st Angle : "+a);
            System.out.println("2nd Angle : "+b);
            c = 180 - (a + b);
            System.out.println("3rd Angle : "+c);
  }
}