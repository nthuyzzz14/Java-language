package hethongquanlythuvien;

public class Sach extends TaiLieu{
  private String tacGia;
  private String theLoai;

  public Sach(String iD, String tieuDe, int namXB, boolean trangThai, String tacGia, String theLoai){
    super(iD,tieuDe,namXB,trangThai);
    this.tacGia = tacGia;
    this.theLoai = theLoai;
  }

  public String gettacGia(){return tacGia;}
  public String gettheLoai(){ return theLoai;}

  public void settacGia(String tacGia){ this.tacGia = tacGia;}
  public void settheLoau(String theLoai){ this.theLoai = theLoai;}

  @Override
  public String toString(){
    return super.getThongTin() + String.format(" | Tac gia: %s | The loai: %s", tacGia, theLoai);
  }
   
  @Override
  public int setHanMuon(){
    return 30;
  }

}
