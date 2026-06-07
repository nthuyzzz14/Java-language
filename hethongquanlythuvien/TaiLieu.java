package hethongquanlythuvien;

public abstract class TaiLieu {
  protected String iD;
  protected String tieuDe;
  protected int namXB;
  protected boolean trangThai;

  public TaiLieu(String iD, String tieuDe, int namXB, boolean trangThai){
    this.iD = iD;
    this.tieuDe = tieuDe;
    this.namXB = namXB;
    this.trangThai = trangThai;
  }

  //getter and setter 
  public String getiD(){ return iD;}
  public String gettieuDe(){ return tieuDe;}
  public int getnamXB(){ return namXB;}
  public boolean gettrangThai(){ return trangThai;}

  public void setiD(String iD){this.iD = iD;}
  public void settieuDe(String tieuDe){ this.tieuDe = tieuDe;}
  public void setnamXB(int namXB){ this.namXB = namXB;}
  public void settrangThai(boolean trangThai){ this.trangThai = trangThai;}

  public String getThongTin(){
    return String.format("| ID: %s | Tieu de: %s | Nam xuat ban: %d | Trang thai: %b | Tac gia: %s | The loai: %s"  ,iD,tieuDe,namXB,trangThai);
  }
  public abstract int setHanMuon();

  public String toString(){
    return getThongTin();
  }
}
