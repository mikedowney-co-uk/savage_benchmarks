package apfloat;

import org.apfloat.Apfloat;
import org.apfloat.ApfloatMath;

public class Savage {

    // woah this is slow compared to the others.
    static final double ITERS = 1.0;

    public static void main(String[] args) {
        Apfloat a = new Apfloat(1, 100);
        long t = System.currentTimeMillis();
        for (int i = 0; i < (int) ITERS; i++) {
            a = calc();
        }
        double took = (System.currentTimeMillis() - t) / ITERS; // time for 1 iteration in millis
        System.out.println(a.toString(true));
        System.out.println(took);
    }

    static Apfloat calc() {
        final int precision = 100;
        Apfloat a = new Apfloat(1, precision);
        Apfloat one = new Apfloat(1, precision);

        for (int i = 1; i <= 2499; i++) {
            a = ApfloatMath.tan(ApfloatMath.atan(ApfloatMath.exp(ApfloatMath.log(
                    ApfloatMath.sqrt(a.multiply(a)))
            ).precision(precision))).add(one);
            // need to re-assert precision otherwise we get an 'infinite expansion' error
        }
        return a;
    }
}
