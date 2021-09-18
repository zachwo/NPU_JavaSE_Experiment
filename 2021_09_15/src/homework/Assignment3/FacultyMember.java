package homework.Assignment3;

import java.util.Objects;

public class FacultyMember implements IFacultyMember{
    protected String identification;
    protected String name;
    protected String contactTelephone;

    Adapter adapter;

    public FacultyMember(UserInfo userInfo) {
        adapter = new Adapter(userInfo);
        this.identification = adapter.getIdentification();
        this.name = adapter.getName();
        this.contactTelephone = adapter.getContactTelephone();
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
        return "FacultyMember{" +
                "identification='" + identification + '\'' +
                ", name='" + name + '\'' +
                ", contactTelephone='" + contactTelephone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FacultyMember that = (FacultyMember) o;
        return Objects.equals(identification, that.identification) && Objects.equals(name, that.name) && Objects.equals(contactTelephone, that.contactTelephone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identification, name, contactTelephone);
    }
}
