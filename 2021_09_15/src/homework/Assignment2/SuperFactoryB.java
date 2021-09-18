package homework.Assignment2;

public class SuperFactoryB implements AbstractFactory{
    @Override
    public HuaWei createHuaweiPhone() {
        return new P50();
    }

    @Override
    public XiaoMi createXiaomiPhone() {
        return new Mi10Ultra();
    }
}
