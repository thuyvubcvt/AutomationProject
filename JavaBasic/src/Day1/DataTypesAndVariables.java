package day1;

import java.sql.SQLOutput;
import java.util.Scanner;

 public class  DataTypesAndVariables {
    //Ex1
    public  void printHelloWorld(){
        System.out.println("Hello World");
    }
    //Ex2
    public void printString(){
        System.out.println("++++++");
        System.out.println("@@@@@@");
        System.out.println("******");
        System.out.println("######");


    }
    //EX3
    public void printNumber()
    {
        int a=10;
        float b= 20.3F;
        float c=3.14785F;
        System.out.println("in ra a: "+a);
        System.out.println("in ra b: "+b);;
        System.out.println("in ra c: "+c);;
    }

    //EX4
    public void printBoolean(){
        boolean x=true;
        x=false;
        System.out.println("in ra x:"+x);
    }

    //EX6
    public void convertTemperature()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input độ F");
        float degreeF=scanner.nextFloat();

        double degreeC= (degreeF-32)/1.8000;
        System.out.println("Độ F convert sang  ra độ C là "+ degreeC);

    }
    //Ex7
    public void convetInch()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input số");
        float inch=scanner.nextFloat();


        System.out.println(+inch+" inch = "+inch*0.00254+" meter" );

    }
    //
}


