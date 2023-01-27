package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        BigInteger sumOne = BigInteger.ZERO;
        BigInteger sumTwo = BigInteger.ZERO;

        Collections.sort(arr);
        // Write your code here
        for (int i = 0; i <arr.size()-1 ; i++) {
            sumOne = sumOne.add(BigInteger.valueOf(arr.get(i)));
        }
        Collections.reverse(arr);
        for (int i = 0; i <arr.size()-1 ; i++) {
            sumTwo = sumTwo.add(BigInteger.valueOf(arr.get(i)));
        }
        System.out.println(sumOne.toString()+" "+sumTwo.toString());
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
