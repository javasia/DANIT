package minMax;

public class minMaxWithoutMemory {

    public int[] minMax (int m, int n){
        n = m + n;
        m ^= Math.max (m, n - m) ^ m; // setting m to max
        n -= m;                       // setting n to min
    return new int[] {n, m};
    }

}
