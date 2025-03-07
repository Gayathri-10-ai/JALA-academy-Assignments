class A {
    int num = 10;

    void methodA1() {
        System.out.println("Method A1 - Specific to Class A");
    }

    void methodA2() {
        System.out.println("Method A2 - Specific to Class A");
    }

    void overrideMethod() {
        System.out.println("Override Method in Class A");
    }
}

class B extends A {
    int num = 20;

    void methodB1() {
        System.out.println("Method B1 - Specific to Class B");
    }

    void methodB2() {
        System.out.println("Method B2 - Specific to Class B");
    }

    @Override
    void overrideMethod() {
        System.out.println("Override Method in Class B");
    }
}

class C extends B {
    int num = 30;

    void methodC1() {
        System.out.println("Method C1 - Specific to Class C");
    }

    void methodC2() {
        System.out.println("Method C2 - Specific to Class C");
    }

    @Override
    void overrideMethod() {
        System.out.println("Override Method in Class C");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();
        C objC = new C();

        objA.methodA1();
        objA.methodA2();
        objA.overrideMethod();

        objB.methodA1();
        objB.methodA2();
        objB.methodB1();
        objB.methodB2();
        objB.overrideMethod();

        objC.methodA1();
        objC.methodA2();
        objC.methodB1();
        objC.methodB2();
        objC.methodC1();
        objC.methodC2();
        objC.overrideMethod();

        A ref1 = new B();
        A ref2 = new C();

        ref1.overrideMethod();
        ref2.overrideMethod();

        System.out.println("Data Members (Runtime Polymorphism Test)");
        System.out.println("A class num: " + objA.num);
        System.out.println("B class num: " + objB.num);
        System.out.println("C class num: " + objC.num);
        System.out.println("A ref to B num: " + ref1.num);
        System.out.println("A ref to C num: " + ref2.num);
    }
}