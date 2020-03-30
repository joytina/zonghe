package Project04;

public class TestInterface2 {
}

interface a{
    void testa();
}

interface b{
    void testb();
}

interface c extends a,b{
    void testc();
}

class MySubClass implements c{
    @Override
    public void testa() {
        
    }

    @Override
    public void testb() {
        
    }

    @Override
    public void testc() {
        
    }
}