package ru.vsu.csf.Sashina;

import java.math.*;

public class Karatsuba {

    public static BigInteger multiply (BigInteger x, BigInteger y, int n) {
        if (n == 1) {
            return x.multiply(y);
        } else {
            int j = n/2;
            BigInteger k = BigInteger.valueOf((long) Math.pow(10, j));
            BigInteger l = BigInteger.valueOf((long) Math.pow(10, n));
            BigInteger a = x.divide(k);
            BigInteger b = x.mod(k);
            BigInteger c = y.divide(k);
            BigInteger d = y.mod(k);
            BigInteger ac = multiply(a, c, j);
            BigInteger bd = multiply(b, d, j);
            BigInteger pq = multiply(a.add(b), c.add(d), j);
            BigInteger abcd = pq.subtract(ac).subtract(bd);
            return ac.multiply(l).add(abcd.multiply(k)).add(bd);
        }
    }
}
