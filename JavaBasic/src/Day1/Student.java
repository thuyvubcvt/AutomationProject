package Day1;

public class Student {
    private int age;
    private static String name;

    private int getAge() {
        return this.age;
    }

    public void setAge(int age) {
   int i=10;
        if (age < 0) {

            System.out.println("invalid age");

        }

       this.age=age;
}


public static void main(String[] args) {
    Student student = new Student();
    student.setAge(-10);

    System.out.println("age" + student.getAge());


}
}

