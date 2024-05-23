import java.util.HashMap;

public class MapInternal {
    public static void main(String[] args) {
        HashMap<Student,Integer> hm = new HashMap<>();
        Student s1 = new Student();
        s1.setAge(10);
        s1.setName("A");
        hm.put(s1,1);

        Student s2 = new Student();
        s1.setAge(10);
        s1.setName("A");
        hm.put(s2,1);
        System.out.println(hm);
    }
}

class Student{
    public Student() {
    }

    int age;
    String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}