package DIV3;
/**
 * Problem Link: https://www.codechef.com/NOV21C/problems/CHEAPFUEL
 */

/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class CHEAPFUEL {
    public static String solution(int x, int y, int a, int b, int k) {
        if ((x == y) && (a == b)) {
            return "SAME PRICE";
        } else if (x > y && a > b) {
            return "DIESEL";
        } else if (y > x && b > a) {
            return "PETROL";
        } else {
            int tempP = x;
            int tempD = y;
            while (k != 0) {
                tempP += a;
                tempD += b;
                k--;
            }
            return tempD > tempP ? "PETROL" : "DIESEL";
        }
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            t--;
            int x = sc.nextInt();
            int y = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int k = sc.nextInt();
            String ans = solution(x, y, a, b, k);
            System.out.println(ans);
        }
        sc.close();
    }
}
