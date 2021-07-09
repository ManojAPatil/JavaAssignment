//26. Write a program in C++ to convert temperature in Fahrenheit to Kelvin.

class Temperature4{
       public static void main(String []args){
            double f=80.33 ,k;
            System.out.println("The Fahrenheit value : "+f);
            k = (f - 32) * 0.5 + 273.15 ;
            System.out.println("The Kelvin value : "+k);
   }
}