interface A {
    void add();
}

interface B {
    void add();
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Imple obj = new Imple();
        obj.add();
    }
}

class Imple  implements B,A  {
    @Override
    public void add() {
        System.out.println("add");
    }
}
