package btchuong2;
import java.util.Scanner;

public class phuongtrinhbachai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập hệ số a, b, và c từ bàn phím
        System.out.print("Nhap he so a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhap he so b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhap he so c: ");
        double c = scanner.nextDouble();

        // Gọi phương thức giaiPhuongTrinhBac2 để giải phương trình
        giaiphuongtrinhbac2(a, b, c);

        // Đóng Scanner
        scanner.close();
    }

    //  Giải phương trình bậc 2
    public static void giaiphuongtrinhbac2(double a, double b, double c) {
        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem.");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Phuong trinh co nghiem kep x = " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phuong trinh co hai nghiem phan biet:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}
