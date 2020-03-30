package Project04;

import java.io.File;

public class DirCount6 {
    private int filesize;
    private int dirsize;
    private String path;
    private File src;

    public DirCount6(String path) {
        this.path = path;
        this.src = new File(path);
        count(src);
    }

    public int getFilesize() {
        return filesize;
    }

    public int getDirsize() {
        return dirsize;
    }

    private  void count(File src){

        if(src.exists() & src !=null){
            if(src.isFile()){
                this.filesize +=1;
            }else{
                this.dirsize +=1;
                for(File t:src.listFiles()){
                    count(t);
                }
            }
        }
        
    }

    public static void main(String[] args) {
       
        DirCount6 a=new DirCount6("E:\\BaiduPan\\01第一阶段：JAVA 快速入门\\01第一阶段\\07_容器和数据结构\\源代码\\容器");

        System.out.println(a.getDirsize());
        System.out.println( a.getFilesize());

    }
}
