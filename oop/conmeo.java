package oop;

public class conmeo extends Animal{

    public int tuoi;
    public void nhaptuoi(int i){
        this.tuoi = i;
    }

    public int hienthituoi(){
        return this.tuoi;
    }

    public void keu(){
        System.out.println("Meo Meo");
    }
}
