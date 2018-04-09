public class Employee extends Object implements Comparable {

    private String lastName;
    private String firstName;
    private Rank Rank;
    private int money;

    public String getLastName() {
        return lastName;
    }

    public int getMoney() {
        return money;
    }

    public Rank getRank() {
        return Rank;
    }

    public Employee(String lastName, String firstName, Rank rank, int money) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.Rank = rank;
        this.money = money;
    }


    public String toString() {
        return lastName + " " + firstName + " " + this.Rank.getName() + " " + money;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Employee) {
            Employee second = (Employee) o;

            if (this.lastName.compareTo(second.getLastName()) == 0) {
                return this.money - second.getMoney();
            } else {
                return this.lastName.compareTo(second.getLastName());
            }
        }
        return 1;
    }
}
