public class CustomException {
    public static void main(String[] args) {
        try {
            throw new MyException("Exception handled");
        } catch (MyException e) {
            System.out.println("Caught");
            System.out.println(e.getMessage());
        }
    }
}

class MyException extends Exception{
    public MyException(String s){
        super(s);
    }
}