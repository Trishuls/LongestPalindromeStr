public class Threads extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++){
            System.out.println("run method is executed in child thread: "+i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Threads t1 = new Threads();
        Threads t2 = new Threads();
        t1.start();
        t2.start();
        System.out.println("Main method started by main thread");
    }
}
