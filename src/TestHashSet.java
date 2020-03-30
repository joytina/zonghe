import java.util.HashSet;
import java.util.Set;

public class TestHashSet {

    public static void main(String[] args) {
        Set<String> s=new HashSet<>();
        s.add("aa");
        s.add("bb");
        s.add("cc");
        System.out.println(s);
        
        s.remove("aa");
        System.out.println(s);
        
        Set<String> s2=new HashSet<>();
        s2.add("aa");
        s2.add("dd");
        System.out.println(s.addAll(s2));
        
        
    }
}
