package lythuyettry_catch;

import java.util.Scanner;
import java.util.InputMismatchException;
public class docthongtinsinhvien {
  public static void main(String[] args){
    Scanner nhap = new Scanner(System.in);

    int age = 0;
    double mark = 0;;
    String name ="";

    System.out.print("Nhap ten: ");
    try {
      name = nhap.nextLine();
      System.out.print("Nhap tuoi: ");
    } catch (InputMismatchException ime){
      System.out.println("Ten yeu cau nhap chu !");
    }

    try {
      age = nhap.nextInt();
    } catch(InputMismatchException ime){
      System.out.println("Yeu cau nhap tuoi phai bang so !");
    }

    System.out.print("Nhap diem trung binh: ");
    try{
      mark = nhap.nextDouble();
      int tuoi = 100 / age; 
    } catch (InputMismatchException ime){
      System.out.println("Diem trung binh phai nhap bang so thap phan !");
    } catch(ArithmeticException ae){
      System.out.println("Tuoi duoc nhap khong the bang 0 hoac nho hon 0");
    }
    System.out.println("Ten: "+name);
    System.out.println("Tuoi: "+age);
    System.out.println("Diem trung binh: "+mark);
  }
}
