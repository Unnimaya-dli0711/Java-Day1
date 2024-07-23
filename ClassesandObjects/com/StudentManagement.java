package ClassesandObjects.com;

class Student{
    String studentId;
    int age;
    String name;
    char grade;

    void set(String name,int age,String studentId,char grade){
        this.name=name;
        this.age=age;
        this.studentId=studentId;
        this.grade=grade;
    }

    void get(){
        System.out.println("Name : "+this.name);
        System.out.println("Age : "+this.age);
        System.out.println("Id : "+this.studentId);
        System.out.println("Grade : "+this.grade);
    }
}

public class StudentManagement {
    public static void main(String[] args){
        Student student1=new Student();
        student1.set("Maya",21,"IDO1",'A');
        student1.get();

        Student student2=new Student();
        student2.set( "Sandra", 22, "IDO2", 'A');
        student2.get();

        Student student3=new Student();
        student3.set("Unni",22,"IDO3",'B');
        student3.get();
    }
}
