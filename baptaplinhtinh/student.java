package baptaplinhtinh;

public class student {
    public String name;
    public int age;
    
    student (int age1,String name1){
        this.name = name1;
        this.age = age1;
    }

    public String layTen(){
        return this.name;
    }

    public int layTuoi(){
        return this.age;
    }
}
