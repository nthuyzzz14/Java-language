package hethongquanlyBenhVien;

class NhanVienYTe {

  protected int iD;
  protected String hoTen;
  protected String chuyenKhoa;

  public NhanVienYTe(){

  }

  public NhanVienYTe(String hoTen,int iD, String chuyenKhoa){
    this.hoTen = hoTen;
    this.iD = iD;
    this.chuyenKhoa = chuyenKhoa;
  }

  public void hienTT(){
    System.out.println("Ten nhan vien: "+hoTen);
    System.out.println("ID: "+iD);
    System.out.println("Chuyen khoa: "+chuyenKhoa);
  }

  public String getName(){
    return this.hoTen;
  }

  public int getID(){
    return this.iD;
  }

  public String getCK(){
    return this.chuyenKhoa;
  }

  public String toString(){
    return "Ten nhan vien: "+hoTen+
           "ID: "+iD+
           "Chuyen khoa: "+chuyenKhoa;
  }

}