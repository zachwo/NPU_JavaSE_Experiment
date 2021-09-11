加减乘除默认是int计算，最后结果转为long
用long型运算需加L：100L+20L


//精确计算小数（例如银行）使用BigDecimal，参数一定要用字符串
        BigDecimal bigDecimal1 = new BigDecimal("2.00");
        BigDecimal bigDecimal2 = new BigDecimal("1.10");
        System.out.println(bigDecimal1.subtract(bigDecimal2));



System.out.println((int)(char)(byte)(-1)); // 65535

byte 1字节 short 2字节 int 4字节 long 8字节
char 2字节

高位扩展：
char转其它类型：直接高位补0（0扩展）
其余类型扩展：高位补符号位（符号位扩展）

高位转低位：
高位直接截断丢弃

正数的原反补码相同
负数的补码为原码符号位不变，数值位取反再加一

默认-1为int型 :
1000 0000  0000 0000  0000 0000  0000 0001 （原，-1），
1111 1111  1111 1111  1111 1111  1111 1111（补）
——〉btye 1111 1111（补），1000 0001 （原，-1）
——〉char 1111 1111 1111 1111（补）高位补符号位
——〉int  0000 0000 0000 0000 1111 1111 1111 1111（补&原) 65535
