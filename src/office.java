import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class office {

    private ArrayList<Employee> list = new ArrayList<>();
    // private Comparator<Employee>;

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

    public void sort() {
        for (int i = list.size()-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (list.get(j).compareTo(list.get(j + 1)) > 0) {
                    Employee buf = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, buf);
                }
            }
        }
    }
}
