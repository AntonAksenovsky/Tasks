import java.util.Scanner;

public class zad18 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String arr[][] = {
                {"   ***   ", "   *   ", "  ***  ", "  ***  ", "    *  ", " ***** ", "  ***  ", " ***** ", "  ***  ", "  ***  "},
                {"  *   *  ", "  **   ", " *   * ", " *   * ", "   **  ", " *     ", " *   * ", "     * ", " *   * ", " *   * "},
                {" *     * ", " * *   ", " *   * ", "     * ", "  * *  ", " *     ", " *     ", "    *  ", " *   * ", " *   * "},
                {" *     * ", "   *   ", "    *  ", "  ***  ", " *  *  ", " ****  ", " ****  ", "   *   ", "  ***  ", "  ***  "},
                {" *     * ", "   *   ", "   *   ", "     * ", " ***** ", "     * ", " *   * ", "  *    ", " *   * ", "     * "},
                {"  *   *  ", "   *   ", "  *    ", " *   * ", "    *  ", " *   * ", " *   * ", " *     ", " *   * ", "     * "},
                {"   ***   ", " ***** ", " ***** ", "  ***  ", "    *  ", "  ***  ", "  ***  ", " *     ", "  ***  ", "  ***  "}};

        String s = sc.next();

        int mas[] = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            mas[i] = s.charAt(i) - '0';
        }

        for (int j = 0; j < 7; j++) {
            for (int i = 0; i < s.length(); i++) {
                System.out.print(arr[j][mas[i]]);
            }
            System.out.println();
        }
    }
}
