package Assignment3;

/**
 * 测试Employee类和SalesEmployee类
 */
public class TestEmployee {

    public static void main(String[] args) {

        SalesEmployee salesEmployee = new SalesEmployee(1002,"李四",10000);
        salesEmployee.setSalary(3000);
        System.out.println(salesEmployee);
        System.out.println("销售员总月收入为："+salesEmployee.getMonthPay());

        Manager manager = new Manager(1003,"王五",7000,500);
        System.out.println(manager);
        System.out.println("经理总月收入为："+manager.getMonthPay());

    }
}

