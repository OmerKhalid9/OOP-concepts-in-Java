 class Job {
    private int salary;
    private int id;

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
class Person {
    private Job obj;
   
    public Person(){
        obj=new Job();
        obj.setSalary(1000);
    }
    public void getSalary() {
        System.out.println(obj.getSalary());
    }

}
public class composition {
   
    public static void main(String[] args) {
        Person person = new Person();
 person.getSalary();
    }
}
