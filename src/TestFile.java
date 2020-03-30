import java.io.File;
import java.util.Date;

public class TestFile {
    public static void main(String[] args) {
        File f=new File("E:/BaiduPan/促销营销.py");
        System.out.println(f);
        f.renameTo(new File("E:/BaiduPan/促销.py"));
        
        File f2=new File("E:/BaiduPan/dd.txt");
        System.out.println(f.exists());
        System.out.println(f2.isDirectory());
        System.out.println(f2.isFile());
        System.out.println(new Date(f2.lastModified()));
        System.out.println(f2.getName());
        System.out.println(f2.getAbsolutePath());
        
        File  f3=new File("E:/BaiduPan/XX/DD");
        boolean flag=f3.mkdir();
        System.out.println(f3.mkdirs());
        
        
    }
}
