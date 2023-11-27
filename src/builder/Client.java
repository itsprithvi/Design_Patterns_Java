package builder;

public class Client {
    public static void main(String[] args) {
        Helper helper = new Helper();
        helper.name = "Prithvi";


        Student student = new Student(helper);

        System.out.println("debug");
    }
}
