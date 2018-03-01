import java.util.Random;
import java.util.Scanner;

public class zad14 {
    public static void main(String args[]) {
        int a=65;
        int z=90;
        Random random = new Random();
        int b = a + random.nextInt(z - a);
        Scanner scanner = new Scanner(System.in);
        Boolean t= true;
        while (t){
            System.out.println("Введите букву (A..Z)");
            char Ch = scanner.next().charAt(0);
            if (b==(int) Ch) {
                System.out.println("YOU'RE GESSED");
                t = false;
            }
            else {
                if (b-((int) Ch)>0)
                    System.out.println("YOU'RE TOO LOW");
                else
                    System.out.println("YOU'RE TOO HIGH");
            }
        }

    }
}