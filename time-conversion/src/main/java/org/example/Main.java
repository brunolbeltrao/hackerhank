package org.example;

import java.io.*;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        String time = s.substring(0,8);
        String typeTime = String.valueOf(s.charAt(8));
        String beginTime = s.substring(0,2);
        String endTime = s.substring(2,8);

        if (typeTime.equals("P") && Integer.parseInt(beginTime)<12){
            time = String.valueOf(Integer.parseInt(beginTime)+12)+endTime;
        }

        if (typeTime.equals("A") && Integer.parseInt(beginTime)>=12){
            time = "00"+endTime;
        }

        return time;
    }

}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
