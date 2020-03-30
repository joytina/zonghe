public class TestMetho2 {
    public static void main(String[] args) {
        MyRunnable my2=new MyRunnable();
        Thread t2=new Thread(my2);
        t2.start();
        
        Thread t=Thread.currentThread();
        System.out.println(t.getPriority());
        
        MyThread my=new MyThread();
        System.out.println(my.getPriority());

        System.out.println(Thread.MAX_PRIORITY);

        System.out.println(Thread.MIN_PRIORITY);
        
        
        
        
        
    }
}

