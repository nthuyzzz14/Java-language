package quanlySV;

public class SinhVien {
    private String maSV;
    private String hoTen;
    private double diemTB;

    //contructor
    public SinhVien(){

    }

    public SinhVien(String maSV,String hoTen,double diemTB){
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }

    //getter
    public void getName(){
        System.out.println("Ten sinh vien: "+hoTen);
    }

    public void getMaSV(){
        System.out.println("Ma sinh vien: "+maSV);
    }

    public double getDiem(){
        System.out.println("Diem trung binh: "+diemTB);
        return diemTB;
    }
    //setter
    public void setMaSV(String maSV){
        this.maSV = maSV;
    }

    public void setHoTen(String hoTen){
        if(hoTen.matches("[a-zA-Z\\s]+")){
            this.hoTen = hoTen;
        } else {
            System.out.println("Ho ten khong hop le !");
        }
    }

    public void setDiemTB(double diemTB){
        if(diemTB >= 0 && diemTB <= 10){
            this.diemTB = diemTB;
        } else {
            System.out.println("Diem khogn hop le !");
        }
    }

    @Override 
    public String toString(){
        return "\n| Ma sinh vien: "+maSV+
                "\n| Ten sinh vien: "+hoTen+
                "\n| Diem trung binh: "+diemTB;
    }
}
