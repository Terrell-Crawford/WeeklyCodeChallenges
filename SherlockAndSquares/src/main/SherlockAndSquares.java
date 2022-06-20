package SherlockAndSquares.src.main;
import java.util.*;
import java.util.stream.IntStream;

import static java.lang.Math.*;

public class SherlockAndSquares {
    public static void main(String[] args) {
        int a= 24;
        int b= 49;
        System.out.println(perfectSquare(a, b));
         a=17;
         b=24;
        System.out.println(perfectSquare(a, b));
        a=1;
        b=8000;
        System.out.println(perfectSquare(a, b));
        a=1;
        b=1000000000;
        System.out.println(perfectSquare(a, b));

    }
    public static int perfectSquare(int a, int b){
        //To find all perfect squares in a range all we have to do is find all of the perfect squares for both endpoints, then find the difference of them
        double upperSquares= sqrt(b);
        double lowerSquares= ceil(sqrt(a));
        //This calculation leaves out the 1st perfect square, so we must add one to account for it
        double result = upperSquares-lowerSquares+1;
        return (int)result;
    }


}
