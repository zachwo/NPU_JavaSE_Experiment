import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //冒泡法排序(从小到大)
        //从控制台输入十个数字，并在控制台打印由小到大的数字序列
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int t = scanner.nextInt();
            array[i] = t;
        }

        for (int i = 0; i < array.length - 1; i++) {
            //循环冒泡array.length-1趟
            for (int j = 0; j < array.length-1-i; j++) {
                //每冒泡一趟就有一个数归位所以冒泡比较array.length-1-i次
                if (array[j] > array[j+1]) {
                    int t = array[j];
                    array[j] = array[j+1];
                    array[j+1] = t;
                }
            }
        }

        for (int x : array) {
            System.out.print(x + " ");
        }

    }
}
