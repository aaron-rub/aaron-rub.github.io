package src.week3.nsorts;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Comparator;

public class BubbleSorts {
    private static ArrayList<Integer> inputArray = new ArrayList<Integer>();

    public BubbleSorts(ArrayList<Integer> inputArray){
        BubbleSorts.inputArray = inputArray;
    }

    public static ArrayList<Integer> getInputArray() {
        return inputArray;
    }

    public static void bubblesrt(ArrayList<Integer> inputArray)
    {
        int temp;
        if (inputArray.size()>1) // check if the number of orders is larger than 1
        {
            for (int x=0; x<inputArray.size(); x++) // bubble sort outer loop
            {
                for (int i=0; i < inputArray.size()-i; i++) {
                    if (inputArray.get(i).compareTo(inputArray.get(i+1)) > 0)
                    {
                        temp = inputArray.get(i);
                        inputArray.set(i,inputArray.get(i+1) );
                        inputArray.set(i+1, temp);
                    }
                }
            }
        }

    }


    public static void sort(ArrayList<Integer> a) {
        BubbleSorts bs = new BubbleSorts(a);
    }
}