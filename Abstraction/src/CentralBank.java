abstract class CentralBank {
    abstract int vat();
}

class HNB extends CentralBank{
    int vat(){
        return 18;
    }
}

class Seylan extends CentralBank{
    int vat(){
        return 18;
    }
}

class Test2{
    public static void main(String[] args) {
        CentralBank cb;
        cb=new HNB();
        System.out.println("VAT: "+cb.vat());
        cb=new Seylan();
        System.out.println("VAT: "+cb.vat());
    }
}