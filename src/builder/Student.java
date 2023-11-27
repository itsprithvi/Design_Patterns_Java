package builder;

public class Student {
    String name;
    int age;
    String gender;
    String gradYear;
    double cgpa;
    String address;
    String universityName;

    public Student(Helper helper) {
        if(helper.age > 100) {
            throw new IllegalArgumentException("Age can't be greater than 100");
        }

        this.name = helper.name;
        this.age = helper.age;
    }
}

