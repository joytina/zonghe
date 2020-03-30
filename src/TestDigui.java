public class TestDigui {
    public static void main(String[] args) {
        jie(10);

    }
    
    static void jie(int a){
        long t1=System.currentTimeMillis();
        long result=1;
        while(a>0){
            result=result*a;
            a--;
        }
        long t2=System.currentTimeMillis();

        System.out.printf("%d的阶乘用时为%s\n",10,t2-t1);
        System.out.println(result);
        

        
        
        
    }

    
    
    
}
