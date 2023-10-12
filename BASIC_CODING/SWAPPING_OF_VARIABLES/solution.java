public class Main {
    public static void swap(int a, int b) {
        /* Swap two integers a and b */
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        swap(a, b);
    }
}
