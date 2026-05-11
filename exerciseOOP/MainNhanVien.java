package exerciseOOP;

import java.util.Scanner;
public class MainNhanVien {
    public static void main (String[] args){
        Scanner nhapdata = new Scanner(System.in);
        NhanVien nv1 = new NhanVien();

        nv1.nhapThongTin(nhapdata);

        System.out.println("_______Thong tin nhan vien_______");

        nv1.hienThi();
    }
}
