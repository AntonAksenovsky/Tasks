
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    static office office = new office();

    public static void fill() {
        System.out.println("Введите количество сотрудников, которое вы хотите добавить");
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("ВВедите сотрудника: Фамилия Имя Должность Зарплата");
            Employee employee = new Employee(in.next(), in.next(), Rank.valueOf(in.next()), in.nextInt());
            office.add(employee);
        }
    }

    public static void outInfo() {
        office.showEmployeeList();
    }

    public static void find() {
        System.out.println("Введите должность");
        String rankName = in.next();
        Rank rank = Rank.getRank(rankName);
        if (rank == null) {
            System.out.println("Неизвестная должность " + rankName);
        } else {
            for (Employee employee : office.find(rank)) {
                System.out.println(employee);
            }
            if (office.find(rank).size() == 0) {
                System.out.println("Сотрудников " + rankName + " нет в команде");
            }
        }
    }

    public static void sort() {
        office.sort();
        outInfo();
    }

    public static void main(String[] args) {
        Boolean t = true;
        while (t) {
            System.out.println("Введите команду");
            System.out.println("1:заполнить список сотрудников");
            System.out.println("2:Вывод списка сотрудников");
            System.out.println("3:Поиск сотрудников по должности");
            System.out.println("4:Сортировка списка");
            System.out.println("5:Выход");
            int a = in.nextInt();
            switch (a) {
                case 1:
                    fill();
                    break;
                case 2:
                    outInfo();
                    break;
                case 3:
                    find();
                    break;
                case 4:
                    sort();
                    break;
                case 5:
                    t = false;
                    break;
            }
        }
    }
}
