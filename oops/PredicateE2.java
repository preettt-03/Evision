import java.util.function.Predicate;

public class PredicateE2 {
    public static void main(String[] args) {
        Predicate<Integer> isEven = num -> num % 2==0;
        Predicate<Integer> isPositive = num -> num>0;
        Predicate<Integer> isPandE = isEven.and(isPositive);

        System.out.println(isPandE.test(4));
        System.out.println(isPandE.test(-4));

        
        Predicate<Integer> isEorN = isEven.or(isPositive);

        System.out.println(isEorN.test(4));
        System.out.println(isEorN.test(-4));

        Predicate<Integer> isOdd =isEven.negate();

        System.out.println(isOdd.test(4));


        Predicate<String> isPreet = Predicate.isEqual("preet");

        System.out.println(isPreet.test("hello"));
        System.out.println(isPreet.test("preet"));



    }
}
