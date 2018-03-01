import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class zad19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            int k, l;
            int arr[] = {a, b, c};
            Arrays.sort(arr);
            int t1 = arr[0] ^ 2 + arr[1] ^ 2;
            int t2 = arr[2] ^ 2;
            if (t1 == t2) {
                System.out.println("Прямоугольный");
            } else if (t2 < t1) {
                System.out.println("Остроугольный");
            } else
                System.out.println("Тупоугольный");

        } else
            System.out.println("Треугольник не существует");
    }
}
