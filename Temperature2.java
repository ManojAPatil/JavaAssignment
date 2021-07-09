//24.Write a program in C++ to convert temperature in Kelvin to Fahrenheit.

class Temperature2{
      void kTOf(){
              double k=300 ,f;
             System.out.println("The temperature in Kelvin : "+k);
             f = (k - 273.15)*(1.8)+32;
             System.out.println("The temperature in Fahrenheit : "+f);
}
      public static void main(String []args){
               Temperature2 temp = new Temperature2();
               temp.kTOf();                     
  }
}