abstract class AbstractClass {
    abstract void abstractMethod();

    void nonAbstractMethod() {
        System.out.println("Non-Abstract Method in AbstractClass");
    }
}

class ChildClass extends AbstractClass {
    void abstractMethod() {
        System.out.println("Abstract Method Implemented in ChildClass");
    }

    void childMethod() {
        System.out.println("Non-Abstract Method in ChildClass");
    }

    void callAbstract() {
        abstractMethod();
    }

    void callNonAbstract() {
        nonAbstractMethod();
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        ChildClass childObj = new ChildClass();

        childObj.nonAbstractMethod();
        childObj.abstractMethod();
        childObj.childMethod();
        childObj.callAbstract();
        childObj.callNonAbstract();
    }
}