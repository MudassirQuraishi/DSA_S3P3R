public class Main {
    /**
     * Print the lowercase weekday name based on the weekday number using a switch statement.
     *
     * @param n The weekday number (1 to 7, where 1 is Monday and 7 is Sunday).
     */
    public static void weekdayName(int n) {
        switch (n) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("invalid");
        }
    }

    public static void main(String[] args) {
        int dayNumber = 3;
        System.out.println("Determining weekday name for day number: " + dayNumber);
        weekdayName(dayNumber);
    }
}
