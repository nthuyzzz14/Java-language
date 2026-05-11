package vonglap;

public class whileloop {
    public static void main (String[] args){
        int i = 0;
        while (i <= 5){
            System.out.println(i);
            i++;
            if(i == 5)
                continue;
            System.out.println("Ma thanh thuy so mot");
        }
    }
}
