public class Test {
  public static void main(String[] args) {
    MyInteger n1 = new MyInteger(5);
    MyInteger n2 = new MyInteger(24);
    
    // Testing getValue()
    System.out.println("n1's value is: " + n1.getValue());
    System.out.println("n2's value is: " + n2.getValue());
    
    // Testing isEven()
    System.out.println("n1 is even? " + n1.isEven());
    
    // Testing isOdd()
    System.out.println("n1 is odd? " + n1.isOdd());
    
    // Testing isPrime()
    System.out.println("n1 is prime? " + n1.isPrime());
    
    // Testing isEven(int specValue)
    System.out.println("15 is even? " + MyInteger.isEven(15));
    
    // Testing isOdd(int specValue)
    System.out.println("15 is odd? " + MyInteger.isOdd(15));
    
    // Testing isPrime(int specValue)
    System.out.println("15 is prime? " + MyInteger.isPrime(15));
    
    // Testing isEven(MyInteger specObject)
    System.out.println("n2 is even? " + MyInteger.isEven(n2));
    
    // Testing isOdd(MyInteger specObject)
    System.out.println("n2 is odd? " + MyInteger.isOdd(n2));
    
    // Testing isPrime(MyInteger specObject)
    System.out.println("n2 is prime? " + MyInteger.isPrime(n2));
    
    // Testing equals(int specValue)
    System.out.println("n1 is equal to 5? " + n1.equals(5));
    
    // Testing equals(MyInteger specObject)
    System.out.println("n1 is equal to n2? " + n1.equals(n2));
    
    // Testing parseInt(char[] charArrayToConvert)
    char[] chars = {'3', '5', '3', '9'};
    System.out.println(MyInteger.parseInt(chars));
    
    // Testing parseInt(String stringToConvert)
    String s = "3539";
    System.out.println(MyInteger.parseInt(s));
  }
}
