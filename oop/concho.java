    package oop;

public class concho extends Animal{
    // thuoc tinh cua con cho
    public String ten_loaicho;
    public String mau_long;
    public int tuoi;

    public void nhaptuoi(int x){
        this.tuoi = x;
    }

    public int hienthituoi(){
        return this.tuoi;
    }

    public void keu(){
        System.out.println("Gau Gau");
    }
}
