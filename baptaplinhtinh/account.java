package baptaplinhtinh;

public class account {
    String id;
    double balance;

    account(String id, double balance){
        this.id = id;
        this.balance = balance;
    }

    void deposit(double amount){
        balance = balance + amount;
    }

    void withdraw(double amount){
        if(amount <= balance){
            balance = balance - amount;
        } else {
            System.out.println("So tien rut qua lon !");
        }
    }

    void trara(){
        System.out.println("ID:"+this.id+"\nBalance:"+this.balance);
    }

    public static void main (String[] args){
        account tk1 = new account("Mthuy01", 10000);

        tk1.deposit(5000);
        tk1.withdraw(2500);

        tk1.trara();

    }
}
