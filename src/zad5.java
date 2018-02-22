import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int a = 0;
        while (i!=0){
            a+=i%10;
            i=i/10;

        }
        System.out.println(a);
    }
}
