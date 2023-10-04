package rigisterEmail;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegisterEmail {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String regaxEmail= "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
        String regaxAcout="^[_a-z0-9]{6,}$";
        do {
            System.out.println("nhap emai: ");
            String email=scanner.nextLine();
            System.out.println("nhap acount:");
            String acount=scanner.nextLine();
            boolean validateEmail=Pattern.matches(regaxEmail,email);
            boolean validateAcount=Pattern.matches(regaxAcout,acount);
            if (validateEmail){
                System.out.println("email cua ban la " +email);
                if (validateAcount){
                    System.out.println("acount cua ban la :" +acount);
                    break;
                }else {
                    System.out.println("acount k dung dinh dang");
                }
                break;
            }else {
                System.out.println("email k dung dinh dang");
            }




        }while (true);
    }
}
