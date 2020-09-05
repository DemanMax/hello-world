package sample;

public class Student {
    private String name;
    private int number;
    public static int count = 0;

    public Student(String n, int a){
        name = n;
        number = a;
        count++;
    }
    public Student(String n){
        name = n;
        number = 1;
    }
    public Student() {
        name = "Paul";
        number = 1;
    }
    public void setNumber(int number){
        this.number = number;
    }
    public void setName(String Name){
        this.name = name;
    }
    public String getName(String name) {
        return name;
    }
    public int  getNumber() {
        return number;
    }
    public String toString(){
        return this.name+", age"+this.number;
    }
    public void getInfo(){
        System.out.println(name+"'s number in class is "+number);
    }
}
