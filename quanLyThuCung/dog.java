package quanLyThuCung;

public class dog extends pet{

    public dog(String ten){
        super(ten);
    }

    @Override 
    public void keu(){
        System.out.println(ten +": Gau gau !");
    }
}
