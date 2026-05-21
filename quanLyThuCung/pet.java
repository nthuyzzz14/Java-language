package quanLyThuCung;

public class pet {
    protected String ten;

    public pet(String ten){
        this.ten = ten;
    }

    public void keu(){
        System.out.println("Tieng keu !");
    }

    public void thongTin(){
        System.out.println("Ten: "+ten);
    }
}
