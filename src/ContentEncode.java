import java.io.UnsupportedEncodingException;

public class ContentEncode {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s="升级快看看a";
        byte[] datas=s.getBytes();
        System.out.println(datas.length);
        
        datas=s.getBytes("GBK");
        System.out.println(datas.length);
        
        datas=s.getBytes("UTF-16LE");
        System.out.println(datas.length);
        
        
        
        
    }
}
