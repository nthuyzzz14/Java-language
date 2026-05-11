package mang;
//Sap xep mang giam dan
import java.util.Collections;
import java.util.Arrays;
public class quicksort2 {
    public static void main (String[] args){
        //khai bao mang
        Integer [] mang = { 4, 8, 9, 3, 6, 3, 8, 7, 0 };

        //sap xep gima dan
        Arrays.sort(mang, Collections.reverseOrder());
        //in ra mang sua khi xu ly
        System.out.println(Arrays.toString(mang));
    }
}