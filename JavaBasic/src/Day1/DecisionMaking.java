package Day1;

import java.util.Scanner;

public class DecisionMaking {
    //Ex12
    // Phương thức tính tổng các chữ số
    public int tinhTong(int n) {
        // Chuyển số nguyên n thành chuỗi
        String nAsString = String.valueOf(n);

        int tong = 0;

        // Duyệt qua từng ký tự trong chuỗi
        for (int i = 0; i < nAsString.length(); i++) {
            // Lấy ký tự tại vị trí i và chuyển thành số nguyên
            char digitChar = nAsString.charAt(i);
            int digit = Character.getNumericValue(digitChar);  // Chuyển ký tự thành số nguyên

            // Cộng vào tổng
            tong += digit;
        }

        return tong;
    }


    //Ex13
 public void ConvertMinutesToYearsAndDays(int minutes )
 {
     int minutesInAnHour = 60;
     int hoursInADay = 24;
     int daysInAYear = 365;

     // Convert minutes to total number of days
     int totalDays = minutes / (minutesInAnHour * hoursInADay);

     // Calculate the number of years
     int years = totalDays / daysInAYear;

     // Calculate remaining days
     int remainingDays = totalDays % daysInAYear;

     // Print the result
     System.out.println(minutes + " minutes is approximately " + years + " years and " + remainingDays + " days");
 }
 }



