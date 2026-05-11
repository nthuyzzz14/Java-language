package baptaplinhtinh;

import java.util.Scanner;

public class phuongtrinhmotan {
    public static void main (String[] args){
        Scanner nhapdata = new Scanner(System.in);

        float x;
        System.out.println("Cho phuong trinh ax + b = 0");
        System.out.println("Hay nhap gia tri cho a va b");
        System.out.print("Nhap a: ");
        int a = nhapdata.nextInt();
        System.out.print("Nhap b: ");
        int b = nhapdata.nextInt();

        if(a == 0 && b == 0){
            System.out.println("Phuong trinh co vo so nghiem !");
        } else if (a == 0 && b != 0) {
            System.out.println("Phuong trinh vo nghiem !");
        }

        x = (float) - b / a;

        System.out.printf("Phuong trinh %dx + %d = %.3f", a, b, x);
    }
}
