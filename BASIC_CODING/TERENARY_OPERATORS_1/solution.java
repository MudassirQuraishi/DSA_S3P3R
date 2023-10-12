public class Main {
    /**
     * Determine and print whether a candidate has passed or failed based on their marks.
     *
     * @param marks The marks for which pass/fail status needs to be determined.
     */
    public static void hasPassed(int marks) {
        String result = (marks >= 40) ? "pass" : "fail";
        System.out.println(result);
    }

    public static void main(String[] args) {
        int marks = 52;
        System.out.println("Determining pass/fail status for marks: " + marks);
        hasPassed(marks);
    }
}
