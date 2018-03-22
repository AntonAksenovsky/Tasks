public class Employee {

    private String lastName;
    private String firstName;
    private rank Rank;
    private int money;

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }



    public int getMoney() {
        return money;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public rank getRank() {
        return Rank;
    }

    public Employee(String lastName, String firstName, rank rank, int money) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.Rank = rank;
        this.money = money;
    }
}
