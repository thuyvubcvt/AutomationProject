package Day1;

public class Avariables_copy2 {

    private  int age;

    private String name;

    public Avariables_copy2(String name, int age) {
        this.name = name;
        this.age = age;

    }
    public Avariables_copy2 printInfo(){

        return new Avariables_copy2(name,age);

    }

    public static void main(String[] args) {
     Avariables_copy2 avariables = new Avariables_copy2("thuy", 39);


        System.out.println(avariables.printInfo());


    }
}
