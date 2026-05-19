package quanlyNhanVien;

public class nvSanXuat extends NhanVien{
    protected double hsSX;

    @Override
    public double tinhLuong(){
        return super.tinhLuong() * hsSX;
    }    

    public nvSanXuat(String hoTen, double luongCB,double hsSX){
        super(hoTen, luongCB);
        this.hsSX = hsSX;
    }

    //setter
    public void sethsSX(double hsSX){
        if (hsSX >= 0){
            this.hsSX = hsSX;
        } else {
            System.out.println("Hieu suat san xuat khong hop le !");
        }
    }
}
