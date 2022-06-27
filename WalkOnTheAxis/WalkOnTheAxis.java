package WalkOnTheAxis;

import java.util.ArrayList;

public class WalkOnTheAxis {
    public static void main(String[] args) {
        walkOnTheAxis(2, 1,2);
        walkOnTheAxis(3, 1,3,2);
    }

    //This is the code to solve the challenge
    static void walkOnTheAxis(int amountOfCases, int... distances){
        int currentDistance =0;
        ArrayList<Integer>result= new ArrayList<Integer>();
            for(int i : distances){
                int lightsOn = i+1;
                //Since N is the rightmost light that is on, and the leftmost light is (0,0) the first cycle is just N*2
                currentDistance=i*2;
                lightsOn -= 2;
                //While there are still lights on, keep tracking distance
                while(lightsOn>0){
                    currentDistance += lightsOn;
                    lightsOn--;
                }
                result.add(currentDistance);
                currentDistance=0;
            }

        for(Integer o: result){
            System.out.println(o);
        }
        System.out.println();
    }
}
