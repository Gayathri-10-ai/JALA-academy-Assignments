import java.io.*;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class ExceptionHandling {

    static void throwException() throws ArithmeticException {
        int result = 10 / 0;
    }

    public static void main(String[] args) {

        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught Arithmetic Exception: " + e);
        }

        try {
            throwException();
        } catch (ArithmeticException e) {
            System.out.println("Exception from method: " + e);
        }

        try {
            int[] arr = new int[5];
            System.out.println(arr[10]);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception caught.");
        } catch (Exception e) {
            System.out.println("General Exception caught.");
        }

        try {
            throw new ArithmeticException("Custom Arithmetic Exception");
        } catch (ArithmeticException e) {
            System.out.println("Thrown Exception: " + e.getMessage());
        }

        try {
            throw new CustomException("This is a custom exception");
        } catch (CustomException e) {
            System.out.println("Caught Custom Exception: " + e.getMessage());
        }

        try {
            int num = 10 / 2;
        } finally {
            System.out.println("Finally block executed.");
        }

        try {
            FileReader file = new FileReader("non_existent_file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException caught: " + e);
        }

        try {
            Class.forName("NonExistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException caught: " + e);
        }

        try {
            throw new IOException("Custom IO Exception");
        } catch (IOException e) {
            System.out.println("IOException caught: " + e);
        }

        try {
            ExceptionHandling.class.getDeclaredField("nonExistentField");
        } catch (NoSuchFieldException e) {
            System.out.println("NoSuchFieldException caught: " + e);
        }
    }
}
