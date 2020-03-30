
public class TestMethod {

    public static void main(String[] args) {
        TestMethod tm=new TestMethod();
        tm.printSl();
        tm.Add(7,3,5);
        
    }
    
    void printSl(){
        System.out.println("西来");
        System.out.println("扬中");
    }
    
    int Add(int a,int b,int c){
        int sum=a+b+c;
        System.out.println(sum);
        return sum;
        
        
    }

    
}
