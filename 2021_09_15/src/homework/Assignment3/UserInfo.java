package homework.Assignment3;

import java.util.Map;

public class UserInfo implements IUserInfo{
    protected String number;
    protected String id;
    protected String homeAddress;
    protected Map<String,String> teles;
    protected String name;

    public void setNumber(String number) {
        this.number = number;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public void setTeles(Map<String, String> teles) {
        this.teles = teles;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getNumber() {
        return number;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getUserHomeAddress() {
        return homeAddress;
    }

    @Override
    public Map<String, String> getUserTeles() {
        return teles;
    }

    @Override
    public String getName() {
        return name;
    }
}
