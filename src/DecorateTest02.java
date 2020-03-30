public class DecorateTest02 {
    public static void main(String[] args) {
        Drink d=new Coffee();
        Milk m=new Milk(d);
        System.out.println(m.cost());
        System.out.println(m.info());

        Sugar  s=new Sugar(d);
        System.out.println(s.cost());
        System.out.println(s.info());
        
        
    }
}

//1 抽象组件
interface Drink{
    double cost();  //费用
    String info();  //说明
}

//2 具体组件
class Coffee implements Drink{
    private String name="原味咖啡";
    
    
    @Override
    public double cost() {
        return 10;
    }

    @Override
    public String info() {
        return name;
    }
}

// 3 抽象装饰类
abstract class Decorate implements Drink{
    //对抽象组件的引用
    private Drink drink;
    public Decorate(Drink drink){
        this.drink=drink;
    }

    @Override
    public double cost() {
        return this.drink.cost();
    }

    @Override
    public String info() {
        return this.drink.info();
    }
}

// 4具体装饰类
class Milk extends Decorate{
    public Milk(Drink drink) {
        super(drink);
    }

    @Override
    public double cost() {
        return super.cost()*4;
    }

    @Override
    public String info() {
        return super.info()+"加了牛奶";
    }
    

}
class Sugar extends Decorate{
    public Sugar(Drink drink) {
        super(drink);
    }

    @Override
    public double cost() {
        return super.cost()*2;
    }

    @Override
    public String info() {
        return super.info()+"加了糖";
    }
}
