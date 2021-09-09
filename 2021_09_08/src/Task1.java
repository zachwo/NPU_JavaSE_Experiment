import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Fibonacci数列，F1=F2=1，Fn=Fn-1+Fn-2(n＞=3)
        //要求：
        //控制台随意输入一个数字n，回车，在控制台打印出数列F1, F2,…Fn
        System.out.println("输出Fibonacci数列，当输入小于等于0时停止运行");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            if (n <= 0) {
                break;
            }
            int a = 1;
            int b = 0;
            for (int i = 1; i <= n; i++) {
                int t = a + b;
                a = b;
                b = t;
                System.out.print(t + " ");
            }
            System.out.println();
        }
    }
}
