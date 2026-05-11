package exerciseOOP;

import java.lang.Character;
public class customerVIP extends customer{
    @Override
    public boolean kiemtraSDT(){
        if (number.startsWith("+84") && number.length() == 12){
            return true;
        }
        return super.kiemtraSDT();
    }
}
