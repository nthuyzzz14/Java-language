package quanlyNhanVien;


import java.util.Scanner;
public class NhanVien {
    protected String hoTen;
    protected double luongCB;

    NhanVien(){

    }

    public NhanVien(String hoTen, double luongCB){
        this.hoTen = hoTen;
        this.luongCB = luongCB;
    }


    void nhapTT(Scanner nhap){
        System.out.print("Nhap ho ten: ");
         hoTen = nhap.nextLine();

        System.out.print("Nhap luong co ban: ");
         luongCB = nhap.nextDouble();
    }

    void hienTT(){
        System.out.println("Ten nhan vien: "+ hoTen);

        System.out.println("Luong: "+tinhLuong());
    }

    public void getName(String hoTen){
        System.out.println("Ten nhan vien: "+ hoTen);
    }

    public double getSarary(double luongCB){
        System.out.println("Luong: "+luongCB);
        return luongCB;
    }

    public void setName(String hoTen){
        if(hoTen.matches("[a-zA-Z//s]+")){
            this.hoTen = hoTen;
        } else {
            System.out.println("Ten khong hop le, yeu cau nhap lai !");
        }
    }

    public void setSarary(double luongCB){
        if(luongCB > 0){
            this.luongCB = luongCB;
        } else {
            System.out.println("Luong co ban khong hop le !");
        }
    }

    public double tinhLuong(){
        return luongCB;
    }

    public String toString(){
        return "|Ten nhan vien "+hoTen+
                "|Luong: "+luongCB;
    }
}