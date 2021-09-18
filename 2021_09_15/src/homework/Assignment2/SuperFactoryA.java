package homework.Assignment2;

public class SuperFactoryA implements AbstractFactory{
    @Override
    public HuaWei createHuaweiPhone() {
        return new Mate40();
    }

    @Override
    public XiaoMi createXiaomiPhone() {
        return new Mi10Pro();
    }
}
