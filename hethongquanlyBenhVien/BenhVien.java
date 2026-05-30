package hethongquanlyBenhVien;

import java.util.ArrayList;
public class BenhVien {
  protected String ten;
  protected ArrayList <NhanVienYTe> danhSachNV = new ArrayList <NhanVienYTe>();
  protected ArrayList <BenhNhan> danhSachBN = new ArrayList <BenhNhan>();
  
  public BenhVien(String ten){
    this.ten = ten;
    this.danhSachBN = new ArrayList<>();
    this.danhSachNV = new ArrayList<>();
  }
  // QUAN LY NHAN VIEN
  public void themNhanVien(NhanVienYTe nv){
    danhSachNV.add(nv);
    System.out.println("Da them nhan vien: "+nv.gethoTen()+" ("+nv.getClass().getSimpleName()+")");
  }

 //QUAN LY BENH NHAN
  public void tiepnhanBenhNhan(BenhNhan bn, CoTheTiepNhan nguoicothetiepnhan){
    danhSachBN.add(bn);
    nguoicothetiepnhan.tiepNhan(bn);
  }

  public BenhNhan timBN(String maBN){
    for(BenhNhan bn : danhSachBN){
      if (bn.getmaBN().equals(maBN))
        return bn;
    }
    return null;
  }

  public void xuatVienBenhNhan(String maBN, CoTheTiepNhan nguoicothexuatvien){
    BenhNhan ma = timBN(maBN);
    if(ma != null){
      nguoicothexuatvien.xuatVien(maBN);
      danhSachBN.remove(ma);
      System.out.println("Benh nhan: "+ma.gethoTen()+" da xuat vien !");
    }
    else {
      System.out.printf("Khong tim thay benh nhan co ma [%s] phu hop !", maBN);
    }
  }

  //in bao coa danh sach 
  public void indanhSachNV(){
    System.out.println("\n======== DANH SACH NHAN IEN Y TE ========"+ten);

    int soBS = 0;
    int soYT = 0;
    for(NhanVienYTe nv : danhSachNV){
      if(nv instanceof BacSi){
        soBS++;
      } else if (nv instanceof YTa){
        soYT++;
      }
    }
    System.out.println("\n---------------------------------");
    System.out.printf("| Tong so nhan vien: %d",danhSachNV.size());
    System.out.printf("\n| So ba si hien co: %d", soBS);
    System.out.printf("\n| So y ta hien co: %d", soYT);
  }

  public void indanhSachBenhNhan(){
    System.out.println("\n======== DANH SACH BENH NHAN DANG DIEU TRI =======");

    if (danhSachBN.isEmpty()){
      System.out.println("Hien khong co benh nhan nao dang dieu tri");
      return;
    }
    int bnnoiTru = 0;
    int bnngoaiTru = 0;
    for (BenhNhan bn : danhSachBN){
      String loaiBenhNhan = (bn instanceof BenhNhanNoiTru) ? "[Noi Tru]" : "[Ngoai Tru]";
      System.out.println("| "+loaiBenhNhan+"| "+bn);
      if (bn instanceof BenhNhanNoiTru){
        bnnoiTru++;} 
        else{
        bnngoaiTru++;}
    }
    System.out.println("\n==========================================");
    System.out.printf("| Tong so benh nhan: %d", danhSachBN.size());
    System.out.printf("\n| Benh nhan noi tru: %d", bnnoiTru);
    System.out.printf("\n| Benh nhan ngoai tru: %d", bnngoaiTru);
  }
  // thong ke vien phi
  public void thongkeVienPhi(){
    System.out.println("\n========== THONG KE VIEN PHI ==========");
    
    double tong = 0;
    for (BenhNhan bn : danhSachBN){
      System.out.println("%-25s -> %,12.0f VND%n");
      tong += bn.tinhVienPhi();
    }
    System.out.println("\n=======================================");
    System.out.printf("| Tong doanh thu vien phi: %,15.0f VNĐ%n", tong);
  }

  // thuc hien da hinh cho obj
  public void congViec(){
    System.out.println("\n========== BAT DAU CA LAM VIEC ==========");
    for (NhanVienYTe nv : danhSachNV){
      nv.lamViec();
    }
  }

  // ten cua benh vien
  public String getTen(){
    return ten;
  }

}
