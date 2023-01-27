package org.example;

import java.io.*;

class Result {

    /*
     * Complete the 'pageCount' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER p
     */

    public static int pageCount(int n, int p) {
        int result =0;
        int resultDec =0;
        // Write your code here
        //Crescente
        if (p % 2 == 0){//PAR
            result  = p/2;
        }else{
            result  = (p-1)/2;
        }
        //Decrescente
        if (n % 2 == 0){
            resultDec = (n+1 - p)/2;
        }else{
            resultDec = (n - p)/2;
        }

        if (resultDec < result){
            result = resultDec;
        }

        return result;
    }

}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.pageCount(n, p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
