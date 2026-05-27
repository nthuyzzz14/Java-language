package hethongquanlyBenhVien;

public class BenhNhanNgoaiTru extends BenhNhan{
  protected String gioHen;
  protected String phongKham;
  protected double tienThuoc;
 
  protected static final double phi_kham = 150_000;

  public BenhNhanNgoaiTru(String maBN, String hoTen, String ngaySinh, String trieuChung, String gioHen, String phongKham, double tienThuoc){
    super(maBN, hoTen, ngaySinh, trieuChung);
    this.gioHen= gioHen;
    this.phongKham = phongKham;
    this.tienThuoc = tienThuoc;
  }

  @Override 
  public double tinhVienPhi(){
    return phi_kham + tienThuoc;
  }

  public void lichHen(String gioMoi){
    this.gioHen = gioMoi;
    System.out.println("Lich hen cua benh nhan: "+gethoTen()+ "gio cu la: "+this.gioHen+"sang gio moi: "+gioMoi);
  }

  public String getgioHen(){ return gioHen;}
  public String getphongKham(){ return phongKham;}
  public double gettienThuoc(){ return tienThuoc;}

  @Override
  public String toString(){
    return super.getThongTin()+ String.format("| Gio kham: %s | Phong kham: %s ", gioHen,phongKham); 
  }
}
