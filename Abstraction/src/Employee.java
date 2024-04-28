abstract class Employee {
    private String name;
    Employee(String name){
        this.name=name;
    }
    public abstract void work();
    public String getName(){
        return name;
    }
}

class SE extends Employee{
    SE(String name){
        super(name);
    }

    @Override
    public void work() {
        System.out.println(getName()+" Working on tiktok project");
    }
}

class ITEngineer extends Employee{
    ITEngineer(String name){
        super(name);
    }

    @Override
    public void work() {
        System.out.println(getName()+" Working on computer issues");
    }
}

class Test3{
    public static void main(String[] args) {
        Employee e,em;
        e=new SE("Lahiru");
        em=new ITEngineer("Malith");
        e.work();
        em.work();

    }
}
