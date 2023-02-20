package org.example;

import java.io.*;

class Result {

    /*
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {
        // Write your code here
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        double alphabetSize = k/25+2;
        String alphabetDuplicate = "";
        String newAlphabet = "";
        String newCipher = "";
        for (int i=0; i<alphabetSize; i++) {
            alphabetDuplicate +=  alphabet;
        }
        for (int i=k; i<alphabet.length()+k; i++) {
            newAlphabet += alphabetDuplicate.charAt(i);
        }
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            int position = alphabet.indexOf(c);
            int positionUpper = alphabet.toUpperCase().indexOf(c);
            if (position>=0){
                newCipher += newAlphabet.charAt(position);
            }else{
                if(positionUpper>=0){
                    newCipher += newAlphabet.toUpperCase().charAt(positionUpper);
                }else{
                    newCipher += c;
                }
            }
        }
        return newCipher;
    }

}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = 10;

        String s ="www.abc.xy";

        int k = 87;

        String result = Result.caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
