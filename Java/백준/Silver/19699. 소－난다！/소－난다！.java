import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    static int arr[];
    static ArrayList<Integer> list;
    static HashSet<Integer> set;
    static boolean visited[];
    static boolean isPrime[]; // 소수 여부를 저장할 배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n];
        visited = new boolean[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 1. 에라토스테네스의 체 미리 계산 (최대 9,000까지)
        precomputePrimes(9000);

        set = new HashSet<>();
        list = new ArrayList<>();

        // 중복 순조를 피하기 위해 start 인덱스를 추가한 조합(Combination) 형태 권장
        go(0, 0, 0);

        if (set.isEmpty()) {
            System.out.println(-1);
        } else {
            for (Integer i : set) {
                list.add(i);
            }
            Collections.sort(list);

            StringBuilder sb = new StringBuilder();
            for (Integer i : list) {
                sb.append(i).append(" ");
            }
            System.out.println(sb.toString().trim());
        }
    }

    // 에라토스테네스의 체 구현
    static void precomputePrimes(int max) {
        isPrime = new boolean[max + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false; // 0과 1은 소수가 아님

        for (int i = 2; i * i <= max; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= max; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }

    // start 인덱스를 인자로 받아 중복 조합 선택 방지 (백트래킹 최적화)
    static void go(int idx, int temp, int start) {
        if (idx == m) {
            if (isPrime[temp]) {
                set.add(temp);
            }
            return;
        }

        for (int i = start; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                go(idx + 1, temp + arr[i], i + 1);
                visited[i] = false;
            }
        }
    }
}