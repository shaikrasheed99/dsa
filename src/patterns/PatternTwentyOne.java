package patterns;

/**
 * Print below pattern
 *      #        #
 *      ##      ##
 *      ###    ###
 *      ####  ####
 *      ##########
 *      ####  ####
 *      ###    ###
 *      ##      ##
 *      #        #
 */

public class PatternTwentyOne {
    public static void main(String[] args) {
        int n = 9;
        printPattern(n);
    }

    private static void printPattern(int n) {
        int firstHalf = n / 2 + 1;
        for (int i = 1; i <= firstHalf; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            for (int j = 1; j <= 2 * firstHalf - 2 * i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        int secondHalf = n / 2;
        for (int i = secondHalf; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            for (int j = 1; j <= 2 * secondHalf - 2 * i + 2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
