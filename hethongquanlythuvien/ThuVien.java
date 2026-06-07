package hethongquanlythuvien;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class ThuVien {
  protected String tenTV;
  public ArrayList<TaiLieu> danhSachDoc = new ArrayList <TaiLieu>();
  public Map<TaiLieu, LocalDate> lichSuMuon = new HashMap<>();  

  public ThuVien(String tenTV){
    this.tenTV = tenTV;
    this.danhSachDoc = new ArrayList<>();
  }

  public void muontaiLieu(String iD){

  }

  public void trataiLieu(String iD){
    
  }
}