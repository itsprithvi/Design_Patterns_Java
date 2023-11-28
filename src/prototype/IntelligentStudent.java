package prototype;

public class IntelligentStudent extends Student{
    int IQ;

    public IntelligentStudent(IntelligentStudent student) {
        super(student);
        this.IQ = student.IQ;
    }

    @Override
    public IntelligentStudent clone() {
//        IntelligentStudent st = new IntelligentStudent();
//        st.setName(this.getName());
//        st.setAge(this.getAge());
//        st.setBatchName(this.getBatchName());
//        st.setAverageBatchPsp(this.averageBatchPsp);
//        st.setPsp(this.getPsp());
//        st.IQ = this.IQ;

        return new IntelligentStudent(this);
    }
}
