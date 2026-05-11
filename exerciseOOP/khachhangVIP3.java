package exerciseOOP;


import java.lang.Character;
public class khachhangVIP3 extends khachhang3{
    @Override
    public boolean kiemtraNums(){
        if (sDT.startsWith("+84") && sDT.length() == 12){
            return true;
        }
        return super.kiemtraNums();
    }
}
