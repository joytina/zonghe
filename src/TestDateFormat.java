import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat {
    
    public static void main(String[] args) throws ParseException {
        DateFormat df=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        String str=df.format(new Date(1544765680000L));
        System.out.println(str);
        System.out.println(System.currentTimeMillis());
        
        Date dt=df.parse("2018年12月14日 13时34分40秒");
        System.out.println(dt.getTime());
        
        DateFormat df2=new SimpleDateFormat("W");
        System.out.println(df2.format(new Date(12345678908766l)));
        
        

    }
}
