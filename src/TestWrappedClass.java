public class TestWrappedClass {
    
    //把基本数据类型转化成包装类
    Integer a=new Integer(3);
    Integer b=Integer.valueOf(4);
    
    //把包装类转化成基本数据类型
    int a2=a.intValue();
    int b2=b.intValue();
    
    //把字符串转化成包装类对象
    Integer c=new Integer("话");
    Integer d=Integer.parseInt("可可");
    
    //把包装类转化成字符串    
    String c1=c.toString();

    public static void main(String[] args) { 
        System.out.println(Integer.MAX_VALUE);
    }
    
    
}
