package removeduplicatesstring;

import static java.util.Arrays.copyOfRange;

/**
 * Created by a1 on 12.10.16.
 */
public class TheSameRemoveString {
    private String array[];

    String[] getArray() {
        return array;
    }

    TheSameRemoveString(String array[]) {
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
