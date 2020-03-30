import java.util.HashMap;
import java.util.Map;

public class TestMap2 {
    public static void main(String[] args) {
        Employee e1=new Employee(1001,"高高",60000);
        Employee e2=new Employee(1002,"弟弟",30000);
        Employee e3=new Employee(1003,"三三",20000);
        
        Integer i;
        Object o;

        Map<Integer,Employee> map=new HashMap<>();
        map.put(1001,e1);
        map.put(1002,e2);
        map.put(1003,e3);
        
        Employee emp=map.get(1002);
        System.out.println(emp.getSalary());
        System.out.println(map);
        System.out.println(e1.hashCode());
        
    }
}

class Employee{
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id+name+salary;
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
}
