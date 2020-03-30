package Project04;

import java.io.UnsupportedEncodingException;

public class ContentDecode {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s="性命生命使命a";
        //编码
        byte[] datas=s.getBytes();
        //解码
        s=new String(datas,0,datas.length-1,"gbk");
        System.out.println(s);
        
        
    }
}
