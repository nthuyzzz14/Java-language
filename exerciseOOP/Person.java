package exerciseOOP;

import java.util.Scanner;
public class Person {
    private String hoTen;
    private String diaChi;
    private int namSinh;

    // constructor nhap du iieu
   public Person(){

   }

   // constructor co du lieu san
   public Person(String hoTen, String diaChi, int namSinh){
    this.hoTen = hoTen;
    this.diaChi = diaChi;
    this.namSinh = namSinh;
   }

   void nhapThongTin(Scanner nhapdata){
    System.out.print("Nhap ho va ten: ");
     hoTen = nhapdata.nextLine();
    System.out.print("Nhap dia chi(Tinh): ");
     diaChi = nhapdata.nextLine();
    System.out.print("Nhap nam sinh: ");
     namSinh = nhapdata.nextInt();
   }

   void hienThi(){
    System.out.println("\nHo va ten: "+hoTen);
    System.out.println("Dia chi: "+diaChi);
    System.out.println("Nam sinh: "+namSinh);
   }
}
