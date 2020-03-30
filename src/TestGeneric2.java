public class TestGeneric2 {
    public static void main(String[] args) {
        MyCollection2<String> mc=new MyCollection2<String>();
        MyCollection2<Integer> mc2=new MyCollection2<Integer>();
        mc.set("dd",1);
        mc2.set(123,2);
        String a=(String)mc.get(1);
        Integer b=(Integer) mc2.get(2);
        
        System.out.println(a);
        System.out.println(b);
    }
}

class MyCollection2<E>{
    Object[] objs=new Object[5];
    
    public void set(E e,int index){
        objs[index]=e;
    }
    
    public E get(int index){
        return (E)objs[index];
    }
    
}
