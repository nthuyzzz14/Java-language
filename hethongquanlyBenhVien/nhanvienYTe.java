package hethongquanlyBenhVien;

public abstract class NhanVienYTe {

  protected String iD;
  protected String hoTen;
  protected String chuyenKhoa;
  protected double luong;

  //contrusctoe
  public NhanVienYTe(String hoTen, String iD, String chuyenKhoa, double luong){
    this.hoTen = hoTen;
    this.iD = iD;
    this.chuyenKhoa = chuyenKhoa;
    this.luong = luong;
  }

  public String getThongTin(){
    return String.format("[%s] %s | Chuyen khoa: %s | Luong: %.2f VND", iD,hoTen,chuyenKhoa,luong);
  }

  //tao 1 cu phap truu tuong de mo ta cong viec cua tung nguoi
  public abstract void lamViec();

  //getter and setter
  public String gethoTen(){ return hoTen;}
  public String getiD(){ return iD;}
  public String getchuyenKhoa(){ return chuyenKhoa;}
  public double getLuong(){ return luong;}

  public String sethoTen(String hoTen){ return this.hoTen = hoTen;}
  public String setiD(String iD){ return this.iD = iD;}
  public String setchuyenKhoa(String chuyenKhoa){ return this.chuyenKhoa = chuyenKhoa;}

  //
  public String toString(){
    return getThongTin();
  }
}   