import my_exceptions.AgeException;

public class Main {
    static void checkAge(int age) {
        if (age < 18) {
            throw new AgeException();
        }
        else {
            System.out.println("Access granted - You are old enough!");
        }
    }


    public static void main(String[] args) {
//        checkAge(15); // Set age to 15 (which is below 18...)
//        try {
//            int[] myNumbers = {1, 2, 3};
////            System.out.println(myNumbers[10]);
//            throw new AgeException();
////            throw new ArrayIndexOutOfBoundsException("Error");
//        } catch (ArrayIndexOutOfBoundsException | AgeException e) {
//            System.out.println("something went wrong ");
//        }


       /* } catch (AgeException exception) {
            System.out.println("Age exception happened");*/
        /*} catch (Exception exception) {
            if (exception instanceof ArrayIndexOutOfBoundsException) {
                System.out.println("Something went wrong. Excetion name:" + exception.getClass().getName());
            } else if (exception instanceof  AgeException) {
                System.out.println("Age exception happened");
            } else {
                System.out.println("Something went wrong");
            }

//            System.out.println(exception.getMessage());
        }*/

        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);


        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("something went wrong");
            throw new ArrayIndexOutOfBoundsException();
        } finally {
            System.out.println("good bye!");
        }

        System.out.println("continue");

    }
}
