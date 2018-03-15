import java.util.Scanner;
import java.util.Random;

public class zad11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        Random random = new Random();
        int num = a + random.nextInt(b - a);
        System.out.println(num);
        System.out.println(num);
    }
}
