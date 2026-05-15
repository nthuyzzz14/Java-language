package kiemtrakinang1;

import java.util.Scanner;
public class cau1 {
    public static void main(String[] args){
        Scanner nhap = new Scanner(System.in);

        System.out.print("Nhap vao mot so N: ");
        int n = nhap.nextInt();

        if(n == n){
            System.out.println("N la so doi xung !");
        }
        else {
            System.out.println("N khong la so doi xung !");
        }
        nhap.close();
    }
}
