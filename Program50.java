//50. Write a program in C++ to enter length in centimeter and convert it into meter and kilometer.

class Program50{
      public static void main(String []args){
           double c=1000 , m , km;
           m = c / 100;
           km = c /  100000;
           System.out.println("Distance in centimeter : "+c); 
           System.out.println("Distance in Meter : "+m);
           System.out.println("Distance in Kilometer : "+km);
  }
}