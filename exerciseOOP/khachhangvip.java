package exerciseOOP;

import java.lang.Character;
public class khachhangvip extends khachhang{
    @Override
    public boolean kiemtraSDT(){
        if(number.startsWith("+84") && number.length() == 12){
            return true;
        }
        return super.kiemtraSDT();
    }
}
