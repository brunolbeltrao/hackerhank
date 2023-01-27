package org.example;

import java.io.*;
import java.util.ArrayList;

class Result {

    /*
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {
        // Write your code here
        String res = "";
        ArrayList<String> alphabet = new ArrayList();
        alphabet.add(" ");
        for(char c = 'A'; c <= 'Z'; ++c) {
            alphabet.add(String.valueOf(c));
        }
        for (String letter: alphabet) {
            if (!s.contains(letter) && !s.contains(letter.toLowerCase())){
                return "not pangram";
            }
        }
        return "pangram";
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
