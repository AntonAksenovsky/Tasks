
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    static office office = new office();

    public static void fill() {
        System.out.println("Введите количество сотрудников");
        int n = in.nextInt();

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
            System.out.println("Неизвестная должность" + rankName);
        } else {
            for (Employee employee : office.find(rank)) {
                System.out.println(employee);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Введите команду");
        String command = in.next();
        if (command.equals("fill")) {
            fill();
            outInfo();
        }

    /*
        office office = new office();
        Employee IvanovIvan = new Employee("Petrov", "Ivan",rank.ENGINEER,15);
        office.add(IvanovIvan);
        System.out.println(office.isEmployeeinoffice(IvanovIvan));
        Employee PetrovPetr = new Employee("Ivanov", "Petr", rank.DIRECTOR, 20);
        office.add(PetrovPetr);
        System.out.println(office.isEmployeeinoffice(PetrovPetr));
        office.showEmployeeList();

        String a = "инжинер";
        boolean b = Rank.isRankExist(a);
        if (b) {
            System.out.println("Не существует" + a);
            return;
        }
    */
    }
}
