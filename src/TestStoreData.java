import java.util.*;

public class TestStoreData {

    public static void main(String[] args) {
        Map<String,Object> m1=new HashMap<>();
        m1.put("id",101);
        m1.put("name","高高");
        m1.put("salary",20000);
        
        Map<String,Object> m2=new HashMap<>();
        m2.put("id",102);
        m2.put("name","哈哈");
        m2.put("salary",30000);
        
        Map<String,Object> m3=new HashMap<>();
        m3.put("id",103);
        m3.put("name","可可");
        m3.put("salary",40000);

        List<Map<String,Object>> b=new ArrayList();
        b.add(m1);
        b.add(m2);
        b.add(m3);
        System.out.println(b);
        
        for(Map<String,Object> row:b){
            Set<String> keyset=row.keySet();
            for(String key:keyset){
                System.out.print(key+":"+row.get(key));
            }
            System.out.println();
                    
            
        }
        
    }
}
