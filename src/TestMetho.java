public class TestMetho {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable my=new MyRunnable();
        Thread t=new Thread(my);
        t.start();
        t.interrupt();
        

//        MyRunnable my2 = new MyRunnable();
//        Thread t2 = new Thread(my2);
//        t2.start();
//        
//        for(int i=1;i<=10;i++){
//            System.out.println(Thread.currentThread().getName()+i);
//            if(i==4){
//                try {
//                    t2.join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//            
//        }
        
    }
}

class MyThread2 extends Thread {
    public MyThread2() {
    }

    public MyThread2(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("自定义线程");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("自定义线程休眠结束");
    }
}

class MyRunnable implements Runnable{
    @Override
    public void run() {
        for(int i=10;i>=1;i--){
            System.out.println(Thread.currentThread().getName()+"RUN: "+i);
        }
        Thread.yield();
        for(int i=20;i<=30;i++){
            System.out.println(Thread.currentThread().getName()+"RUN: "+i);
        }
    }
}
