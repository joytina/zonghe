import java.io.*;

public class IOTest06 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //1 选择源
        File f=new File("ss.txt");
        //2 选择流
        Writer w=new FileWriter(f);
        
        //3 操作 写入
        w.write("我问");
        w.flush();
        w.close();
        
    }
}
