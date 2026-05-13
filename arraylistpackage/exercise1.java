package arraylistpackage;

import java.util.ArrayList;
import java.util.Scanner;
public class exercise1 {

    public static void xuat (ArrayList<Double> danhSach){

        for(double x : danhSach){
            System.out.print(danhSach);
        }
    }

    public static double tinhTong (ArrayList <Double> danhSach){
        double tong = 0;
        for (double x : danhSach){
            tong += x;
        }
        return tong;
    }

    public static void main (String[] args){
        double sum = 0;
        Scanner nhap = new Scanner(System.in);
        ArrayList <Double>  danhSach = new ArrayList<Double>();

        while (true){
            System.out.print("\nNhap x (mot so thuc) = ");
            double x = nhap.nextDouble();
            nhap.nextLine();
            

            danhSach.add(x);

            System.out.print("\nNhap them (Y/N)? : ");
            String chose = nhap.nextLine();
            System.out.println("\nBan vua nhap: "+chose);

            if(chose.equalsIgnoreCase("N")){
                break;
            }
        }

        System.out.println("\nDanh sach vua duoc nhap !");
        xuat(danhSach);
        System.out.println();
        
        System.out.println("\nTong cua danh sach vua duoc nhap !");
        sum = tinhTong(danhSach);
        System.out.println("Tong = "+sum);

        nhap.close();
    }
}
