package prototype;

public class Client {

    public static void fillRegistery(StudentRegistery registery) {
        Student julyBatch = new Student();
        julyBatch.setBatchName("july22");
        julyBatch.setAverageBatchPsp(90);
        registery.register("july22", julyBatch);

        Student augBatch = new Student();
        julyBatch.setBatchName("aug22");
        julyBatch.setAverageBatchPsp(90);
        registery.register("aug22", augBatch);

        IntelligentStudent septBatch = new IntelligentStudent();
        septBatch.setBatchName("sept22");
        septBatch.setAverageBatchPsp(89);
        septBatch.IQ = 90;
        registery.register("sept22", septBatch);

    }
    public static void main(String[] args) {

       StudentRegistery registery = new StudentRegistery();
       fillRegistery(registery);

        Student saket = registery.get("july22").clone();
        saket.setName("saket");
        saket.setPsp(90);
        saket.setAge(30);

        Student suyash = registery.get("july22").clone();
        suyash.setName("suyash");
        suyash.setPsp(90);
        suyash.setAge(30);



        Student prithvi = registery.get("aug22").clone();
        prithvi.setName("prithvi");
        prithvi.setPsp(90);
        prithvi.setAge(30);

        Student raj = registery.get("aug22").clone();
        raj.setName("raj");
        raj.setPsp(90);
        raj.setAge(30);

        Student maria = registery.get("sept22").clone();
        raj.setName("maria");
        raj.setPsp(90);
        raj.setAge(30);


        System.out.println("Debug");
    }
}
