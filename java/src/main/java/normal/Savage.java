package normal;

/*
 To use graal, compile as normal then cd to the target dir and type
 /path/to/graal/bin/native-image normal.Savage
 then execute: ./normal.savage
 */

public class Savage {
    public static void main(String[] args){
        double a = 0;
        long t = System.currentTimeMillis();
        for(int i=0; i<10000; i++){
            a = calc();
        }
        double took = (System.currentTimeMillis() - t)/10000.0; // time for 1 iteration in millis
        System.out.println(a);
        System.out.println(took);
    }

    static double calc(){
        double a=1;
        for(int i=1; i<=2499; i++){
            a = Math.tan(Math.atan(Math.exp(Math.log(Math.sqrt(a*a))))) + 1;
        }
        return a;
    }
}
