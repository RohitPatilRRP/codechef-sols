package DIV3;
/*
 * Problem Link: https://www.codechef.com/NOV21C/problems/MAKEPAL
 */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class MAKEPAL {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            t--;
            int n = sc.nextInt();
            int total = 0;
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x % 2 != 0)
                    total++;
            }
            if (total % 2 == 1)
                total--;
            System.out.println(total / 2);
        }
        sc.close();
    }
}
