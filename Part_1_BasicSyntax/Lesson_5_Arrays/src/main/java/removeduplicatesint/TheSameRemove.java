package removeduplicatesint;

import static java.util.Arrays.copyOfRange;

/**
 * Created by a1 on 12.10.16.
 */
public class TheSameRemove {
    private int array[];

    int[] getArray() {
        return array;
    }

    TheSameRemove(int array[]) {
        this.array = array;
    }

    private void removeIElement(int i) {
        for (; i < array.length - 1; i++) {
            array[i] = array[i+1];
        }
        array = copyOfRange(array, 0, array.length - 1 );
    }

    void removingTheSame() {
        for (int j = 0; j < array.length - 1; j++) {
            for (int k = j + 1; k < array.length; k++) {
                if (array[j] == array[k] && (j != k)) {
                    removeIElement(k);
                    k--;
                }
            }
        }
    }

}
