package oop;

public class Main_ {
    public static void main(String [] args){
        concho cho_co = new concho();
        cho_co.keu();
        cho_co.nhaptuoi(6);
        System.out.println("Tuoi = " + cho_co.hienthituoi());
        cho_co.ancom();
        cho_co.dingu();
        
        conmeo meo_tay = new conmeo();
        meo_tay.keu();
        meo_tay.nhaptuoi(7);
        System.out.println("Tuoi = "+meo_tay.hienthituoi());
        meo_tay.dingu();
        meo_tay.ancom();
    }
}
