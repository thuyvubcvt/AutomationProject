package Day1;

public class Avariables_copy1 {



    public int tong2so(int a, int b) {
        return a+b;
    }
    public int tong3so(int a, int b, int c) {
        return a+b+c;
    }
    public static Avariables_copy1 createObject() {
        return new Avariables_copy1();
    }

    public static void main(String[] args) {
     Avariables_copy1 avariables = new Avariables_copy1();
        //System.out.println(avariables.tong2so(2,3));
        int i = avariables.tong2so(2, 3);
        System.out.println(i);
        System.out.println(avariables.tong3so(1,2,3));
        System.out.println("inra "+avariables.createObject());



    }
}
