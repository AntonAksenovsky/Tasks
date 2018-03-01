import java.util.Scanner;
import java.math.*;
public class zad13 {
    public static void main(String args[]) {
        System.out.println("введите длинну массива:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double array[] = new double[n];
        for (int i=0; i<n; i++) {
            double r = Math.random() * 100;
            array[i] = r;
        }
        Boolean t=true;
        while (t){
            System.out.println("");
            System.out.println("1:вывести массив");
            System.out.println("2:увеличить элемент массива на 10%");
            System.out.println("3:выход");
            System.out.println("");
            int a = in.nextInt();
            switch (a){
                case 1:
                    for (int i=0; i<n; i++)
                        System.out.print(array[i]+ " ");
                    break;
                case 2:
                    System.out.println("Введите номер элемента массива");
                    int q = in.nextInt();
                    array[q-1]*=1.1;
                    break;
                case 3:
                    t = false;
                    break;
            }
        }
    }
}