package danli;
//单例模式设计原则：
//1、将构造方法私有化
//2、将自身作为自身的属性，用静态常量处理
//3、开放公有的、静态的用户获取对象的getInstance()方法
public class Commander {
    //2
    private static final Commander cmd = new Commander();

    //1
    private Commander(){
        System.out.println("构建了一个commander");
    }

    //3
    public static Commander getInstance(){
        return cmd;
    }

    public void makeCommand(){
        System.out.println("下命令：发射导弹");
    }
}
