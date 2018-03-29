public class Employee {

    private String lastName;
    private String firstName;
    private Rank Rank;
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

    public Rank getRank() {
        return Rank;
    }

    public Employee(String lastName, String firstName, Rank rank, int money) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.Rank = rank;
        this.money = money;
    }

    public void fill(String s1, String s2, Rank rank, int money) {
        this.firstName = s1;
        this.lastName = s2;
        this.Rank = rank;
        this.money = money;

    }
    public String toString(){
        return lastName + " " + firstName + " " + this.Rank.getName() + " " + money;
    }
}
