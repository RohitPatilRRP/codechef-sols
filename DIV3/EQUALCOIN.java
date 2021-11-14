package DIV3;
/**
 * Problem Link: https://www.codechef.com/NOV21C/problems/EQUALCOIN
 */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class EQUALCOIN {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            t--;
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x == 0 && y % 2 == 0) {
                System.out.println("yes");
            } else if (x == 0 && y % 2 != 0) {
                System.out.println("no");
            } else if ((x + 2 * y) % 2 == 0) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
        sc.close();
    }
}
