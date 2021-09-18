package homework.Assignment3;

import java.util.Objects;

public class Adapter implements IFacultyMember{
    protected String identification;
    protected String name;
    protected String contactTelephone;

    public Adapter(UserInfo userInfo ) {
        this.identification = userInfo.getId();
        this.name = userInfo.getName();
        this.contactTelephone = userInfo.getUserTeles().get(userInfo.id);
    }

    @Override
    public String getIdentification() {
        return identification;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getContactTelephone() {
        return contactTelephone;
    }

    @Override
    public String toString() {
        return "Adapter{" +
                "identification='" + identification + '\'' +
                ", name='" + name + '\'' +
                ", contactTelephone='" + contactTelephone + '\'' +
                '}';
    }
}
