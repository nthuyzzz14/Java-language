package quanlyNhanVien;

import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner nhap = new Scanner(System.in);
        
        System.out.println("==== NHAN VIEN VAN PHONG ====");
        System.out.print("Nhap ten nhan vien: ");
         String tenVP = nhap.nextLine();
        System.out.print("Nhap luong co ban: ");
         double luongVP = nhap.nextDouble();
        System.out.print("Nhap phu cap: ");
         double pc = nhap.nextDouble();

         nhap.nextLine();

        NhanVien nv1 = new nvVanPhong(tenVP,luongVP,pc);

        System.out.println("==== NHAN VIEN SAN XUAT ====");
        System.out.print("Nhap ten nhan vien: ");
         String tenSX = nhap.nextLine();
        System.out.print("Nhap luong co ban: ");
         double luongSX = nhap.nextDouble();
        System.out.print("Nhap he so san xuat: ");
         double hssx = nhap.nextDouble();

         NhanVien nv2 = new nvSanXuat(tenSX,luongSX,hssx);


        System.out.println("==== BANG LUONG ====");
        System.out.println();
        nv1.hienTT();
        System.out.println();
        nv2.hienTT();

        nhap.close();
    }
}
