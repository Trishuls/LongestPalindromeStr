public class Runnables extends Test implements Runnable{

    @Override
    public void run() {
        System.out.println("Run method executed by child class");
    }

    public static void main(String[] args) {
        Runnables r = new Runnables();
        r.print();

        Thread ti = new Thread(r);
        ti.start();
        System.out.println("Main method executed by main thread");
    }
}

class Test{
    public static void print(){
        System.out.println("Outside class");
    }
}