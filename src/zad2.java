import java.util.Scanner;

public class zad2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.print("результат " + (a/b) + " и "+(a%b)+" в остатке");
    }
}
