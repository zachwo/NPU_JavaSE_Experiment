package Assignment2;

/**
 * 测试Employee类和SalesEmployee类
 */
public class TestEmployee {

    public static void main(String[] args) {
        Employee employee = new Employee(1001, "张三");
        System.out.println(employee);
        employee.setSalary(5500);
        System.out.println(employee);

        SalesEmployee salesEmployee = new SalesEmployee(1002,"李四",10000);
        System.out.println(salesEmployee);

    }
}

