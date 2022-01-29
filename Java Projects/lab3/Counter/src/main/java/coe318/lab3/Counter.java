/**
 *
 * @author Rahaj Chowdhury
 * Student ID: 500898736
 */
package coe318.lab3;
public class Counter {
    int m;
    int n;
    int o;
    Counter r;
    
    public Counter(int modulus, Counter left) {
        m = modulus;
        r = left;
    }


    /**
     * @return the modulus
     */
    public int getModulus() {
        return m;
    }

    /**
     * Returns the Counter to the left attached to this
     * Counter.  Returns null if there is no Counter
     * to the left.
     * @return the left
     */
    public Counter getLeft() {
        return r;
    }

    /**
     * @return the digit
     */
    public int getDigit() {
        return n;
    }

    /**
     * @param digit the digit to set
     */
    public void setDigit(int digit) {
        n = digit;
    }

    /**
     * Increment this counter.  If it rolls over,
     * its left Counter is also incremented if it
     * exists.
     */
    public void increment() {
        n++;
        if(n==m){
            n=0;
            if(r != null){
                r.n++;
            }
        }
    
    }

    /** Return the count of this Counter combined
     * with any Counter to its left.
     *
     * @return the count
     */
    public int getCount() {
        if(r==null){
            o=n;
        }else{
            o=n+(m*r.n);
        }
        return o;
    }

    /** Returns a String representation of the Counter's
     * total count (including its left neighbour).
     * @return the String representation
     */
    @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE
        return "" + getCount();
    }

}
