import java.util.ArrayList;
import java.util.List;

public class office {

    private ArrayList<Employee> list = new ArrayList<>();

    public boolean isEmployeeinoffice(Employee employee) {
        return list.contains(employee);
    }

    public void showEmployeeList() {
        for (Employee element : this.list) {
            System.out.print(element.getLastName() + " ");
            System.out.print(element.getFirstName() + " ");
            System.out.print(element.getRank() + " ");
            System.out.println(element.getMoney());
        }

    }

    public void add(Employee employee) {
        list.add(employee);
    }

    public List<Employee> find(Rank rank) {
        ArrayList<Employee> result = new ArrayList<>();
        for (Employee employee : list) {
            if (rank == employee.getRank()) {
                result.add(employee);
            }
        }
        return result;
    }

}
