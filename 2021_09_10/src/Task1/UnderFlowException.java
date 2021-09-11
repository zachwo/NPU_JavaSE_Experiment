package Task1;

/**
 * 自己设计两个异常类,数据超出最大值>=1000的异常类OverFlowException,数据<=0的异常类UnderFlowException,
 * 这两个异常继承运行异常RuntimeException
 */
public class UnderFlowException extends RuntimeException {
    public UnderFlowException(String message) {
        super("Value is Under Err " + message);
    }
}
