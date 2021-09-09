package danli;

//设计模式：单例模式（饿汉式）
//在系统中只能有一个该类的对象实例存在

//1、将构造方法私有化
//2、将自身作为自身的属性，用静态常量处理
//3、开放公有的、静态的用户获取对象的getInstance()方法
public class Test {
    public static void main(String[] args) {
      Commander cmd1 =Commander.getInstance();
      Commander cmd2 =Commander.getInstance();

      System.out.println(cmd1);
      System.out.println(cmd2);
      System.out.println(cmd1==cmd2);

      cmd1.makeCommand();

    }
}
