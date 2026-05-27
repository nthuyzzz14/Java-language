package hethongquanlyBenhVien;

public class BenhNhanNoiTru extends BenhNhan{
  protected int soNgayNam;
  protected int soGiuong;
  protected double tienThuoc;
  protected String ngayNhapVien;

  protected static final double phi_giuong_moi_ngay = 200_000;

  public BenhNhanNoiTru (String maBN, String hoTen, String ngaySinh, String trieuChung,int soNgayNam,int soGiuong,double tienThuoc,String ngayNhanVien){
    super(maBN, hoTen, ngaySinh, trieuChung);
    this.soNgayNam = soNgayNam;
    this.soGiuong = soGiuong;
    this.tienThuoc = tienThuoc;
    this.ngayNhapVien = ngayNhapVien;
  }

  @Override
  public double tinhVienPhi(){
    return (soNgayNam * soGiuong) + tienThuoc;
  }

  //getter
  public int getsoNgayNam(){ return soNgayNam;}
  public int getsoGiuong(){ return soGiuong;}
  public double tienThuoc(){ return tienThuoc;}
  public String ngayNhapVien(){ return ngayNhapVien;}

  @Override 
  public String toString(){
    return super.getThongTin() + String.format("| Giuong: %d | Nhap vien: %d | So ngay: %d", soGiuong, ngayNhapVien, soNgayNam);
  }
}
