package homework.Assignment3;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        UserInfo userInfo = new UserInfo();
        userInfo.setNumber("001");
        userInfo.setId("12345");
        userInfo.setHomeAddress("西北工业大学");
        Map<String,String> map = new HashMap<>();
        map.put("12345", "18888888888");
        userInfo.setTeles(map);
        userInfo.setName("张三");

        FacultyMember facultyMember = new FacultyMember(userInfo);
        System.out.println(facultyMember);
    }
}
