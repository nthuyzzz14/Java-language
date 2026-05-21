package quanLyThuCung;

public class cat extends pet{

    public cat(String ten){
        super(ten);
    }

    @Override
    public void keu(){
        System.out.println(ten + ": Mew mew !");
    }
}
