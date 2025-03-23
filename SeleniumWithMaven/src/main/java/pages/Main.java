package pages;

public class Main {


        public static void main(String[] args) {
            SinhVien sv=new SinhVien("hoa");
            System.out.println(sv.name);
            System.out.println(sv.age);
            System.out.println(sv.driver);

            try {
                int result = 10 / 0; // Lỗi chia cho 0
                System.out.println("Kết quả: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Lỗi: Không thể chia cho 0!");
            }
            System.out.println("Chương trình tiếp tục chạy...");
        }



}



