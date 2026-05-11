package mang;

import java.util.Scanner;
import java.util.Arrays;
public class findMinAndMax {

    public static void nhapmang(int [] arr, Scanner nhapdata){
        System.out.println("Nhap gia tri cho tung phan tu");
        for (int i = 0; i < arr.length; i++){
            System.out.printf("\narr[%d] = ", i);
            arr[i] = nhapdata.nextInt();
    }
}

    public static void main (String[] args){
        Scanner nhapdata = new Scanner(System.in);

        System.out.print("NHap so luong phan tu: ");
        int n = nhapdata.nextInt();

        int [] arr = new int [n];

        nhapmang(arr, nhapdata);
        System.out.println("Mang ban dau = "+ Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.print("Mang sau khi sap xep = ");
        System.out.println(Arrays.toString(arr));

        System.out.printf("Gia tri lon nhat = "+ arr[arr.length - 1]);

        System.out.printf("\nGia tri nho nhat = "+arr[0]);
    }
}
