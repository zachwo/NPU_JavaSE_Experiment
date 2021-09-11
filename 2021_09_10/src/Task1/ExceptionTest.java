package Task1;

import java.io.PrintStream;

/**
 * 自己设计两个异常类,数据超出最大值>=1000的异常类OverFlowException,数据<=0的异常类UnderFlowException,
 * 这两个异常继承运行异常RuntimeException
 * 再生成一个异常测试类ExceptionTest,定义两个变量intMath1,intMath2用IF语句判断,
 * intMath1- intMath2 <=0则抛出错误信息”Value is Under Err  + 具体的值”
 * intMath1- intMath2 >=1000则抛出错误信息”Value is Over Err  + 具体的值” (以上在main里测试)
 */
public class ExceptionTest {

    public static void main(String[] args) {
        int intMath1 = 1;
        int intMath2 = 20;
        if (intMath1 - intMath2 >= 1000) {
            throw new OverFlowException(String.valueOf(intMath1 - intMath2));
        }
        if(intMath1 - intMath2 <= 0){
            throw new UnderFlowException(String.valueOf(intMath1 - intMath2));
        }

    }
}
