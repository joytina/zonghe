public class TestRunnable {
    public static void main(String[] args) {
        MY my=new MY();
        Thread th=new Thread(my);
        th.start();
        for(int i=0;i<100;i++){
            if(i%2==1){
                System.out.println("main奇数"+i);
            }
        }
        
    }
}

class MY implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            if(i%2==0){
                System.out.println("偶数"+i);
            }
        }
    }
}
