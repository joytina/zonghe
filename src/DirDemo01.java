import java.io.File;

public class DirDemo01 {
    public static void main(String[] args) {
       File f=new File("E:\\BaiduPan\\01第一阶段：JAVA 快速入门\\01第一阶段\\07_容器和数据结构\\源代码\\容器");
       System.out.println(f.list());
       String[] listname=f.list();
       for(String temp:listname){
           System.out.println(temp);
       }
        System.out.println("####################");
       
       File[] filenames=f.listFiles();
       for(File temp:filenames){
           System.out.println(temp);
       }
       
    }
}
