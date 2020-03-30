public class TestAutoBox {
    public static void main(String[] args) {
        Integer a=2;
        Integer b=a;
        int c=a;
        
        String s="aadsa";
        String s2=s.substring(1,3);
        System.out.println(s);
        System.out.println(s2);
        
        StringBuilder sb=new StringBuilder("ERDDD");
        System.out.println( Integer.toHexString(sb.hashCode()));
        System.out.println(sb);
        
        
        sb.setCharAt(4,'U');
        System.out.println(Integer.toHexString(sb.hashCode()));
        System.out.println(sb);
    }
}
