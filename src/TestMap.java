import java.util.HashMap;
import java.util.Map;

public class TestMap {

    public static void main(String[] args) {
        Map<Integer,String> m1=new HashMap<>();
        m1.put(1,"gg");
        m1.put(2,"rr");
        m1.put(3,"dd");
        
        System.out.println(m1.get(2));
        System.out.println(m1);
        System.out.println(m1.size());
        System.out.println(m1.isEmpty());
        System.out.println(m1.containsKey(3));
        System.out.println(m1.containsValue("ee"));
        
        
        Map<Integer,String> m2=new HashMap<>();
        m2.put(1,"pp");
        m2.put(4,"ff");
        m2.put(5,"ll");
        m1.putAll(m2);
        System.out.println(m1);
        
    }
    
   
}
