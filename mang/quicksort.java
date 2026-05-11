package mang;

// Sap xep mang tang dan
import java.util.Arrays;
public class quicksort {
    public static void main (String[] args){
        int [] arr = { 4, 3, 7, 4, 8, 1};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}