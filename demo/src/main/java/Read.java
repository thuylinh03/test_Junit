import java.util.Scanner;

public class Read {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Total = 0;
        int Counter = 0;
        int field1, field2;
        field2 = scanner.nextInt();

        // Đọc dữ liệu cho đến khi gặp kết thúc file (EOF)
        while (scanner.hasNext()) {
            // Đọc một bản ghi
            field1 = scanner.nextInt();

            // Nếu field1 bằng 0
            if (field1 == 0) {
                // Thêm field1 vào tổng
                Total += field1;
                // Tăng biến đếm Counter
                Counter++;
            } else {
                // Nếu field2 bằng 0
                if (field2 == 0) {
                    // In ra tổng và Counter
                    System.out.println("Total: " + Total + ", Counter: " + Counter);
                    // Đặt lại Counter về 0
                    Counter = 0;
                } else {
                    // Trừ field2 từ Total
                    Total -= field2;
                }
            }
            // In ra "End Record"
            System.out.println("End Record");
        }
        // In ra Counter
        System.out.println("Counter: " + Counter);
        scanner.close();
    }
}
