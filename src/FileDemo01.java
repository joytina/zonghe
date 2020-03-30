import java.io.File;
import java.io.IOException;

public class FileDemo01 {


    public static void main(String[] args) throws IOException {
        File f=new File("E:\\BaiduPan\\dd.txt");
        System.out.println(f.getName());
        System.out.println(f.isFile());
        System.out.println(f.length());
        System.out.println(f.exists());
        System.out.println(f.isDirectory());
        System.out.println(f.getParent());
        
        File f2=new File("E:\\BaiduPan\\ee.txt");
        

        System.out.println(f2.createNewFile());
        f2.delete();
        
    }
}
