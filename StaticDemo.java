class StaticExample {
    static int staticVar = 10;

    void modifyInstance() {
        staticVar += 5;
    }

    static void modifyClass() {
        staticVar += 10;
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        System.out.println("Accessing through class: " + StaticExample.staticVar);

        StaticExample obj1 = new StaticExample();
        System.out.println("Accessing through instance: " + obj1.staticVar);

        obj1.modifyInstance();
        System.out.println("After modifying in instance: " + StaticExample.staticVar);

        StaticExample.modifyClass();
        System.out.println("After modifying in class: " + StaticExample.staticVar);
    }
}