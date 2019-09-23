package substringfinder;

/**
 * Created by 1 on 20.10.2016.
 */
public class Substringfinder {

    boolean contains(String origin, String sub) {
        char[] bigCharArray = origin.toCharArray();
        char[] subCharArray = sub.toCharArray();

        boolean founded = false;
        for (int i = 0; i < bigCharArray.length; i++) {
            if (bigCharArray[i] == subCharArray[0]) {
                founded = true;
                for (int k = 0; k < subCharArray.length; k++) {
                    if (bigCharArray[i + k] == subCharArray[k]) {
                        founded = true;
                    } else {
                        founded = false;
                    }
                }
            }
            if(founded == true) break;
        }

        return founded;
    }
}
