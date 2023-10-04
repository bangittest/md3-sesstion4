package bai2;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap chuoi 1:");
        String str1 = scanner.nextLine();
        System.out.println("nhap chuoi 2:");
        String str2 = scanner.nextLine();
        System.out.println("nhap chuoi 3:");
        String str3 = scanner.nextLine();

        // Kiểm tra xem chuỗi str1 và str2 có giống nhau hay không
        if (str1.equals(str2)) {
            System.out.println("Chuỗi str1 và str2 giống nhau");
        } else {
            System.out.println("Chuỗi str1 và str2 khác nhau");
        }

        // Kiểm tra xem chuỗi str1 và str3 có giống nhau hay không
        if (str1.equals(str3)) {
            System.out.println("Chuỗi str1 và str3 giống nhau");
        } else {
            System.out.println("Chuỗi str1 và str3 khác nhau");
        }
    }
}
