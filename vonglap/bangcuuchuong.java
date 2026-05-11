package vonglap;

import java.util.Scanner;
public class bangcuuchuong {
    public static void main (String[] args ){
        Scanner nhap = new Scanner(System.in);

        System.out.print("Nhap mot so (from 1 - 10): ");
        int n = nhap.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.printf("\nBang cuu chuong %d", i);
            for (int j = 1; j <= 10; j++){
                int x = i * j;
                System.out.printf("\n %d x %d = %d", i, j, x);
            }
            System.out.println("\n--------------");
        }
    }
}
