/*20. Write a program in C++ to convert temperature in Celsius to Fahrenheit.
Sample Output:
Convert temperature in Celsius to Fahrenheit :
---------------------------------------------------
Input the temperature in Celsius : 35
The temperature in Celsius : 35
The temperature in Fahrenheit : 95
*/

class Temperature{
      public static void main(String []args){
             double c=35 , f ;
             System.out.println("Temperature in celcius : "+c);
             f = (c * 1.8)+32;
             System.out.println("Temperature in Fahrenheit : "+f);
  }
}