import java.math.BigInteger;

public class Lc_UniquePath {
    public int uniquePaths(int m, int n) {
        int a= m+n-2;
        int k = m-1;
        int x = a - k;
        BigInteger af1 = new BigInteger("1");
        BigInteger xf1 = new BigInteger("1");
        for(int i = 1; i <= a; i++){
            if(i > k){
                af1 = af1.multiply(BigInteger.valueOf(i));
            }
            if(i <= x){
                xf1 = xf1.multiply(BigInteger.valueOf(i));
            }
        }
        return af1.divide(xf1).intValue();
    }

}
