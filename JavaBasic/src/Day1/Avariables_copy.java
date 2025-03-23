package Day1;

public class Avariables_copy {

    private  int age;

    private String name;

    public Avariables_copy(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void printInfo(){
        System.out.println("ten"+name);
        System.out.println("tuoi"+age);
    }

    public static void main(String[] args) {
     Avariables_copy avariables = new Avariables_copy("thuy", 39);


        avariables.printInfo();


    }
}
