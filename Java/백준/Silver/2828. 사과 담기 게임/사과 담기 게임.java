//package algorithm.week2.q2828;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int t = scanner.nextInt();
        int l = 1;
        int r = l+m-1;
        int cnt = 0;
        for (int i = 0; i < t; i++) {
            int next = scanner.nextInt();
            int gap = 0;
            if(next>r){
                gap = next-r;
                cnt += gap;
                r+=gap;
                l+=gap;
                l = Math.min(l,n);
                r = Math.min(r,n);
            }else if(next<l){
                gap = l-next;
                cnt += gap;
                r-=gap;
                l-=gap;
                l = Math.max(l,1);
                r = Math.max(r,1);
            }
        }
        System.out.println(cnt);

    }
}
