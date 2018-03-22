public class Main {

    public static void main(String[] args) {
        office office = new office();
        Employee IvanovIvan = new Employee("Petrov", "Ivan",rank.ENGINEER,15);
        office.add(IvanovIvan);
        System.out.println(office.isEmployeeinoffcice(IvanovIvan));
        Employee PetrovPetr = new Employee("Ivanov", "Petr", rank.DIRECTOR, 20);
        office.add(PetrovPetr);
        System.out.println(office.isEmployeeinoffcice(PetrovPetr));
        office.showEmployeeList();
    }
}
