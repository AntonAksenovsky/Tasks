import java.util.Scanner;

public class zad8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean isProstoe = false;
        for (int i = 2; i<=Math.sqrt(n);i++){
            if ((n % i) == 0){
                isProstoe = true;
                break;
            }
        }
        if (isProstoe) {
            System.out.println("ne prostoe");
        } else {
            System.out.println("prostoe");
        }
    }
}
