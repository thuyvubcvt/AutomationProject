import Day1.DecisionMaking;
import Day1.Operation;
import Day1.Student;
import day1.DataTypesAndVariables;

import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        //khai bao class
        DataTypesAndVariables dataTypesAndVariables = new DataTypesAndVariables();
        // EX1
        //dataTypesAndVariables.printHelloWorld();
        //EX2
        // dataTypesAndVariables.printString();
        //EX3
        // dataTypesAndVariables.printNumber();
        //EX4
        //dataTypesAndVariables.printBoolean();
        //EX6
        //dataTypesAndVariables.convertTemperature();
        //Ex7
        //  dataTypesAndVariables.convetInch();
        //Ex8
        // Operation operation =new Operation();
        // operation.printf();
        //Ex9
        //Operation operation=new Operation();
        // operation.calculateSpeed();
//E10
        // Operation operation= new Operation();
        //    operation.performOperations();

//E11
        //  Operation operation=new Operation();
        // operation.BreakIntegerIntoDigits();
        //}
//E12
/*
        DecisionMaking decisionMaking=new DecisionMaking();
        Scanner sc = new Scanner(System.in);

        // Nhập số nguyên từ người dùng
        System.out.println("Input an integer between 0 and 1000: ");
        int n = sc.nextInt();

        // Kiểm tra giá trị nhập vào hợp lệ (0 <= n < 1000)
        if (n >= 0 && n < 1000) {
            // Tính tổng các chữ số và in kết quả
            int tong = decisionMaking.tinhTong(n);
            System.out.println("The sum of all digits in " + n + " is " + tong);
        } else {
            System.out.println("Please enter an integer between 0 and 1000.");
        }
*/
//E13
        DecisionMaking decisionMaking = new DecisionMaking();
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input the number of minutes
        System.out.print("Input the number of minutes: ");
        int minutes = scanner.nextInt();

        // Call the method to convert minutes to years and days
        //decisionMaking.ConvertMinutesToYearsAndDays(minutes);
        DecisionMaking.ConvertMinutesToYearsAndDays(2);


    }
}
