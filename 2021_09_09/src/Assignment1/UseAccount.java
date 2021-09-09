package Assignment1;

/**
 * 银行业务的程序结构
 * 银行帐户类BankAccount：
 * 数据：余额、利率
 * 操作：查询余额、存款、取款、查询利率、设置利率
 * <p>
 * 主类UseAccount：
 * main()方法，创建BankAccount类的对象，并完成相应操作
 */
public class UseAccount {

    public static void main(String[] args) {
        //假定只有一个用户，账户初始余额为500，利率为0.1
        BankAccount account = new BankAccount(500, 0.1);

        //查询余额：
        System.out.println("当前账户余额为：¥" + account.getBalance());

        //存款：
        account.deposit(1000);
        account.deposit(-3);

        //取款：
        account.withdraw(50);
        account.withdraw(10000);

        //查询利率：
        System.out.println("当前账户利率为：" + account.getInterest());

        //设置利率：
        account.setInterest(0.15);
        System.out.println("当前账户利率为：" + account.getInterest());
    }
}
