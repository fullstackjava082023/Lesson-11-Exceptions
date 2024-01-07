package my_exceptions;

/*
  What is the purpose of this Java code snippet?
  What is the expected output of this code when executed?
  What happens in the inner catch block if an ArithmeticException occurs during the inner division?
  What is the order of execution for the finally blocks when an exception is thrown?
  If you remove the division by zero in the outer try block, what will be the output of the code?
*/

public class NestedTryCatchFinally {
    public static void main(String[] args) {
        try {
            System.out.println("Outer Try Block - Start");
            int result = divide(10, 2);
            System.out.println("Result: " + result); // This line won't be reached.
            System.out.println("Outer Try Block - End");
        } catch (ArithmeticException e) {
            System.out.println("Outer Catch Block (ArithmeticException)");
            try {
                System.out.println("Inner Try Block - Start");
                int result = divide(20, 0);
                System.out.println("Result: " + result);
                System.out.println("Inner Try Block - End");
            } catch (ArithmeticException innerException) {
                System.out.println("Inner Catch Block (ArithmeticException)");
            } finally {
                System.out.println("Inner Finally Block");
            }
        } finally {
            System.out.println("Outer Finally Block");
        }
    }
    //Outer Try Block - Start
    //Outer Catch Block (ArithmeticException)
    //Inner Try Block - Start
   //Inner Catch Block (ArithmeticException)
    //Inner Finally Block
    //Outer Finally Block

    public static int divide(int numerator, int denominator) {
        return numerator / denominator;
    }
}

