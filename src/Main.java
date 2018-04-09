
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    static office office = new office();

    public static void fill() {
        System.out.println("Введите количество сотрудников");
        int n = in.nextInt();
        System.out.println("Фамилия Имя Должность Зарплата");
        for (int i = 0; i < n; i++) {
            Employee employee = new Employee(in.next(), in.next(), Rank.valueOf(in.next()), in.nextInt());
            office.add(employee);
        }
    }

    public static void outInfo() {
        office.showEmployeeList();
    }

    public static void find() {
        String rankName = in.next();
        Rank rank = Rank.getRank(rankName);
        if (rank == null) {
            System.out.println("Неизвестная должность " + rankName);
        } else {
            for (Employee employee : office.find(rank)) {
                System.out.println(employee);
            }
        }
    }
    public static void sort(){
        office.sort();
        office.showEmployeeList();
    }
    public static void main(String[] args) {
        System.out.println("Введите команду");
        String command = in.next();
        if (command.equals("fill")) {
            fill();
        }
        outInfo();
        find();
        sort();
    }
}
