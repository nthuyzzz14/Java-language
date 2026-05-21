package quanLyThuCung;

import java.util.ArrayList;
import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner nhap = new Scanner(System.in);
        ArrayList <pet> danhSach = new ArrayList<pet>();
        //bien luu so luog
        int soMeo = 0;
        int soCho = 0;
        int soChim = 0;

        // them vao Arraylist
        danhSach.add(new cat("Nekko"));
        danhSach.add(new dog("Milu"));
        danhSach.add(new bird("Parking"));

        pet p1 = new cat("Nekko");
        pet p2 = new dog("Milu");
        pet p3 = new bird("Pảking");

        System.out.println("===== DANH SACH THU CUNG =====");
        //dung for-each de duyet va thuc hien cac method

        for(pet animal : danhSach){

            //hien thi ten truoc
            animal.thongTin();

            // ten va tieng keu
            animal.keu();

            //tach cac dong
            if(animal instanceof cat){
                soMeo++;
            } 
            else if(animal instanceof dog){
                soCho++;
            }
            else if(animal instanceof bird){
                soChim++;
            }
        }
        System.out.println("===== SO LUONG THU CUNG =====");
        System.out.println("So luong meo: "+soMeo);
        System.out.println("So luong cho: "+soCho);
        System.out.println("So luong chim: "+soChim);
    }
}
         