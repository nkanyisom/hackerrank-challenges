package angryprofessor;


/**
 * A Discrete Mathematics professor has a class of students.
 * Frustrated with their lack of discipline, he decides to cancel class if fewer than some number of students
 * are present when class starts. Arrival times go from on time (arrivalTime <= 0) to arrived late (arrivalTime > 0).
 * <p>
 * Given the arrival time of each student and a threshhold number of attendees, determine if the class is canceled.
 * <p>
 * Input Format
 * <p>
 * The first line of input contains , the number of test cases.
 * <p>
 * Each test case consists of two lines.
 * <p>
 * The first line has two space-separated integers,  and , the number of students (size of ) and the cancellation threshold.
 * The second line contains  space-separated integers (a[1],a[2],......a[n]) describing the arrival times for each student.
 */


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int T = input.nextInt();

        //for(int i = 0;i<T;i++)
        for (int i = 0; i < T; i++) {
            int n = input.nextInt();
            int k = input.nextInt();
            int onTime = 0;
            for (int j = 0; j < n; j++) {
                int arrivalTime = input.nextInt();
                if (arrivalTime <= 0) {
                    onTime++;
                }
            }
            if (onTime >= k) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }

}
