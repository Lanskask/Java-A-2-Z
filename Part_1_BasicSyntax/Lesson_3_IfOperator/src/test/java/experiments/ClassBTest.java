package experiments;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by a1 on 14.10.16.
 */
public class ClassBTest {

    ClassA b1 = new ClassA(3, 4);
    ClassA b2 = new ClassA(2, 1);

    ClassB c1 = new ClassB(b1, b2);
    ClassB c2 = new ClassB(b1, b2);

    @Test
    public void showClassB() throws Exception {

        System.out.print("c1.b1.a1: " + c1.b1.a1);
        System.out.print("c1.b1.a2: " + c1.b1.a2);
        System.out.println();

        System.out.println("c1.b2.a1: " + c1.b2.a1);
        System.out.println("c1.b2.a2: " + c1.b2.a2);

        System.out.println();
        System.out.println("c2.b1.a1: " + c2.b1.a1);
        System.out.println("c2.b1.a2: " + c2.b1.a2);

        System.out.println();
        System.out.println("c2.b2.a1: " + c2.b2.a1);
        System.out.println("c2.b2.a2: " + c2.b2.a2);
    }

}