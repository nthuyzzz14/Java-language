package hethongquanlyBenhVien;

public class YTa extends NhanVienYTe implements CoTheTiepNhan{
  protected String capBac;
  protected int phongBan;

  public YTa(String iD, String hoTen, String chuyenKhoa,String capBac, int phongBan, double luong){
    super(iD, hoTen, chuyenKhoa, luong);
    this.capBac = capBac;
    this.phongBan = phongBan;
  }

  public void hoTro(){
    System.out.println("Dang ho tro bac si !");
  }

  @Override
  public void tiepNhan(BenhNhan bn){
    System.out.println("Y ta "+gethoTen()+ " tiep nhan benh nhan: "+bn.gethoTen()+"[ "+bn.getmaBN()+" ]");
  }

  @Override
  public void xuatVien(String maBN){
    System.out.println("Y ta "+gethoTen()+" ky giay co the cho benh nhan ma [ "+maBN+" ] xuat vien !");
  }

  public void lamViec(){
    System.out.println("Y ta "+gethoTen()+" dang phuc vu benh nhan tai phong ban "+phongBan);
  }

  public String getcapBac(){ return capBac;}
  public int phongBan(){ return phongBan;}

  @Override
  public String getThongTin(){
    return super.getThongTin() + String.format("| Cap bac: %s | Phong ban: %d", capBac, phongBan);
  }
}
