package exerciseOOP;

import java.util.Scanner;
public class NhanVien extends Person{
    protected String chuyenMon;
    protected double tongLuong;

    @Override 
    public void nhapThongTin(Scanner nhapdata){
        super.nhapThongTin(nhapdata);
        nhapdata.nextLine();
        
        System.out.print("Nhap chuyen mon(Nganh): ");
         chuyenMon = nhapdata.nextLine();
        System.out.print("Nhap tong luong(Milion): ");
         tongLuong = nhapdata.nextDouble();
    }

    @Override
    public void hienThi(){
        super.hienThi();
        
        System.out.println("Chuyen mon: "+chuyenMon);
        System.out.println("Tong luong: "+tongLuong);
    }
}
