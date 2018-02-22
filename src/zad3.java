import java.util.Scanner;

public class zad3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        boolean[]  days = {true,false,true,true,true,false,false};
        int i = scanner.nextInt();
        if (days[i-1])
            System.out.println("false");
         else
            System.out.println("true");

    }
}
