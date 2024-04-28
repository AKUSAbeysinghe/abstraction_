abstract class Bike {

    Bike(){
        System.out.println("Bike is working!");
    }

    public abstract void ride();
    public void changeGear(){
        System.out.println("Gear change to 4!");
    }
}

class CBHornet extends Bike{
    public void ride(){
        System.out.println("Running Safely!");
    }
}

class Test1{
    public static void main(String[] args) {
        Bike b=new CBHornet();
        b.ride();
        b.changeGear();
    }
}
