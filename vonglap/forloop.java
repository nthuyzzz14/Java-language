package vonglap;

public class forloop {
    public static void main (String[] args) {
        for (int i = 0; i <= 5; i++){
            System.out.println(i);
            if(i == 4)
                continue;
            System.out.println("Ma thuy dep trai");
        }   
    }
}
