package Assignment3;

public class SalesEmployee extends Employee {

    protected double profit;

    public SalesEmployee() {
    }

    public SalesEmployee(int ID, String name, double profit) {
        super(ID, name);
        this.profit = profit;
    }

    @Override
    public String toString() {
        return "SalesEmployee{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", profit=" + profit +
                '}';
    }

    @Override
    public double getMonthPay() {
        return salary + (profit * 0.2);
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }
}
