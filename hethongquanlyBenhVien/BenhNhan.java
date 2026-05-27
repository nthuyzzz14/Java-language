package hethongquanlyBenhVien;

public abstract class BenhNhan {
  protected String maBN;
  protected String hoTen;
  protected String ngaySinh;
  protected String trieuChung;

  public BenhNhan(String maBN, String hoTen, String ngaySinh, String trieuChung){
    this.maBN = maBN;
    this.hoTen = hoTen;
    this.ngaySinh = ngaySinh;
    this.trieuChung = trieuChung;
  }
  // bat buo cphai abstract phuong thuc nay vi benh nhan noi tru va ngoai tru co tinh vien phi khac nhau
  public abstract double tinhVienPhi();

  // dung format de in format type cua thong tin 
  public String getThongTin(){
    return String.format("[%s] %s | Ngay sinh: %s | Trieu chung: %s", maBN, hoTen, ngaySinh, trieuChung);
  }

  //getter and setter
  public String getmaBN(){ return maBN;}
  public String gethoTen(){ return hoTen;}
  public String getngaySinh(){ return ngaySinh;}
  public String gettrieuChung(){ return trieuChung;}

  public void sethoTen(String hoTen){ this.hoTen = hoTen;}
  public void settrieuChung(String trieuChung){ this.trieuChung = trieuChung;}

  // chuyen ma hash va in ra cua benh nhan
  public String toString(){
    return getThongTin()  + String.format("| Viện phí: %.2f", tinhVienPhi());
  }
}
