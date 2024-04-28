abstract class Animal {
    public abstract void animalSound();

    public void sleep(){
        System.out.println("zzzz");
    }
}

class Cat extends Animal{


    public void animalSound(){
        System.out.println("meow meow");
    }
}

class Test{
    public static void main(String[] args) {
        Cat c=new Cat();
        c.animalSound();
        c.sleep();
    }
}
