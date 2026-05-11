package vonglap;

import java.util.Scanner;
public class baitapSNT {

    public static boolean laSNT(int n){
        if (n <= 1){
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++){
            if( n % i == 0)
                return false;
        }
        return true;
    }
    public static void main (String[] args){
        Scanner nhap = new Scanner(System.in);

        System.out.print("Nhap mot so nguyen: ");
        int n = nhap.nextInt();

        if (laSNT(n) == true ){
            System.out.println("La so nguyen to !");
        } else {
            System.out.println("Khong la so nguyen to !");
        }
    }
}
