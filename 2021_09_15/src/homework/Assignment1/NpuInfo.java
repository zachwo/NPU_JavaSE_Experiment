package homework.Assignment1;

public class NpuInfo {
    protected String name;
    protected String address;
    protected String telephone;
    //使用双重检查锁进行初始化的实例对象必须使用volatile关键字修饰用于避免重排序
    private volatile static NpuInfo npuInfo;

    private NpuInfo(){
        name = "西北工业大学";
        address = "西安市友谊西路127号";
        telephone = "029-88494433";
    }

    public static NpuInfo getInstance(){
        if (npuInfo == null){
            synchronized (NpuInfo.class){
                if (npuInfo == null){
                    npuInfo = new NpuInfo();
                }
            }
        }
        return npuInfo;
    }

    //三个成员变量只能查看不能修改
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephone() {
        return telephone;
    }
}
