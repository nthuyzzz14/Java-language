package hethongquanlythuvien;

public class TapChi extends TaiLieu{
  protected int soPhatHanh;

  public TapChi(String iD, String tieuDe, int namXB, boolean trangThai, int soPhatHanh){
    super(iD,tieuDe,namXB,trangThai);
    this.soPhatHanh = soPhatHanh;
  }

  // getter and setter
  public int getsoPhatHanh(){ return soPhatHanh;}
  public void setsoPhatHanh(int soPhatHanh){ this.soPhatHanh = soPhatHanh;}

  @Override
  public String toString(){
    return super.getThongTin() + String.format(" | So phat hanh: %d");
  };

  @Override
  public int setHanMuon(){
    return 7;
  }


}
