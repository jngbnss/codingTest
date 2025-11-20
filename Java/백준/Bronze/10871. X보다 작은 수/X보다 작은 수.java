// package baekjoon.b5.q10871;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        for(int i=0;i<n;i++){
            int a = scanner.nextInt();
            if(a<x){
                System.out.print(a+" ");
            }
        }
    }
}
