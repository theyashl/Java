//CHOCOLATE FEAST

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int tr = t;
        int [] a = new int[t];
        int ind=0;
        while (tr>0){
            int n = scanner.nextInt();
            int c = scanner.nextInt();
            int m = scanner.nextInt();
            if (((n<2)||(c<1))||(m<2)){
                System.out.println("Received Wrong Input!");
                System.out.println("Terminating Program!!");
                System.exit(0);
            }
            int cb = n/c;
            int w = cb;
            while (m<=w){
               w = w-m;
               cb++;
               w++;
            }
            a[ind++] = cb;
            tr--;
        }
        while (tr<t){
            System.out.println(a[tr++]);
        }
    }
}
