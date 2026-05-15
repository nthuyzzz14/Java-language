package kiemtrakinang1;


import java.util.Scanner;
public class product {
    String name;
    int price;
    double percent;

    public product (){

    }

    public product (String name, int price){
        this.name = name;
        this.price = price;
    }

    public void nhapTT(Scanner nhap){
        System.out.print("Nhap ten san pham: ");
         name = nhap.nextLine();
        
        System.out.print("Nhap gia san pham: ");
         price = nhap.nextInt();
    }

    public void hienThi(){
        System.out.println("San pham la: "+name);
        System.out.println("Gia hien tai: "+price);
    }

    public void displayGG(){
        System.out.println("San pham sau khi giam gia: ");
    }

    public double applyDiscount(int x){
        return price = price - (price * x/100);
    }
}
