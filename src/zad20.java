import java.util.Scanner;

public class zad20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String des[] = {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC", "C"};
        String ed[] = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        if (a % 10 == 0) {
            System.out.println(des[a / 10 - 1]);
        } else {
            System.out.println(des[a / 10 - 1] + ed[a % 10 - 1]);
        }
    }
}
