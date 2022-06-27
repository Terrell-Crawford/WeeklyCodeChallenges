package WalkOnTheAxis;

import java.util.ArrayList;

public class WalkOnTheAxis {
    public static void main(String[] args) {
        getDistance(2, 1,2);
        getDistance(3, 1,3,2);
    }

    static void getDistance(int amountOfCases, int... distances){
        int currentDistance =0;
        ArrayList<Integer>result= new ArrayList<Integer>();
        if(amountOfCases==0){
            result.add(0);
        }else{
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
        }
        for(Integer o: result){
            System.out.println(o);
        }
        System.out.println();
    }
}
