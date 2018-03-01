import java.util.Scanner;

public class zad10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b);
        for (int i = 1; i <= n - 2; i++){
            int c = a + b;
            a = b;
            b = c;
            System.out.print(" " + c);
        }
    }
}
