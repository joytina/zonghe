package Project04;

public class TestInterface {
    public static void main(String[] args) {
        Honest h=new Bird();
        h.help();
        
        Fly f=new Angel();
        f.fly();
    }
}


interface Fly{
    int Fly_height=1000;
    void fly();
}

interface Honest{
    void help();
}

class Angel implements Fly,Honest{
    @Override
    public void fly() {
        System.out.println("pp");
    }

    @Override
    public void help() {
        System.out.println("ii");
    }
}

class Man implements Fly{
    @Override
    public void fly() {
        System.out.println("jj");
    }
}

class Bird implements Honest{
    @Override
    public void help() {
        System.out.println("dd");
    }
}