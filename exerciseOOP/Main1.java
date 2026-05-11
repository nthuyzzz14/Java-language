package exerciseOOP;

import java.util.Scanner;
public class Main1 {
    public static void main (String[] args){
        customerVIP vip = new customerVIP();

        vip.nhapthongtin();
        vip.xuat();

        try {
            if (!vip.kiemtraSDT()){
                throw new Exception("Lỗi: sdt không đúng định dạng (10 số hoặc +84 + 9 số !)");
            }
            System.out.println("____Thông tin khách hàng VIP____");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
