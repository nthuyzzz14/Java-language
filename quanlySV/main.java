package quanlySV;

import java.util.Scanner;
public class main {

   public static SinhVien timSVdiemCao(SinhVien sv1,SinhVien sv2,SinhVien sv3){
        SinhVien max = sv1;

        //kiemtra diem cao nhat
        if(sv2.getDiem() > max.getDiem()){
            max = sv2;
        }
        if(sv3.getDiem() > max.getDiem()){
            max = sv3;
        }
        return max;
    }

    public static void main (String[] args){
        Scanner nhap = new Scanner(System.in);

        SinhVien sv1 = new SinhVien("01", "Ma Thanh Thuy", 8.4);
        SinhVien sv2 = new SinhVien("02", "Duong Ngoc Anh", 9.8);
        SinhVien sv3 = new SinhVien("03", "Dau Gie Quan Buoi", 2.5);

        //in ra 
        System.out.println("--------Danh Sach Sinh Vien--------");
        System.out.println(sv1);
        System.out.println(sv2);
        System.out.println(sv3);

        //tim sinh vien co diem cao nhat
        SinhVien max = timSVdiemCao(sv1,sv2,sv3);

        System.out.println("Sinh vien co diem trung binh cao nhat: "+ max);
    }
}
