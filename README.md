# Java-HW-6
Java 360 coding assignment #6

Implement a class named MyInteger. The class contains:                                                                         An int data field named value that stores the int value represented by this object.                                          A constructor that creates a MyInteger object for the specified int value.                                                   A getter method that returns the int value.                                                                                  The methods isEven(), isOdd(), and isPrime() that return true if the value in this object is even, odd, or prime, respectively.                                                                                                                  The static methods isEven(int), isOdd(int), and isPrime(int) that return true if the specified value is even, odd, or prime, respectively.                                                                                                                  The static methods isEven(MyInteger), isOdd(MyInteger), and isPrime(MyInteger) that return true if the specified value is even, odd, or prime, respectively.                                                                                             The methods equals(int) and equals(MyInteger) that return true if the value in this object is equal to the specified value.  A static method parseInt(String) that converts a string into an int value.

Now implement the following class CMPT360 containing the main method that uses the
MyInteger class that you created above. Do not make any changes to this class, use it as is.
public class CMPT360
{
 public static void main(String[] args) {
 MyInteger n1 = new MyInteger(5);
 System.out.println("n1 is even? " + n1.isEven());
 System.out.println("n1 is prime? " + n1.isPrime());
 System.out.println("15 is prime? " + MyInteger.isPrime(15));

 String s = "3539";
 System.out.println(MyInteger.parseInt(s));

 MyInteger n2 = new MyInteger(24);
 System.out.println("n2 is odd? " + n2.isOdd());
 System.out.println("45 is odd? " + MyInteger.isOdd(45));
 System.out.println("n1 is equal to n2? " + n1.equals(n2));
 System.out.println("n1 is equal to 5? " + n1.equals(5));
 }
}
