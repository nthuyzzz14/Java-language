package lythuyet;

import java.util.InputMismatchException;
import java.util.Scanner;
public class try_catch {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Nhap so tuoi cua ban: ");
    try{ 
      int age = input.nextInt();
      System.out.println("Tuoi cua ban la: "+age);
      int loi = age / 0;
    } catch (InputMismatchException ime){
      System.out.println("Tuoi can duoc nhap la so not text !");
    } catch(ArithmeticException ae) {
      System.out.println("Khong co so nao duoc chia cho 0 !");
    } finally{
      System.out.println("Ma Thanh Thuy cute !");
    }
    System.out.println("Chuong trinh ket thuc !");

  }
}
