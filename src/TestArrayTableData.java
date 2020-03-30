import java.util.Arrays;

public class TestArrayTableData {
    public static void main(String[] args) {
        Object[] e1={"aa",12,"2019"};
        Object[] e2={"ss",13,"2018"};
        Object[] e3={"dd",14,"2017"};
        Object[][] table=new Object[3][];
        table[0]=e1;
        table[1]=e2;
        table[2]=e3;
        
        
        Object[][] table1={e1,e2,e3};
        for(Object[] tmp:table1){
            System.out.println(Arrays.toString(tmp));
            
        }
        
        
        
    }
    
}
