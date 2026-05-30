package hethongquanlyBenhVien;

public class main {
  public static void main(String[] args){

    System.out.println("__________ HE THONG QUAN LY BENH VIEN ____________");

    // bao ten cua benh vien
    BenhVien bv = new BenhVien("\nBENH VIEN DA KHOA TAN LONG");

    // khai bao cac nhan vien y te : bac si va y ta
    BacSi bs1 = new BacSi("Ma Thanh Thuy", "T01", "Noi soi", 40000000, "Thac Si", 201);
    BacSi bs2 = new BacSi("Ngo Kien Huy", "H02", "Ngoai soi", 40000000, "Thac Si", 202);
    YTa y01 = new YTa("L01", "Le Luu Ly", "Phu san", "Tien si", 202, 15000000);
    YTa y02 = new YTa("A01", "Duong Ngoc Anh", "Tu Van", "Tien si", 201, 15000000);
    
    // add vao giup hien thi thong bao nhan vien duoc nhan vao cong ty
    System.out.println("\n======== DANH SACH NHAN VIEN MOI ========");
    bv.themNhanVien(bs1);
    bv.themNhanVien(bs2);
    bv.themNhanVien(y01);
    bv.themNhanVien(y02);

    BenhNhanNoiTru bn1 = new BenhNhanNoiTru("b01", "Nguyen Van Chien", "12", "Dau bung, di ngoai ra mau", 20, 301, 500000, "27");
    BenhNhanNoiTru bn2 = new BenhNhanNoiTru("b02", "Nguyen Van Vinh", "23", "Dau dau , buon non", 50, 304, 7000000, "13");
    BenhNhanNgoaiTru bn3 = new BenhNhanNgoaiTru("b03", "Duoong The Anh", "28", "Bung bia ,da bong hay", "10h20", "201", 600000);

    bv.tiepnhanBenhNhan(bn1, y02);
    bv.tiepnhanBenhNhan(bn3, bs1);
    bv.tiepnhanBenhNhan(bn2, bs2);

    bv.congViec();

    System.out.println("\n========= KET QUA KHAM BENH ===========");
    bs1.kham(bn3);
    System.out.println("Ket qua kham: "+ bs1.ketQua());

    bs2.kham(bn2);
    System.out.println("Ket qua kham: "+bs2.ketQua());

    bs1.kham(bn1);
    System.out.println("Ket qua kham: "+bs1.ketQua());

    System.out.println("\n-------------- HO TRO BAC SI -------------");
    y01.lamViec();
    y02.lamViec();

    //thong ke vien phi 
    bv.thongkeVienPhi();

    //xuat vien cho benh nhan
    System.out.println("---------------- XUAT VIEN ------------");
    bs1.xuatVien("bn3");

    //in cac danh sach 
    bv.indanhSachNV();
    bv.indanhSachBenhNhan();
    bv.thongkeVienPhi();


    System.out.println("------------ KET THUC CHUONG TRINH ------------");

  }
}  
