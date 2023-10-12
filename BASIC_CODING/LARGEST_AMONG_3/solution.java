public class Main {
    /**
     * Find and print the largest of three numbers.
     *
     * @param a The first number.
     * @param b The second number.
     * @param c The third number.
     */
    public static void findMax(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println("The maximum number is: " + a);
        } else if (b > c) {
            System.out.println("The maximum number is: " + b);
        } else {
            System.out.println("The maximum number is: " + c);
        }
    }

    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 5;
        int num3 = 1;

        System.out.println("Finding the maximum among " + num1 + ", " + num2 + ", and " + num3 + ":");
        findMax(num1, num2, num3);
    }
}
