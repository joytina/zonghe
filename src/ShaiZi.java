public class ShaiZi {
    
    public static void main(String[] args) {

//        int d1=(int)(6*Math.random()); 
//        //random()是取随机数。double类型？ 【0，1)之间
//        int d2=(int)(6*Math.random());
//        int d3=(int)(6*Math.random());
//        
//        int count=d1+d2+d3;
//        System.out.println(count);
//        
//        if(count>=15){
//            System.out.println("手气不错");
//        }
//
//        if(count>=10 & count<15){
//            System.out.println("手气一般");
//        }
//
//        if(count<10){
//            System.out.println("手气加油");
//        }
        
        
        //产生一个【0.4）之间的半径，并计算圆的面积和周长
//        double r=4*Math.random();
//        double area=3.14*Math.pow(r,2);
//        double circle=3.14*2*r;
//        
//        if(area>circle){
//            System.out.println("面积大于周长");
//        }else {
//            System.out.println("周长大于面积");
//        }
        
        
        
        //年龄判断
//        int age=(int)(100*Math.random());
//        System.out.print("年龄是："+age+"，属于");
//        if(age<15){
//            System.out.println("儿童");
//        }else if(age<25){
//            System.out.println("年轻人");
//        }else if(age<50){
//            System.out.println("中年");
//        }else if(age<70){
//            System.out.println("老年");
//        }else {
//            System.out.println("寿星");
//        }
        
        
        //switch练习1  月份
//        int month=(int)(5*Math.random()+1);
//        System.out.println("月份是"+month);
//        
//        switch (month){
//            case 1:
//                System.out.println("一月,过年");
//                break;
//            case 2:
//                System.out.println("二月,开春");
//                break;
//            case 3:
//                System.out.println("三月，探春");
//                break;
//            default:
//                System.out.println("其他月份");
//        }
        
        
        
//        char c1='a';
//        int rand='a'+(int)(26*Math.random());
//        char c2=(char)rand;
//        System.out.println(c2);
//        
//        switch (c2){
//            case 'a':
//            case 'e':
//            case 'i':
//            case 'u':
//            case 'o':
//                System.out.println("元音");
//                break;
//            default:
//                System.out.println("辅音");
//        }
        
        
        
//        int i=1;
//        int sum=0;
//        while(i<=100){
//            sum=sum+i;
//            i++;
//        }
//
//        System.out.println(sum);
        
//          int sum=0;
//          for(int y=0;y<=100;y++){
//              sum=sum+y;
//          }
//
//          System.out.println(sum);
//

        
        /*
        打印
        1 1 1 1 1
        2 2 2 2 2
        3 3 3 3 3等
         */

//    for(int i=1;i<=5;i++){
////        
////        for(int j=1;j<=5;j++){  //j计数用，即打出5个i
////            System.out.print(i+"\t");
////        }
////        System.out.println();
////    }
        
        //打印九九乘法表,m为*左边的数，n为*右边的数
//        for(int n=1;n<=9;n++){
//            for(int m=1;m<=n;m++){
//                System.out.print(m+"*"+n+"="+m*n+"\t");
//            }
//            System.out.println();
//        }
        
//        int sum1=0;
//        int sum2=0;
//        for(int i=1;i<=100;i++){
//            if(i%2==1){
//                sum1+=i;
//            }else{sum2+=i;}
//        }
//        System.out.println(sum1);
//        System.out.println(sum2);
        
//        for(int i=1;i<=100;i++){
//            if(i%5==0){
//                System.out.print(i+"\t");
//            }
//            if(i%25==0){System.out.println();}
//        }
        
        
//        int count=0;
//        for(int i=1;i<=1000;i++){
//            if(i%5==0){
//                System.out.print(i+"\t");
//                count+=1;
//            }
//            if(count==5){
//                System.out.println();
//                count=0;     //计数清零
//            }
//            
            
//            if(i%25==0){
//                System.out.println();
//            }
            
        
            //break用法

//        int count=0;
//        while(true){
//            int a=(int)(100*Math.random());
//            count++;
//            System.out.println(a);
//            if(a==88){
//                break;
//            }
//        }
//        System.out.println("次数："+count);
        
        int count=0;
        for(int a=100;a<=150;a++){
            if(a%3==0){
                continue;
            }
            System.out.print(a+"\t");
            count++;
            if(count%5==0){
                System.out.println();
            }
        }
        
        
    }
}
