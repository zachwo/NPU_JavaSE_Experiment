package Task2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.zip.Inflater;

/**
 * 创建一个类Employee，内有属性String name, double salary
 * 创建一个主程序类TestEmployee，控制台给出提示信息，让用户依次输入5组数据以创建5个Employee对象
 * 由于不能确定控制台输入的salary是否为double型，所以请创建一个InputDoubleException异常类，并在用户输入错误数据后抛出
 * 请在主程序类中将输入的5组数据以name为key，Employee对象为value存入HashMap中
 * 请遍历HashMap中的键值对，将他们输出到磁盘文件c:\EmployeeInfo.txt
 */
public class TestEmployee {

    public static void main(String[] args) throws IOException {
        String name;
        double salary;

        HashMap<String, Employee> hm = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            name = scan.next();
            salary = scan.nextDouble();
            Employee employee = new Employee(name, salary);
            hm.put(name, employee);
        }

        String addr = "/Users/wangze/Desktop/软件工程技术实验（Java班）/homework3/EmployeeInfo.txt";
        File f = new File(addr);
        if (!f.exists()) {
            f.createNewFile();
        }
        Set<Map.Entry<String, Employee>> set = hm.entrySet();
        FileWriter fw = new FileWriter(addr, true);
        for (Map.Entry<String, Employee> e : set) {
            String key = e.getKey();
            String value = e.getValue().toString();

            fw.write(key + " " + value+ "\n");
            fw.flush();
        }
        fw.close();

    }
}
