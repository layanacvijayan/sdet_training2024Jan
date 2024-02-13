package SdetTestPackages;

public class Student 
{
    int rollno;
    int age;

    public void display1() {
        System.out.println("Hi,Welcome to All of you");
    }

    public void display2() {
        System.out.println("Automation is very easy");
    }
 
    public static void main(String[] args) 
    {
        Student obj = new Student();
        obj.display1();
        obj.display2();
        obj.rollno=49;
        obj.age=24;
        System.out.println("Student's Roll number is:" +obj.rollno);
        System.out.println("Student's Age is: " + obj.age);
    }
}
