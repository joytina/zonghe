package Project04;

import java.util.Random;

public class TestRandom {
    public static void main(String[] args) {
        Random r=new Random();
        System.out.println(r.nextDouble());
        System.out.println(r.nextInt());
        System.out.println(r.nextFloat());
        System.out.println(r.nextBoolean());
        System.out.println(r.nextInt(10));
        System.out.println(20+r.nextInt(30));
        System.out.println(20+(int)(r.nextDouble()*10));
    }
    
}
