public class TestInnerClass {
    public static void main(String[] args) {
        Outer.Inner inner=new Outer().new Inner();
        inner.show();
        
    }
}


class Outer{
    private int age=50;
    public void testOuter(){
        System.out.println("Outer.testOuter()");
    }
    class Inner{
        int age=40;
        public void show(){
            int age=30;
            System.out.println(Outer.this.age);
            System.out.println(this.age);
            System.out.println(age);
        }
    }
}