import java.io.*;

class Result {

    /*
     * Complete the 'dayOfProgrammer' function below.
     * The function is expected to return a STRING.
     * The function accepts INTEGER year as parameter.
     */

    public static String dayOfProgrammer(int year) {
        String date = "13.09.";
        boolean leapYear = false;
        if(year == 1918)                      //During 1918
            return "26.09.1918";
        else if(year<1918){                  //Before 1918
            if(year%4 == 0)
                leapYear = true;
        }
        else if(year>1918){                 //After 1918
            if((year%4 == 0 && year%100!=0)|| year%400 == 0)
                leapYear = true;
        }
        
        if(leapYear == true){
            date = "";
            date += "12.09.";
        } 
        return date + year;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
