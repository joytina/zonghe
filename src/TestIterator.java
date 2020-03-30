import java.util.*;

public class TestIterator {
    public static void main(String[] args) {
        testIteratorList3();
        System.out.println("#############");
        testIteratorSet2();
        System.out.println("#############");
        testIteratorMap();
        
    }
    
    public static void testIteratorList(){
        List<String> a=new ArrayList<>();
        a.add("ss");
        a.add("dd");
        a.add("ff");
        for(Iterator<String>i=a.iterator();i.hasNext();){
            String temp=i.next();
            System.out.println(temp);
        }
    }

    public static void testIteratorList2(){
        List<String> a=new ArrayList<>();
        a.add("ss");
        a.add("dd");
        a.add("ff");

        for(int i=0;i<a.size();i++){
            String temp=a.get(i);
            System.out.println(temp);
        }
    }

    public static void testIteratorList3(){
        List<String> a=new ArrayList<>();
        a.add("ss");
        a.add("dd");
        a.add("ff");
        
        for(String temp:a){
            System.out.println(temp);
            
        }
    }
    
    public static void testIteratorSet(){
        Set<String> b=new HashSet<>();
        b.add("ee");
        b.add("tt");
        b.add("qq");
        for(Iterator<String> i=b.iterator();i.hasNext();){
            String temp=i.next();
            System.out.println(temp);
        }

    }

    public static void testIteratorSet2(){
        Set<String> b=new HashSet<>();
        b.add("ee");
        b.add("tt");
        b.add("qq");
        for(String temp:b){
            System.out.println(temp);
        }
        

    }

    public static void testIteratorMap(){
        Map<Integer,String> m=new HashMap<>();
        m.put(101,"qq");
        m.put(102,"ww");
        m.put(103,"rr");
        
        Set<Integer> ks=m.keySet();
        System.out.println(ks);//结果是[101, 102, 103]
        for(Iterator<Integer> i=ks.iterator();i.hasNext();){
            Integer key=i.next();
            System.out.println(key+":"+m.get(key));
            
            
        }
    }
    
}

