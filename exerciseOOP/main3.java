package exerciseOOP;

public class main3 {
    public static void main(String[] args){
        khachhangVIP3 VIP = new khachhangVIP3();

        VIP.nhap();
        System.out.println(" ");
        System.out.println("-----KHACH HANG VIP-----");
        VIP.xuat();

        try{
            if(!VIP.kiemtraNums()){
                throw new Exception ("\nLoi: SDT khong thuoc VietNam hoac khong du 10 so !(YEU CAU NHAP LAI)");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
