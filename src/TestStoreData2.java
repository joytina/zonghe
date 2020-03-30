import java.util.*;

public class TestStoreData2 {
    public static void main(String[] args) {
        User u1=new User(101,"高高",20000);
        User u2=new User(102,"可可",30000);
        User u3=new User(103,"中中",40000);

        List<User> a=new ArrayList<>();
        a.add(u1);
        a.add(u2);
        a.add(u3);
        
        System.out.println(a);
        System.out.println("#############");
        for(User temp:a){
            System.out.println(temp);
        }
        System.out.println("#############");

        Map<Integer,User> m=new HashMap<>();
        m.put(1,u1);
        m.put(2,u2);
        m.put(3,u3);

        Set<Integer> keyset=m.keySet();
        for(Integer key:keyset){
            System.out.println(key+"==="+m.get(key));
        }
        
        
        
        
    }
}

class User{
    private int id;
    private String name;
    private double salary;

    public User(){
        
    }
    public User(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
