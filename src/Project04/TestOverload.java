package Project04;

public class TestOverload {
    public static void main(String[] args) {
        System.out.println(add(1,2));
        System.out.println(add(1,2,3));
        System.out.println(add(1.0,2));
        System.out.println(add(1,2.0));
    }
    
    public static int add(int a,int b){
        int sum=a+b;
        return sum;
    }
    
    public static int add(int a,int b,int c){
        int sum=a+b+c;
        return sum;
    }
    
    public static double add(double a,int b){
        double sum=a+b;
        return sum;
    }
    
    public static double add(int a,double b){
        double sum=a+b;
        return sum;
    }
    
    
}
