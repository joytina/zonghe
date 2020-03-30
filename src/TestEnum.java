public class TestEnum {
    public static void main(String[] args) {
        SEASON s=SEASON.SUMMER;
        System.out.println(s);
        switch (s){
            case SPRING:
                System.out.println("春天");
                break;
            case SUMMER:
                System.out.println("夏天");
                break;
            case AUTUMN:
                System.out.println("秋天");
                break;
            case WINTER:
                System.out.println("冬天");
                break;
        }
        
    }
}

enum SEASON{
    SPRING,SUMMER,AUTUMN,WINTER
}
enum WEEK{
    周一,周二,周三,周四
}