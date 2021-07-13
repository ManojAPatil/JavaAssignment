//43. Write a language program which accepts the radius of a circle from the user and compute the area and circumference.

class Program43{
      public static void main(String []args){
          double r=5 , area , circumference;
          final double pi = 3.14;
          area = pi * r * r;
          circumference = 2 * pi * r;
          System.out.println("Area of Circle : "+area);
          System.out.println("Circumference of Circle : "+circumference);
  }
}