//SUPER FUNCTIONAL STRINGS

package com.company;

import java.util.Scanner;

public class Main {

    public static String[] DifString(String[] strings, int l){
        String [] finals = new String[l];
        int count=0;
        boolean flag = true;
        for (int i=0; i<l; i++){
            String sam = strings[i];
            for (int j=0; j<i;j++){
                if (sam.equalsIgnoreCase(strings[j])){
                    flag = false;
                    break;
                }
                else flag = true;
            }
            if (flag){
                finals[count++] = sam;
            }
        }
        String[] finala = new String[count];

        if (count >= 0) System.arraycopy(finals, 0, finala, 0, count);
        return finala;
    }

    public static String[] SubString(String str, int n)
    {
        int count =0;
        int l = ((n*n)+n)/2;
        String [] possibleSubs = new String[l];
        for (int i = 0; i < n; i++)
            for (int j = i+1; j <= n; j++){
                possibleSubs[count++] = str.substring(i, j);
            }
        return DifString(possibleSubs,count);
    }

    public static int mainFunc(String[] strings){
        int sum = 0;
        for (String string : strings) {
            sum = (int) (sum + Math.pow(string.length(), string.chars().distinct().count()));
        }
        return sum%1000000007 ;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int tr = t;
        int[] a = new int[t];
        int ind = 0;
        while (tr>0) {
            String check = scanner.next();
            String[] oString = SubString(check, check.length());
            a[ind++] = mainFunc(oString);
            tr--;
        }
        while (tr<t){
            System.out.println(a[tr++]);
        }
    }
}
