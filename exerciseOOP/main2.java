package exerciseOOP;

public class main2 {
    public static void main(String[] args){
        khachhangvip vip = new khachhangvip();

        vip.nhap();
        System.out.println("------Thong tin khach hang------");
        vip.xuat();

        try {
            if (!vip.kiemtraSDT()){
                throw new Exception ("Loi so dien thoai phai bat dau tu +84 hoac du 10 so");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
