package Project04;

public abstract class Animal {
    abstract public void shout();
    
    public void run(){
        System.out.println("叫");
    }

    public static void main(String[] args) {
       Animal a= new Dog();
    }
    
}

class Dog extends Animal{
    @Override
    public void shout() {
        System.out.println("p");
    }
}