package Stringexercise;

import java.util.ArrayList;
public class bai2String {
    public static void main(String[] args ){
        student s1 = new student("Ma thanhthuy", "14");
        student s2 = new student("huu thanh", "5");
        student s3 = new student("hung tuan", "11");
        student s4 = new student("dinh manh", "7");
        student s5 = new student("tran thinh", "12");

        ArrayList<student> list = new ArrayList<student>();
        
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        System.out.println(list);
    }
}
