package experiments;

/**
 * Created by a1 on 14.10.16.
 */
public class ClassB {
//    ClassA b1 = new ClassA(3, 1);
//    ClassA b2 = new ClassA(4, 2);
    ClassA b1, b2;

    public ClassB(ClassA b1, ClassA b2) {
        this.b1 = b1;
        this.b2 = b2;
    }

    void showClassB() {
        System.out.println(b1);
        System.out.println(b2);
    }
}
