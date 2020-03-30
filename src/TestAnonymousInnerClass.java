public class TestAnonymousInnerClass {
    public static void test01(AA b){
        System.out.println("###########");
        b.aa();
    }

    public static void main(String[] args) {
        TestAnonymousInnerClass.test01(new AA(){
            @Override
            public void aa() {
                System.out.println("hhhhhh");
            }
        });
    }
    
    
    
}

interface AA{
    void aa();
}
