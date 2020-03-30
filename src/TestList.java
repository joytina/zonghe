import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        test03();
        
    }
    public static void test01(){
        Collection<String> c=new ArrayList<>();
        System.out.println(c.size());
        System.out.println(c.isEmpty());
        
        c.add("一一");
        c.add("二二");
        System.out.println(c);
        System.out.println(c.size());
        
        System.out.println(c.contains("三三"));
        
        Object[]  obs=c.toArray();
        System.out.println(obs);
        c.remove("一一");
        System.out.println(c);
        c.clear();
        System.out.println(c);
        
    }
    
    public static void test02(){
        List<String> t1=new ArrayList<>();
        t1.add("aa");
        t1.add("bb");
        t1.add("cc");
        
        List<String> t2=new ArrayList<>();
        t2.add("aa");
        t2.add("ee");
        t2.add("ff");
        
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t1.addAll(t2));
        System.out.println(t1);
        System.out.println(t1.contains(t2));
        System.out.println(t1.containsAll(t2));
        System.out.println(t1.removeAll(t2));
        System.out.println(t1);
        System.out.println(t1.retainAll(t2));
        System.out.println(t1);
        
    }
    
    public static void test03(){
        List<String> t=new ArrayList<>();
        t.add("a");
        t.add("b");
        t.add("c");
        t.add("d");
        System.out.println(t);
        
        t.add(1,"高高");
        System.out.println(t);
        
        t.remove(3);
        System.out.println(t);
        
        t.set(2,"可可");
        System.out.println(t);

        System.out.println(t.get(2));
        
        t.add(3,"a");
        System.out.println(t.indexOf("a"));
        System.out.println(t.lastIndexOf("a"));
        
        
        
    }
}
