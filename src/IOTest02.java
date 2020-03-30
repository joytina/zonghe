import java.io.*;

public class IOTest02 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        //1 选择源
        File f=new File("C:\\Idea_Projects\\zonghe\\src\\tt");
        //2 选择流
        InputStream is=null;
        is=new FileInputStream(f);
        //3 操作读取
        int temp;
        while((temp=is.read())!=-1){
            System.out.println((char)temp);
        }
        
        is.close();
        
        
        
        
    }
}
