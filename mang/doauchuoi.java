package mang;

import java.util.Arrays;
public class doauchuoi {
    public static void main (String[] args){
        int [] mang = {9, 2, 5, 3, 7, 3, 8, 6, 1, 5, 0};

        Arrays.sort(mang);

        for(int i = 0; i < mang.length / 2; i++){
            int temp = mang[i];
            mang[i] = mang[mang.length - 1 - i];
            mang[mang.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(mang));
    }
}
