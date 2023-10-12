public class Main {
    /**
     * Find and print the maximum between two numbers.
     *
     * @param a The first number.
     * @param b The second number.
     */
    public static void findMax(int a, int b) {
        if (a > b) {
            System.out.println("The maximum number is: " + a);
        } else {
            System.out.println("The maximum number is: " + b);
        }
    }

    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 12;

        System.out.println("Finding the maximum between " + num1 + " and " + num2 + ":");
        findMax(num1, num2);
    }
}
