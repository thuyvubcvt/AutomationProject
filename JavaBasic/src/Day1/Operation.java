package Day1;

import java.util.Scanner;

public class Operation {
    //Ex8
    public void printf(){
        int x = 20;
        String sup = (x <15) ?"small":(x < 22)?"tiny":"huge";

        System.out.println(sup);

    }
    //Ex9
    public void calculateSpeed()
    {
        Scanner scanner = new Scanner(System.in);

        // Input distance in meters
        System.out.print("Input distance in meters: ");
        double distanceInMeters = scanner.nextDouble();

        // Input time: hours, minutes, and seconds
        System.out.print("Input hour: ");
        int hours = scanner.nextInt();

        System.out.print("Input minutes: ");
        int minutes = scanner.nextInt();

        System.out.print("Input seconds: ");
        int seconds = scanner.nextInt();

        // Convert total time to seconds
        int totalSeconds = (hours * 3600) + (minutes * 60) + seconds;

        // Calculate speed in meters per second
        double speedInMetersPerSecond = distanceInMeters / totalSeconds;

        // Calculate speed in kilometers per hour
        double speedInKmPerHour = (distanceInMeters / 1000.0) / (totalSeconds / 3600.0);

        // Calculate speed in miles per hour (1 mile = 1609 meters)
        double speedInMilesPerHour = (distanceInMeters / 1609.0) / (totalSeconds / 3600.0);

        // Output the results
        System.out.println("Your speed in meters/second is " + speedInMetersPerSecond);
        System.out.println("Your speed in km/h is " + speedInKmPerHour);
        System.out.println("Your speed in miles/h is " + speedInMilesPerHour);

    }
    //Ex10
    public void performOperations()
    {
        Scanner scanner = new Scanner(System.in);

        // Nhập hai số nguyên từ người dùng
        System.out.print("Nhập số nguyên thứ nhất: ");
        int num1 = scanner.nextInt();

        System.out.print("Nhập số nguyên thứ hai: ");
        int num2 = scanner.nextInt();

        // Tính tổng, hiệu, tích, trung bình, khoảng cách, giá trị lớn nhất và giá trị nhỏ nhất
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        double average = (num1 + num2) / 2.0; // Lấy giá trị trung bình dưới dạng double
        int distance = Math.abs(difference);  // Khoảng cách là hiệu tuyệt đối
        int maximum = Math.max(num1, num2);  // Giá trị lớn nhất
        int minimum = Math.min(num1, num2);  // Giá trị nhỏ nhất

        // In kết quả ra màn hình
        System.out.println("Tổng của hai số: " + sum);
        System.out.println("Hiệu của hai số: " + difference);
        System.out.println("Tích của hai số: " + product);
        System.out.println("Trung bình của hai số: " + average);
        System.out.println("Khoảng cách giữa hai số: " + distance);
        System.out.println("Số lớn nhất là: " + maximum);
        System.out.println("Số nhỏ nhất là: " + minimum);
    }
//Ex11
    public void BreakIntegerIntoDigits(){
        Scanner scanner = new Scanner(System.in);

        // Input the integer
        System.out.print("Input six non-negative digits: ");
        int number = scanner.nextInt();

        // Check if the input number is a valid 6-digit number
        if (number < 0 || number > 999999) {
            System.out.println("Please enter a number between 0 and 999999.");
        } else {
            // Convert the number to a string to break it into digits
            String numberStr = Integer.toString(number);

            // Loop through each character of the string and print it
            for (int i = 0; i < numberStr.length(); i++) {
                System.out.print(numberStr.charAt(i) + " ");
            }
        }
    }
    }






