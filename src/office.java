import java.net.SocketPermission;
import java.util.ArrayList;

public class office {

    private ArrayList<Employee> list = new ArrayList<>();

    public boolean isEmployeeinoffcice(Employee employee) {
        return list.contains(employee);
    }

    public void showEmployeeList() {
        /*for (int i = 0; i < list.size();i++){
            System.out.println(list.get(i).toString());//ruined
        }*/
        for (Employee element : this.list) {
            System.out.print(element.getLastName() + ' ');
            System.out.print(element.getFirstName()+' ');
            System.out.print(element.getRank()+' ');
            System.out.println(element.getMoney());
        }

    }

    public void add(Employee employee) {
        list.add(employee);
    }
    public void sort(){
        for(int i = 1; i<list.size();i++){

        }
    }
}
