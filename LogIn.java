package MiniTest;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String user, password;
        int number = 0;

        while (number < 3) {
            System.out.print("Nhap user: ");
            user = scanner.nextLine();
            System.out.print("Nhap password: ");
            password = scanner.nextLine();

            if (user.equals("admin") && password.equals("123456")) {
                Display();
                break;
            } else {
                System.out.println("User hoac password khong dung. Vui long nhap lai.");
                number++;
            }
        }

        if (number == 3) {
            System.out.println("Ban da nhap sai qua 3 lan. Chương trình bị khóa.");
        }
    }


    public static void Display() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Ve hinh chu nhat");
        System.out.println("2. Ve tam giac vuong");
        System.out.println("3. Ve tam giac can");
        System.out.print("Lua chon cua ban: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Nhap chieu rong: ");
                int width = scanner.nextInt();
                System.out.print("Nhap chieu cao: ");
                int hight = scanner.nextInt();
                rectangle(width, hight);
                break;
            case 2:
                System.out.print("Nhap chieu cao cua tam giac vuong: ");
                int hightrT = scanner.nextInt();
                rightTriangle(hightrT);
                break;
            case 3:
                System.out.print("Nhap chieu cao cua tam giac can: ");
                int hightiT = scanner.nextInt();
                isoscelesTriangle(hightiT);
                break;
            default:
                System.out.println("Lua chon khong hop le");
        }
    }

    public static void rectangle(int width, int hight) {
        for (int i = 0; i < hight; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void rightTriangle(int hight) {
        for (int i = 0; i < hight; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void isoscelesTriangle(int hight) {
        for (int i = 0; i < hight; i++) {
            for (int j = 0; j < hight - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
