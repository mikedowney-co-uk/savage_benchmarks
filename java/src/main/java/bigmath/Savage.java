package bigmath;

import java.math.BigDecimal;
import java.math.MathContext;
import ch.obermuhlner.math.big.BigDecimalMath;

public class Savage {

    static final double ITERS = 10.0;

    static void main(String[] args){
        BigDecimal a = null;
        long t = System.currentTimeMillis();
        for(int i=0; i<(int)ITERS; i++){
            a = calc();
        }
        double took = (System.currentTimeMillis() - t)/ITERS; // time for 1 iteration in millis
        System.out.println(a);
        System.out.println(took);
    }

    static BigDecimal calc(){
        MathContext mc = new MathContext(100);

        BigDecimal a = new BigDecimal(1);
        BigDecimal one = new BigDecimal(1);

        for(int i=1; i<=2499; i++){
            a = BigDecimalMath.tan(
                    BigDecimalMath.atan(
                            BigDecimalMath.exp(BigDecimalMath.log(
                                    BigDecimalMath.sqrt(a.multiply(a, mc), mc), mc), mc), mc), mc).add(one);
        }
        return a;
    }
}
