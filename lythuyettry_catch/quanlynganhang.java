package lythuyettry_catch;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class quanlynganhang {
  public static void main(String[] args){
    Scanner nhapdata = new Scanner(System.in);
    int age = 0;
    double soTien = 0;

    System.out.print("Nhap ten khach hang: ");
    String name = nhapdata.nextLine();

    // nahp tuoi
    try{
      System.out.print("Nhap tuoi: ");
      age = nhapdata.nextInt();
    } catch (InputMismatchException ime){
      System.out.println("Loi: tuoi phai la so nguyen !");
      return ;
    }

    //nhap so tien gui
    try {
      System.out.print("Nhap so tien gui: ");
      soTien = nhapdata.nextDouble();
      if (soTien <= 0){
        System.out.println("So tien gui phai lon hon khong !");
        return;
      }
    } catch(InputMismatchException ime){
      System.out.println("Loi: so tien gui phai la so !");
      return;
    }

    // mo file va doc file
    try{
      File thumuc = new File("bank.txt");
      Scanner docthumuc = new Scanner(thumuc);

      //in ra noi dung trong file
      //thuc chat ra kiem tra trong file cac dong va in ra neu nhu truoc do no chua in
      System.out.println("Noi dung trong file: ");
      while (docthumuc.hasNextLine()){
        System.out.println(docthumuc.nextLine());
      }
      docthumuc.close();
    } catch (FileNotFoundException fnfe){
      System.out.println("LOI: Khong tim thay file bank.txt !");
    }

    // thong bao dang ky thanh cong
    System.out.println("==========THONG TIN DANG KY=========");
    System.out.println("Ten tai khoan: "+name);
    System.out.println("Tuoi: "+age);
    System.out.println("So tien gui: "+soTien);
    System.out.println("LOADING.......");

    System.out.println("Dang ky tai khoan thanh cong !");
    nhapdata.close();
  }
}
