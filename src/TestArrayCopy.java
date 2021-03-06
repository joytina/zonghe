public class TestArrayCopy {

    public static void main(String[] args) {
        testBasicCopy2();
        System.out.println("###########");
        
        String[] s={"aa","ss","dd","ff","gg"};
        removeElment(s,1);
        System.out.println("###########");

        extendRange(s);
        
        
        
        
    }
    
    public static void testBasicCopy(){
        String[] s1={"aa","bb","cc","dd","ee"};
        String[] s2=new String[10];
        System.arraycopy(s1,1,s2,5,3);
        
        for(int i=0;i<s2.length;i++){
            System.out.println(i+":"+s2[i]);
        }
        
    }

    //测试从数组中删除某个元素(本质上还是数组的拷贝)
    public static void testBasicCopy2(){
        String[] s1={"aa","bb","cc","dd","ee"};
        System.arraycopy(s1,3,s1,2,2);
        s1[s1.length-1]=null;
        
        for(int i=0;i<s1.length;i++){
            System.out.println(i+":"+s1[i]);
        }
        
    }


    //删除数组中指定索引位置的元素，并将原数组返回
    public static String[] removeElment(String[] s3,int index){
        System.arraycopy(s3,index+1,s3,index,s3.length-1-index);
        s3[s3.length-1]=null;
        
        for(int i=0;i<s3.length;i++){
            System.out.println(i+":"+s3[i]);
        }
        return s3;
    }

    //数组的扩容（本质上是：先定义一个更大的数组，然后将原数组内容原封不动拷贝到新数组中）
    public static String[] extendRange(String[] s1){
        String[] s2=new String[s1.length+6];
        System.arraycopy(s1,0,s2,0,s1.length);
        for(String a:s2){
            System.out.println(a);
        }
        return s2;
    }


}
