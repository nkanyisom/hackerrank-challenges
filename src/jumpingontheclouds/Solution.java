package jumpingontheclouds;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
Determine the amount of energy Aerith has after the cloud game ends.
 */

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int e = 100;
        for(int i=0;i<n;i=i+k){
            if(c[i]==0){
                e=e-1;
            }
            else
                e=e-2-1;
        }

        System.out.println(e);
    }
}