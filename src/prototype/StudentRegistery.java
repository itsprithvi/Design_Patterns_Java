package prototype;

import java.util.*;

public class StudentRegistery {

    Map<String, Student> map = new HashMap<>();

    Student get(String key) {
        return map.get(key);
    }

    void register(String key, Student st) {
        map.put(key, st);
    }

}
