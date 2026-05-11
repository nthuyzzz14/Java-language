package vonglap;

public class do_whileloop {
    public static void main (String[] args){
        int i = 0;
        do {
            System.out.println(i);
            i++;
            if (i == 6)
                continue;
            System.out.println("Ma thuy cute");
        } while (i <= 6);
    }
}
