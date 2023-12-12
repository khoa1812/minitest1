package MiniTest;

import java.util.Scanner;

public class DangNhap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String user, password;
        int soLanThu = 0;

        while (soLanThu < 3) {
            System.out.print("Nhap user: ");
            user = scanner.nextLine();
            System.out.print("Nhap password: ");
            password = scanner.nextLine();

            if (user.equals("admin") && password.equals("123456")) {
                HienThiMenu();
                break;
            } else {
                System.out.println("User hoac password khong dung. Vui long nhap lai.");
                soLanThu++;
            }
        }

        if (soLanThu == 3) {
            System.out.println("Ban da nhap sai qua 3 lan. Chương trình bị khóa.");
        }
    }


    public static void HienThiMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Ve hinh chu nhat");
        System.out.println("2. Ve tam giac vuong");
        System.out.println("3. Ve tam giac can");
        System.out.print("Lua chon cua ban: ");
        int luaChon = scanner.nextInt();

        switch (luaChon) {
            case 1:
                System.out.print("Nhap chieu rong: ");
                int rong = scanner.nextInt();
                System.out.print("Nhap chieu cao: ");
                int cao = scanner.nextInt();
                veHinhChuNhat(rong, cao);
                break;
            case 2:
                System.out.print("Nhap chieu cao cua tam giac vuong: ");
                int caoTG = scanner.nextInt();
                veTamGiacVuong(caoTG);
                break;
            case 3:
                System.out.print("Nhap chieu cao cua tam giac can: ");
                int caoTGC = scanner.nextInt();
                veTamGiacCan(caoTGC);
                break;
            default:
                System.out.println("Lua chon khong hop le");
        }
    }

    public static void veHinhChuNhat(int rong, int cao) {
        for (int i = 0; i < cao; i++) {
            for (int j = 0; j < rong; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void veTamGiacVuong(int cao) {
        for (int i = 0; i < cao; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void veTamGiacCan(int cao) {
        for (int i = 0; i < cao; i++) {
            for (int j = 0; j < cao - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
