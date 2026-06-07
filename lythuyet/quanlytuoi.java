package lythuyet;

import java.util.InputMismatchException;
import java.util.Scanner;
public class quanlytuoi {
  public static void main(String[] args ){
    Scanner nhap = new Scanner(System.in);

    int age = 0;
    System.out.print("Yeu cau nhap tuoi: ");
   try{
    age = nhap.nextInt();
    int tinhtuoi = 100 / age;
   } catch(InputMismatchException ime){
    System.out.println("Tuoi duoc nhap phai la bang so !");
   } catch(ArithmeticException ae){
    System.out.println("Tuoi khong the bang 0");
   }
   System.out.println("Tuoi cua khach hang la: "+age);
   System.out.println("Chuong trinh ket thuc !");
   nhap.close();
  }
}
