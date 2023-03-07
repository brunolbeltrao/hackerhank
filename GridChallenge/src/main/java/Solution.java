import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'gridChallenge' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING_ARRAY grid as parameter.
     */

    public static String gridChallenge(List<String> grid) {
        // Write your code here
        IntStream.range(0,grid.size()-1).forEach(i->{
            char[] arrayOfString = grid.get(i).toCharArray();
            Arrays.sort(arrayOfString);
            String orded = new String(arrayOfString);
            grid.set(i,orded);
        });
        String a = grid.get(0);
        String b = grid.get(2);

        return a.compareTo(b) <0 ? "YES":"NO" ;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        //int t = Integer.parseInt(bufferedReader.readLine().trim());



        String result = Result.gridChallenge(Arrays.asList("mpxz",
                "abcd",
                "wlmf"));

        System.out.println(result);


    }
}
