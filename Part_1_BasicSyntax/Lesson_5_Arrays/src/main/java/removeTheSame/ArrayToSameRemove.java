package removeTheSame;

/**
 * Created by a1 on 08.10.16.
 */
public class SameRemover {

    int[] generateArray() {
        int[] array = new int[10];
        for(int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round( Math.random()*100 );
        }
        return array;
    }

    void printArray(int array[], String arrayTag) {
        System.out.print(arrayTag + " array:\n\t");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    void removeTheSame(int array[]) {

//        int a, b;
//        a = array[i];
//        b = array[j];
//        if ( a == b ) {
//
//        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if( array[i] == array[j] && i != j) {
                    System.out.println("array["+ i +"] = array[" + "].");
                }
            }
        }
    } // end removeTheSame

}
