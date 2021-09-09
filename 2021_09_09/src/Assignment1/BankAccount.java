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
public class BankAccount {
    protected double balance;   //余额
    protected double interest;  //利率

    public BankAccount() {
    }

    public BankAccount(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }

    /**
     * 存款操作
     * 只有当存款金额大于0时才会存款成功
     *
     * @param money 存款金额
     * @return
     */
    public void deposit(double money) {
        if (money > 0) {
            balance += money;
            System.out.println("存款成功，当前账户余额为：¥" + balance);
        } else {
            System.out.println("存款失败");
        }
    }

    /**
     * 取款操作
     * 只有当余额大于取款金额时才会取款成功
     *
     * @param money 取款金额
     */
    public void withdraw(double money) {
        if (money <= balance) {
            balance -= money;
            System.out.println("取款成功，当前账户余额为：¥" + balance);
        } else {
            System.out.println("账户余额不足，取款失败");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }
}
