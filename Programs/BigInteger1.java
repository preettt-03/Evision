import java.math.BigInteger;
public class BigInteger1 {
    public static void main(String[] args) {
        BigInteger big1 = new BigInteger("123123110101010110023123123");
        BigInteger big2 = new BigInteger("123123110101010110023123123");

        BigInteger sum = big1.add(big2);
        BigInteger sub = big1.subtract(big2);
        BigInteger mul = big1.multiply(big2);
        BigInteger div = big1.divide(big2);
        BigInteger rem = big1.remainder(big2);

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(rem);

    }
}
