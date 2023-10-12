public class Main {
    /**
     * Find and print the maximum between two numbers.
     *
     * @param a The first number.
     * @param b The second number.
     */
    public static void findMax(int a, int b) {
        int result = a > b ? a : b;
        System.out.println("Maximum: " + result);
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        System.out.println("Finding the maximum between " + a + " and " + b + ":");
        findMax(a, b);
    }
}
