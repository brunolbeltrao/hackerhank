package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code herez'
        double positive = (double) arr.stream().filter(c -> c.intValue() > 0).count();
        double negative = (double) arr.stream().filter(c -> c.intValue() < 0).count();
        double zero     = (double) arr.stream().filter(c -> c.intValue() == 0).count();
        double size     = (double) arr.stream().count();
        System.out.println(positive/size);
        System.out.println(negative/size);
        System.out.println(zero/size);
    }

}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
