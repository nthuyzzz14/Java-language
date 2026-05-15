package Stringexercise;

import java.util.Scanner;
public class practisestring {
    public static void main(String[] args ){
        Scanner nhap = new Scanner(System.in);

        System.out.print("Nhap username: ");
        String un = nhap.nextLine();

        System.out.print("Nhap password: ");
        String pw = nhap.nextLine();

        if (un.equals("mathanhthuy") && pw.length() >= 6){
            System.out.println("The code is running !");
        }
        nhap.close();
    }
}
