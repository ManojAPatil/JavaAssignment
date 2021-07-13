//42. Write a language program in C++ which accepts the user's first and last name and print them in reverse order with a space between them.

class Program42{
      public static void main(String []args){
      String firstName = "Alexandra";
      String lastName = "Abramov";
      String fullName;
      System.out.println("Full Name is :"+firstName+" "+lastName);
      String reverse;
      reverse = firstName;
      firstName = lastName;
      lastName = reverse;
      System.out.println("Reverse :"+firstName+" "+lastName);
  }
}