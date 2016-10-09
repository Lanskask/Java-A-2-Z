package removeTheSame;

import java.util.Arrays;

import static java.util.Arrays.copyOfRange;

/**
 * Created by a1 on 08.10.16.
 */
public class MainRemover {

    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 4, 4, 5, 5, 6, 7}; // 1, 4, 5 - are doubled

        ArrayToSameRemove myArrayToSameRemove = new ArrayToSameRemove(array);
//        int[] array = myArrayToSameRemove.generateArray();

        // в объект myArrayToSameRemove "закидывается" руками созданный массив
        // array = {1, 1, 2, 3, 4, 4, 5, 5, 6, 7}
        myArrayToSameRemove.printArray(array, "Initial");

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

//      int[] new1Array = {1, 2, 3, 4, 5, 6, 7};
//      @since 1.6+
        myArrayToSameRemove.cleaningFunction();
//        int[] newArray = myArrayToSameRemove.getNewArray();
        myArrayToSameRemove.printArray(myArrayToSameRemove.getNewArray(), "Result New Array");
//        myArrayToSameRemove.printArray(array, "Result Arrayt ");

    }

}
