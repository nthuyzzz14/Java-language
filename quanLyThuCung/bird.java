package quanLyThuCung;

public class bird extends pet{

    public bird(String ten){
        super(ten);                                                             
    }

    @Override
    public void keu(){
        System.out.println(ten + ": Chip chip !");
    }
}                           