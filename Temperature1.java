//21:Write a program in C++ to convert temperature in Fahrenheit to Celsius.

class Temperature1{
      public static void main(String []args){
             int f=94 ,c;
             System.out.println("The temperature in Fahrenheit : "+f);
             c = (f - 32) * 5 / 9;
             System.out.println("The temperature in Celcius : "+c);         
  }
}