package DIV3;
/**
 * Problem Link: https://www.codechef.com/NOV21C/problems/HILLSEQ/
 */

/* package codechef; // don't place package name! */
import java.io.*;
import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class HILLSEQ {

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        FastReader s = new FastReader();
        int t = s.nextInt();
        while (t != 0) {
            t--;
            int n = s.nextInt();
            TreeMap<Long, Long> hm = new TreeMap<>();
            Long max = Long.valueOf(-1);
            for (int i = 0; i < n; i++) {
                Long x = s.nextLong();
                if (x > max)
                    max = Long.valueOf(x);
                if (hm.containsKey(x)) {
                    hm.put(x, hm.get(x) + 1);
                } else {
                    hm.put(x, Long.valueOf(1));
                }
            }
            boolean flag = true;
            if (hm.get(max) >= 2) {
                flag = false;
                System.out.println("-1");
            } else {
                for (Map.Entry<Long, Long> entry : hm.entrySet()) {
                    if (entry.getValue() > 2) {
                        System.out.println("-1");
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) {
                for (Map.Entry<Long, Long> entry : hm.entrySet()) {
                    if (entry.getValue() == 2) {
                        System.out.print(entry.getKey()+" ");
                    }
                }

                ArrayList<Long> keys = new ArrayList<Long>(hm.keySet());
                for (int i = keys.size() - 1; i >= 0; i--) {
                    System.out.print(keys.get(i)+" ");
                }
            }
            System.out.print("\n");
        }
    }
}
