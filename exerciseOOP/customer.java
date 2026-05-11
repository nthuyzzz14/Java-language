package exerciseOOP;

import java.util.Scanner;
import java.lang.Character;
public class customer {
    protected String name;
    protected String number;
    protected String address;

    Scanner nhapdata = new Scanner(System.in);

    public void nhapthongtin(){
        System.out.print("Nhap ten:");
         name = nhapdata.nextLine();
        System.out.print("Nhap so dien thoai:");
         number = nhapdata.nextLine();
        System.out.print("Nhap dia chi(Tinh):");
         address = nhapdata.nextLine();
    }
    public boolean kiemtraSDT(){
        return number.length() == 10 && number.matches("\\d+");
    }

    public void xuat(){
        System.out.println("Ho ten:"+name+ "\nSo dien thoai:"+number+"\nDia chi:"+address);
    }
}
