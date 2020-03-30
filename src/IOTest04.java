import java.io.*;

public class IOTest04 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //1 创建源
        File f=new File("qq.txt");
        
        //2 选择流
        OutputStream w= new FileOutputStream(f);
        
        //3操作 写入
        String msg="差点";
        byte[] data=msg.getBytes();
        w.write(data,0,data.length);
        w.flush();
        w.close();
     }
}
