package Assignment3;

public abstract class Employee implements Comparable {

    protected int ID;
    protected String name;
    protected double salary;

    public Employee() {
    }

    public Employee(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }


    @Override
    public int compareTo(Object o) {
        //自定义对象比较规则
        Employee e = (Employee) o;
        if (salary - e.getSalary() > 0) {
            return 1;
        } else {
            return -1;
        }
    }

    public abstract double getMonthPay();

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
