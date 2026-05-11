package baptaplinhtinh;

public class rectangle {
    double length, width;

    rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    double getArea(){
        return length * width;
    }

    public static void main (String[] args){
        rectangle r1 = new rectangle(3,4);
        System.out.printf("Dien tich: " +r1.getArea());
    }
}
