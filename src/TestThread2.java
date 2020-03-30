public class TestThread2 {
    public static void main(String[] args) {
        MyThread my=new MyThread();
        my.start();
        
        for(int i=0;i<100;i++){
            if(i%2==1){
                System.out.println("main奇数"+i);
            }
        }
        
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            if(i%2==0){
                System.out.println("偶数"+i);
            }
        }
    }
}
