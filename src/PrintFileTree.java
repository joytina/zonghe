import java.io.File;

public class PrintFileTree {
    public static void main(String[] args) {
        File f=new File("E:\\BaiduPan\\01第一阶段：JAVA 快速入门\\基础视频\\01第一阶段\\05_常用类");
        printFile(f,0);
    }
    
    public static void printFile(File file,int level){
        //输出层数；
        for(int i=0;i<level;i++ ){
            System.out.print("-");
        }
        
        System.out.println(file.getName());
        
        if(file.isDirectory()){
            File[] files=file.listFiles();
            
            for(File temp:files){
                printFile(temp,level+1);
            }
        }
        
    }
}
