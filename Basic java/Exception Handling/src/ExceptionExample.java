public class JavaExceptionExample {
    public static void main(String args[]) {
        try {
            // Code that may raise ArithmeticException
            int data = 100;
            int result = data / (data - 100); // Dividing by zero here causes ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e);
        }

        try {
            // Code that may raise NumberFormatException
            String s = "abc";
            int i = Integer.parseInt(s); // NumberFormatException
            System.out.println("Parsed Integer: " + i);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e);
        }

        try {
            // Code that may raise NullPointerException
            String s = null;
            System.out.println(s.length()); // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e);
        }

        try {
            // Code that may raise ArrayIndexOutOfBoundsException
            int a[] = new int[5];
            a[10] = 50; // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e);
        }

        // Rest of the program
        System.out.println("Rest of the code...");
    }
}
