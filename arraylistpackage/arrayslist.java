package arraylistpackage;


import java.util.ArrayList;
public class arrayslist {
    public static void main (String[] args){
        ArrayList <Integer> ten = new ArrayList<Integer>();
        // them phan tu
        ten.add(7);
        ten.add(8);
        ten.add(9);

        //danh sach mang
        System.out.println("ArrayList = "+ten);

        //lay phan tu
        System.out.println("Lay phan tu: "+ten.get(2));

        // sua phan tu
        System.out.println("Sua phan tu: "+ten.set(1,2));

        // xoa phan tu
        System.out.println("Xoa phan tu: "+ten.remove(2));

        // so luong phan tu
        System.out.println("So luong phan tu: " +ten.size());
    }
}
