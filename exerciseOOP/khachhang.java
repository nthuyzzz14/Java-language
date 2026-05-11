package exerciseOOP;

import java.lang.Character;
import java.util.Scanner;
public class khachhang {
    protected String name;
    protected String number;
    protected String address;
    Scanner nhapdata = new Scanner(System.in);

    public void nhap(){
        System.out.print("Nhap ho ten: ");
        name = nhapdata.nextLine();

        System.out.print("Nhap so dien thoai: ");
        number = nhapdata.nextLine();

        System.out.print("Nhap dia chi(Tinh): ");
        address = nhapdata.nextLine();
    }

    public void xuat(){
        System.out.printf("Ho ten: "+name+ "\nSo dien thoai: "+number+"\nDia chi: "+address);
    }

    public boolean kiemtraSDT(){
         return number.length() == 10 && number.matches("\\d+");
    }
}
