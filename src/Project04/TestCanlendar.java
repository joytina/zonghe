package Project04;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCanlendar {


    public static void main(String[] args) {
        Calendar c1=new GregorianCalendar(2091,1,5,3,23,45);
        int year=c1.get(Calendar.YEAR);
        int month=c1.get(Calendar.MONTH);
        int day=c1.get(Calendar.DATE);
        int weekday=c1.get(Calendar.DAY_OF_WEEK);
        
        System.out.println(year);
        System.out.println(weekday);
        
        Calendar c2=new GregorianCalendar();
        c2.add(Calendar.YEAR,-29);
        //System.out.println(c2);

        Date d4=c2.getTime();
        Calendar c4=new GregorianCalendar();
        c4.setTime(new Date());

        System.out.println(c4);
        
        
        
    }
    
    
    
}
