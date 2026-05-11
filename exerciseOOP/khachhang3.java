package exerciseOOP;

import java.util.Scanner;
public class khachhang3 {
    public String hoTen;
    public String sDT;
    public String diaChi;
    Scanner nhapdata = new Scanner(System.in);

    public void nhap(){
        System.out.print("Nhap ho ten: ");
        hoTen = nhapdata.nextLine();

        System.out.print("Nhap so dien thoai: ");
        sDT = nhapdata.nextLine();

        System.out.print("Nhap dia chi(Tinh): ");
        diaChi = nhapdata.nextLine();
    }

    public void xuat(){
        System.out.println(" ");
        System.out.println("Ho ten: "+hoTen+ "\nSDT: "+sDT+ "\nDia chi: "+diaChi);
    }

    public boolean kiemtraNums(){
        return sDT.length() == 10 && sDT.matches("\\d+");
    }
}
