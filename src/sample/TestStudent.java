package sample;

public class TestStudent {
    public static void main (String[] args){
        Student s1 = new Student("Alex", 4);
        Student s2 = new Student("Johny", 9);
        Student s3 = new Student("Will");
        s3.setNumber(16);
        System.out.println(s1);
        s1.getInfo();
        s2.getInfo();
        s3.getInfo();
    }
}
