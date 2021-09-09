package Assignment3;

public class Manager extends Employee {

    protected double bonus;

    public Manager() {
    }

    public Manager(int ID, String name, double salary, double bonus) {
        super(ID, name);
        this.salary = salary;
        this.bonus = bonus;
    }

    @Override
    public double getMonthPay() {
        return salary + bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", bonus=" + bonus +
                '}';
    }
}
