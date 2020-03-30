public class DecorateTest01 {
    public static void main(String[] args) {
        Person p=new Person();
        p.say();
        
        //装饰
        Am a=new Am(p);
        a.say();
        
        
    }
}

interface Say{
    void say();
}

class Person implements Say{
    //属性
    private int voice=10;

    public int getVoice() {
        return voice;
    }

    public void setVoice(int voice) {
        this.voice=voice;
    }

    @Override
    public void say() {
        System.out.println("人的声音为："+this.getVoice());
        
    }
}

//放大器
class Am implements Say{
    private Person p;

    public Am(Person p){
        this.p=p;
    }

    @Override
    public void say() {
        System.out.println("人的声音为："+p.getVoice()*100);
        
    }
}
