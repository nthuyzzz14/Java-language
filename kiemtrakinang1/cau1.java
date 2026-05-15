package kiemtrakinang1;

import java.util.Scanner;
public class cau1 {
    public static void main(String[] args){
        Scanner nhap = new Scanner(System.in);

        System.out.print("Nhap vao mot so N: ");
        int n = nhap.nextInt();

        int temp = n;
        int reverse = 0;

        while (temp != 0){
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp / 10;
        }

        if (reverse == n){
            System.out.println(n + " La so doi xung");
        }
        else {
            System.out.println(n +" Khong la so doi xung");
        }
        nhap.close();
    }
}
