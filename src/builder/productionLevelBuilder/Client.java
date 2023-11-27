package builder.productionLevelBuilder;



public class Client {
    public static void main(String[] args) {
        Student student =
                Student.getBuilder()
                                .setName("prithvi")
                                        .setAge(23)
                                                .build();



        System.out.println("debug");
    }
}
