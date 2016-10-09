package removeTheSame;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by a1 on 08.10.16.
 */
public class ArrayToSameRemoveTest {

    int[] array = {1, 1, 2, 3, 4, 4, 5, 5, 6, 7}; // 1, 4, 5 - are doubled

    ArrayToSameRemove myArrayToSameRemove = new ArrayToSameRemove(array);

    // в объект myArrayToSameRemove "закидывается" руками созданный массив
    // array = {1, 1, 2, 3, 4, 4, 5, 5, 6, 7}

    // --------------------------
    // Убирание из этого массива одинаковых
    // if ( a[i] == a[i+1]) {
    //
    //     подинуть на 1 влево
    // }
    // Функция array_Cleaning: findTheSame - removeToTheLeft
//        myArrayToSameRemove.cleaningFunction();
    // --------------------------

//        myArrayToSameRemove.printArray(array, "Result With out ");




    @Test
    public void cleaningFunction() throws Exception {
        myArrayToSameRemove.cleaningFunction();
        array = myArrayToSameRemove.getNewArray();

        boolean check = true;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && (i != j) ) {
                    check = false;
                }
            }
        }

        // Uncomment to view result
        myArrayToSameRemove.printArray(array, "Initial");

        assertTrue( check );

    }

}