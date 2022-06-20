package SherlockAndSquares.src.main.java;
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
        double upperSquares= sqrt(b);
        double lowerSquares= ceil(sqrt(a));
        double result = upperSquares-lowerSquares+1;
        return (int)result;
    }


}
