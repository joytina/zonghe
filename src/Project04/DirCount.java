package Project04;

import java.io.File;

public class DirCount {
    public static void main(String[] args) {
        File f=new File("E:\\BaiduPan\\01第一阶段：JAVA 快速入门\\01第一阶段\\07_容器和数据结构\\源代码\\容器");
        count(f);
        System.out.println(filecount);
        System.out.println(dircount);
        

    }
    
    static int filecount;
    static int dircount;
    
    public static void count(File f){
        if(f.exists() &f!=null){
            if(f.isFile()){
                filecount +=1;
            }else {
                dircount +=1;
                for(File temp:f.listFiles()){
                    count(temp);
                    
                }
            }
        }
        
        
    }
}
