public class Main {
    /**
     * Print the cost based on the given distance.
     *
     * @param distance The distance for which cost needs to be calculated.
     */
    public static void printCost(int distance) {
        if (distance <= 100) {
            System.out.println("Cost: 5");
        } else if (distance > 100 && distance <= 500) {
            System.out.println("Cost: 8");
        } else if (distance > 500 && distance <= 1000) {
            System.out.println("Cost: 10");
        } else if (distance > 1000) {
            System.out.println("Cost: 12");
        }
    }

    public static void main(String[] args) {
        int distance = 700;
        System.out.println("Calculating cost for distance: " + distance);
        printCost(distance);
    }
}
