public class Test2DimensionArray {
    public static void main(String[] args) {
        int[][] a=new int[3][];
        a[0]= new int[]{1,2};
        a[1]=new int[]{3,4,5,6};
        a[2]=new int[]{1};
        System.out.println(a[1][2]);
        
        
        //静态初始化二维数组
        int [][] b={
            {1,2},
            {2,4,5},
            {5,9}
            
        };
        System.out.println(b[2][1]);
    }

    
    
    
}
