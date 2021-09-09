import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        System.out.println(2.00 - 1.10);

        //精确计算小数（例如银行）使用BigDecimal，参数一定要用字符串
        BigDecimal bigDecimal1 = new BigDecimal("2.00");
        BigDecimal bigDecimal2 = new BigDecimal("1.10");
        System.out.println(bigDecimal1.subtract(bigDecimal2));

        //加减乘除默认是int计算，最后结果转为long
        //用long型运算需加L：100L+20L

        String a = "abc";
        String b = "abc";
        System.out.println(a==b); //true

        String c = new String("abc");
        String d = new String("abc");
        System.out.println(c==d);//false

        Long x = 100L;
        Long y = 100L;
        System.out.println(x==y);//true

        Integer a1 = 100;
        Integer b1 = 100;
        System.out.println(a1==b1); //true,因为100在常量池中

        Integer a2 = 200;
        Integer b2 = 200;
        System.out.println(a2 == b2);//false
        System.out.println(a2.intValue() == b2.intValue());//true,直接判断数值的大小
        System.out.println((int)'a');
    }
}
