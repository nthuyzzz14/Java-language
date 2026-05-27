package hethongquanlyBenhVien;

public class BacSi extends NhanVienYTe implements CoTheKham, CoTheTiepNhan{
  protected String bangCap;
  protected int soPhongKham;
  protected BenhNhan BenhNhanHienTai;
  protected String ketquaGanNhat; 

  public BacSi(String hoTen, String iD, String chuyenKhoa, double luong, String bangCap, int soPhongKham){
    super(hoTen, iD, chuyenKhoa, luong);
    this.bangCap= bangCap;
    this.soPhongKham = soPhongKham;
  }

  @Override
  public void kham(BenhNhan bn){
    this.BenhNhanHienTai = bn;
    System.out.println(">> Bac si "+gethoTen()+" dang kham benh cho Benh Nhan: "+bn.gethoTen());
    System.out.println("    Trieu chung cu abenh nhan: "+bn.gettrieuChung());
  }

  @Override
  public String ketQua(){
    return ketquaGanNhat;
  }

  @Override
  public void lamViec(){
    System.out.printf("Bác sĩ "+gethoTen()+ "dang lam viec tai phong kham "+soPhongKham);
  }

  @Override
  public void tiepNhan(BenhNhan bn){
    System.out.println("Bac si "+gethoTen()+ " tiep nhan benh nhan: "+bn.gethoTen()+"[ "+bn.getmaBN()+"]");
  }

  @Override
  public void xuatVien(String maBN){
    System.out.println("Bac si "+gethoTen()+" ky giay co the cho benh nhan ma [ "+maBN+ " ] xuat vien !");
  }

  public String getbangCap(){ return bangCap;}
  public int getsoPhongKham(){ return soPhongKham;}

  @Override
  public String getThongTin(){
    return super.getThongTin() + String.format("| Bang cap: %s | So phong kham: %d", bangCap, soPhongKham);
  }
}
