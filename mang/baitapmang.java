package mang;

import java.util.Scanner;
import java.util.Arrays;

public class baitapmang {

    public static void giamdan(int [] arr){
        for (int i = 0; i < arr.length / 2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
    public static void main(String[] args){
        Scanner nhapdata = new Scanner(System.in);

        System.out.print("Nhap so luong mang: ");
        int n = nhapdata.nextInt();

        int [] arr = new int [n];


        for(int i = 0; i < arr.length; i++){
            System.out.printf("\narr[%d] = ", i);
            arr[i] = nhapdata.nextInt();
        }

        
        System.out.println("Mang vua nhap: ");
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        
        Arrays.sort(arr);
        System.out.print("Mang tang dan = ");
        System.out.println(Arrays.toString(arr));

        giamdan(arr);

        System.out.print("Mang giam dan = ");
        System.out.println(Arrays.toString(arr));
    }
}
