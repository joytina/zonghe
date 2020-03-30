package Project04;

import java.io.*;

public class IOTest01 {
    public static void main(String[] args)  {
        //1 选择源
        File f=new File("C:\\Idea_Projects\\zonghe\\src\\tt");
        
        //2 读取操作
        try {
            InputStream is=new FileInputStream(f);
            
            //3操作读取
            int d1=is.read();
            int d2=is.read();
            int d3 = is.read();

            System.out.println((char)d1);
            System.out.println((char)d2);
            System.out.println(d3);
            
            //4释放资源
            is.close();
            
            
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();

        }
    }
}
