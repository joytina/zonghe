public class TestString {


    public static void main(String[] args) {
        String s1="core java";
        String s2=" Core java ";
        System.out.println(s1.charAt(3));
        System.out.println(s1.length());
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.indexOf("java"));  //是否包含java，有就返回index位置。没有返回-1
        System.out.println(s1.indexOf("aaa"));
        System.out.println(s1.replace(" ","&"));
        System.out.println(s1.startsWith("or"));
        System.out.println(s1.endsWith("va"));
        System.out.println(s1.substring(3,6));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.trim());

    }
}
