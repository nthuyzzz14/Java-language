package Stringexercise;

public class student {
    String name;
    String id;

    public student(){

    }

    public student(String name1, String id1){
        this.name = name1;
        this.id = id1;
    }

    public String layTen(){
        return this.name;
    }

    public String layID(){
        return this.id;
    }

    @Override
    public String toString(){
        return "Ten: "+name+ " - ID: "+id;
    }
}