// import java.util.Scanner;

public class TriangleEdges {
    public static String classifyTriangle(int a, int b, int c) {
        if (isValidTriangle(a, b, c)) {
            if (isEquilateral(a,b,c)) {
                return "Equilateral"; // Tam giác đều
            } else if (isIsosceles(a,b,c)) {
                return "Isosceles"; // Tam giác cân
            } else if (isRightTriangle(a, b, c)) {
                return "Right Triangle"; // Tam giác vuông
            } else {
                return "Scalene"; // Tam giác thường
            }
        } else {
            return "Not a Triangle"; // Không phải tam giác
        }
    }
    
    private static boolean isValidTriangle(int a, int b, int c) {
        return (a > 0 && b > 0 && c > 0 && a + b > c && b + c > a && a + c > b);
    }
    
    static boolean isRightTriangle(int a, int b, int c) {
        return (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b);
    }

    static boolean isEquilateral(int a, int b, int c){
        return (a == b && b == c);
    }

    static boolean isIsosceles(int a, int b, int c){
        return (a == b || b == c || a == c);
    }

    public static void main(String[] args) {
        // Test with sample inputs
        int a = 3, b = 4, c = 5;
        System.out.println("Triangle with sides " + a + ", " + b + ", " + c + " is " + classifyTriangle(a, b, c));
    }
    // public static void TriangleEdges(int a, int b, int c){
    //     // Scanner sc = new Scanner(System.in);
    //     // System.out.println("Nhap canh thu 1 cua tam giac: ");
    //     // a = sc.nextInt();
    //     // System.out.println("Nhap canh thu 2 cua tam giac: ");
    //     // b = sc.nextInt();
    //     // System.out.println("Nhap canh thu 3 cua tam giac: ");
    //     // c = sc.nextInt();

    //     if(a<b+c && b<a+c && c<a+b){
    //         if(a*a == b*b + c*c || b*b == a*a + c*c || c*c == b*b + a*a ){
    //             System.out.println("Day la tam giac vuong");
    //         } else if(a == b && b == c){
    //             System.out.println("Day la tam giac deu");
    //         } else if(a == b || b == c || a == c){
    //             System.out.println("Day la tam giac can");
    //         } else if(a*a >= b*b + c*c || b*b >= a*a + c*c || c*c >= b*b + a*a){
    //             System.out.println("Day la tam giac tu");
    //         } else{         
    //             System.out.println("Day la tam giac nhon");
    //         }
    //     }else{
    //         System.out.println("Day khong la tam giac");
    //     }
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Nhap canh thu 1 cua tam giac: ");
    //     int a = sc.nextInt();
    //     System.out.println("Nhap canh thu 2 cua tam giac: ");
    //     int b = sc.nextInt();
    //     System.out.println("Nhap canh thu 3 cua tam giac: ");
    //     int c = sc.nextInt();
    //     TriangleEdges(a,b,c);
    // }
}
