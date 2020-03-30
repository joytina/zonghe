import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollections {

    public static void main(String[] args) {
        List<String> a=new ArrayList<>();
        for(int i=0;i<10;i++){
            a.add("gao"+i);
        }
        System.out.println(a);

        Collections.shuffle(a);
        System.out.println(a);
        
        Collections.reverse(a);
        System.out.println(a);
        
        Collections.sort(a);
        System.out.println(a);
        
        System.out.println(Collections.binarySearch(a,"gao7"));
    }
}
