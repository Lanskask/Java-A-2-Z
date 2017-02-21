package ru.smurtazin.Collections.services.iterators;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by a1 on 10.02.17.
 */
public class IteratorSimple implements Iterator {

    private final int[] values;
    private int index = 0;

    public IteratorSimple(final int[] values) {
        this.values = values;
    }

    public void remove() {} // TODO: Needed cause of implemention

    // ------ Realization -----------
    /**
     * from: <a href="http://www.mkyong.com/java/how-to-determine-a-prime-number-in-java/">mkyong.com</>
     * @param n
     * @return
     */
    private boolean isPrime(int n) {
        //check if n is a multiple of 2
        if (n%2==0) return false;
        //if not, then just check the odds
        for(int i=3;i*i<=n;i+=2) {
            if(n%i==0)
                return false;
        }
        return true;
    }

    public boolean hasNext() {
        boolean answer = false;

        for (int hereIndex = this.index; hereIndex <= this.values.length - 1; hereIndex++) {
            if( this.isPrime(this.values[hereIndex] ) ) {
                answer = true;
                break;
            } else {
                continue;
            }
        }
        return answer;
    }

    public Object next() throws NoSuchElementException {
        int answer = 0;
        if(this.hasNext() ) {
            try {
                for( int hereIndex = this.index; hereIndex <= this.values.length - 1; hereIndex++) {
                    if( this.isPrime(this.values[hereIndex] ) ) {
                        answer = this.values[hereIndex];
                        break;
                    } else {
                        continue;
                    }
                }
            } catch (NoSuchElementException nsee) {
                throw nsee;
            }
        } else {
            throw new NoSuchElementException("Impossible movement");
        }
        return answer;
    }

}
