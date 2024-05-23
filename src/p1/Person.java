public class Person implements Age,Name {

    @Override
    public void displayAge(int age) {
      System.out.println("Age: "+age );
    }

    @Override
    public void displayName(String name) {
        System.out.println("Name: "+name );
    }

    public static void main(String[] args) {
        Person ob=new Person();
        ob.displayAge(18);
        ob.displayName("nanditha");
    }
}
