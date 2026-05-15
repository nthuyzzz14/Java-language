package kiemtrakinang1;

import java.util.Scanner;
public class cau2 {
    public static void main (String[] args){
        Scanner nhap = new Scanner(System.in);
        product p1 = new product();

        p1.nhapTT(nhap);
        p1.hienThi();

        double apMa = p1.applyDiscount(10);
        System.out.println("San pham sau khi duoc giam: "+apMa);
    }
}
