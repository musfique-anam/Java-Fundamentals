class Animal{
    Animal(){
        System.out.println("This is Animal class constructor.");
    }
    void bark(){
        System.out.println(" ");
    }
}

class Tiger extends Animal{
    Tiger(){
        super();
    }
    void bark(){
        System.out.println("Roar");
    }
}

public class Driver {
    public static void main(String[] args) {
        Tiger obj = new Tiger();
        obj.bark();
    }
}
