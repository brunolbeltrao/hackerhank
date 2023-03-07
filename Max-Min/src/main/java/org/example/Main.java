package org.example;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'maxMin' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY arr
     */

    static int maxMin(int k, List<Integer> arr) {
        List<Integer> comparators = new ArrayList<>();
        int Max = 0;
        int Min = 0;
        int result =-1;
        arr.sort(Comparator.naturalOrder());

        for (int i = 0; i < arr.size(); i++) {
            comparators.clear();
            comparators.add(arr.get(i));
            for (int j = 0; j < arr.size(); j++) {
                if (i==j){continue;}
                comparators.add(arr.get(j));
                if (comparators.size()==k){
                    Max = comparators.stream().sorted().collect(toList()).get(comparators.size()-1);
                    Min = comparators.stream().sorted().collect(toList()).get(0);
                    if(result > Max - Min || result ==-1){
                        result = Max - Min;
                    }
                    comparators.clear();
                    comparators.add(arr.get(j));
                }
            }
        }
        return result;
    }


}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = 100;

        int k = 25;

        List<Integer> arr = Arrays.asList(7652,
                1377,
                7089,
                2736,
                4748,
                1615,
                4235,
                3461,
                3895,
                8328,
                175,
                8131,
                4877,
                5606,
                4730,
                3563,
                2210,
                966,
                7842,
                9551,
                152,
                9079,
                5366,
                2158,
                1236,
                8046,
                2660,
                5528,
                544,
                6965,
                2428,
                8197,
                4694,
                5869,
                7285,
                5794,
                3837,
                1521,
                9255,
                4084,
                9849,
                5782,
                2215,
                4726,
                1388,
                3297,
                4641,
                9950,
                615,
                8836,
                5853,
                768,
                4267,
                1219,
                9278,
                5503,
                9265,
                8290,
                7383,
                6162,
                5255,
                6163,
                711,
                6301,
                2033,
                7996,
                2095,
                2222,
                9517,
                7702,
                6306,
                5718,
                3484,
                4873,
                6797,
                1224,
                8170,
                1438,
                1175,
                8785,
                274,
                3380,
                5905,
                4541,
                4600,
                5183,
                6396,
                3865,
                3473,
                3780,
                27,
                5080,
                9943,
                738,
                7733,
                8328,
                5087,
                9828,
                550,
                4604);

        //int result = Result.Solution(k);


    }
}
