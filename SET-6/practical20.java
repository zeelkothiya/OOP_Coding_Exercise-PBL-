//AIM
/*Take the value of denominator and numerator from user using command-line argument.
Implement the concept of exception handling to manage all possible run-time error. */

public class practical20 {
    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                throw new IllegalArgumentException("Please provide exactly two arguments");
            }

            int numerator = Integer.parseInt(args[0]);
            int denominator = Integer.parseInt(args[1]);

            int result = numerator / denominator;

            System.out.println("Result = " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Program executed");
        }
    }
}
