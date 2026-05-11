package baptaplinhtinh;


public class truyendiachi {

    public static int Sum(int a, int b){
        return a + b;
    }
    public static void main (String[] args){
        int a = 5, b = 7;

        int kq = Sum(a,b);
        System.out.println("Tong a va b = "+ kq);
    }
}
