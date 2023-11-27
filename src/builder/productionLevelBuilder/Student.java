package builder.productionLevelBuilder;

public class Student {
    String name;
    int age;
    String gender;
    String gradYear;
    double cgpa;
    String address;
    String universityName;

    public Student(Builder builder) {
        if(builder.getAge() > 100) {
            throw new IllegalArgumentException("Age can't be greater than 100");
        }

        this.name = builder.getName();
        this.age = builder.getAge();
    }

    public static Builder getBuilder() {
        return new Builder();
    }


    static class Builder {
        private String name;
        private int age;
        private String gender;
        private String gradYear;
        private double cgpa;
        private String address;
        private String universityName;



        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getGradYear() {
            return gradYear;
        }

        public void setGradYear(String gradYear) {
            this.gradYear = gradYear;
        }

        public double getCgpa() {
            return cgpa;
        }

        public void setCgpa(double cgpa) {
            this.cgpa = cgpa;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getUniversityName() {
            return universityName;
        }

        public void setUniversityName(String universityName) {
            this.universityName = universityName;
        }

        public Student build() {
            return new Student(this);
        }
    }

}





