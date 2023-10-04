package bai3;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap 1 chuoi tu ban phim: ");
        String str = scanner.nextLine();
        String reversedStr = reverseString(str);
        System.out.println("Chuỗi ban đầu: " + str);
        System.out.println("Chuỗi đảo ngược: " + reversedStr);
    }

    public static String reverseString(String str) {
        StringBuffer buffer = new StringBuffer(str);
        buffer.reverse();
        return buffer.toString();
    }
}
