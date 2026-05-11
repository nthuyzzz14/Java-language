package baptaplinhtinh;

public class MAINstudent {
    public static void main(String[] args){
        student sv1 = new student(19,"Ma Thanh Thuy");

        System.out.println("Ten sv: "+sv1.layTen());
        System.out.println("Tuoi sv: "+sv1.layTuoi());
        System.out.println(sv1.age);
    }
}
