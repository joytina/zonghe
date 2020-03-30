import java.io.File;

public class DirDemo03 {
    public static void main(String[] args) {
        File f=new File("E:\\BaiduPan\\01第一阶段：JAVA 快速入门\\01第一阶段\\07_容器和数据结构\\源代码\\容器");
 
        printFile(f,0);
    }
    
    public static void printFile(File f,int deep){
        for(int i=0;i<deep;i++ ){
            System.out.print("=");
        }
        
        System.out.println(f.getName());
        if(f.isDirectory()){
            
            for(File temp:f.listFiles()){
                //System.out.println(temp);
                printFile(temp,deep+1);
            }
        }
        
    }
    

    
    
}
