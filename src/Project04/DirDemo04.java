package Project04;

import java.io.File;

public class DirDemo04 {
    public static void main(String[] args) {
        File f=new File("E:\\BaiduPan\\01第一阶段：JAVA 快速入门\\01第一阶段\\07_容器和数据结构\\源代码\\容器");
        countSize(f);
        System.out.println(len);
        
    }
    
    static long len;
    
    public static void countSize(File f){
        
        if(f.exists() & f!=null){
            if(f.isFile()){
                len+=f.length();
            }else{
                for(File temp:f.listFiles()){
                    countSize(temp);
                }
            }
        }
        
        



        

        
    }
}
