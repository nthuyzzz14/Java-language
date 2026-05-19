package quanlyNhanVien;

public class nvVanPhong extends NhanVien{
    protected double phuCap;
    @Override
    public double tinhLuong(){
        return super.tinhLuong() + phuCap;
    }

    public nvVanPhong(String hoTen, double luongCB, double phuCap){
        super(hoTen, luongCB);
        this.phuCap = phuCap;
    }

    //setter
    public void setphucapVP(double phuCap){
        if(phuCap >= 0){
            this.phuCap = phuCap;
        } else {
            System.out.println("Phu cap khong hop le !");
        }
    }
}
