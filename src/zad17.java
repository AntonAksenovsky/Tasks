import java.math.*;
import java.util.Random;


public class zad17 {
    public static void main(String args[]) {
        Random random = new Random();
        int arr[][] = new int[6][7];
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 6; j++) {
                arr[i][j] = random.nextInt(10);
            }
        }

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 6; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int num = 0, max = 0;
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 6; j++)
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    num = j;
                }
            arr[i][num] = arr[i][0];
            arr[i][0] = max;
        }

        System.out.println();

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 6; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
