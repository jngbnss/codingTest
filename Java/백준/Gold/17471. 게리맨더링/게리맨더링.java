import java.io.*;
import java.util.*;
//20분 53초

public class Main {
	static int n;
	static ArrayList<Integer>[] list;
	static int ret = Integer.MAX_VALUE;
	static int[] visited;
	static int[] populations;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		populations = new int[n + 1];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= n; i++) {
			populations[i] = Integer.parseInt(st.nextToken());

		}

		list = new ArrayList[n + 1];
		visited = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			list[i] = new ArrayList<>();
			st = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(st.nextToken());
			for (int j = 0; j < m; j++) {
				list[i].add(Integer.parseInt(st.nextToken()));
			}
		}

		go(1);
		System.out.println(ret == Integer.MAX_VALUE ? -1 : ret);
	}

	static void go(int idx) {
		
		if (idx == n + 1) {
			
			ArrayList<Integer> listA = new ArrayList<Integer>();
			ArrayList<Integer> listB = new ArrayList<Integer>();
			
			
			for (int i = 1; i <= n; i++) {
				if (visited[i] == 1) {
					listA.add(i);
				} else {
					listB.add(i);
				}
			}
			// 비어있는 거 x
			if (listA.isEmpty() || listB.isEmpty())
				return;

			if (!isCon(listA) || !isCon(listB))
				return;

			cal();
			return;

		}
		visited[idx] = 1;
		go(idx + 1);
		visited[idx] = 0;
		go(idx + 1);
	}

	static boolean isCon(ArrayList<Integer> sublist) {
		int size = sublist.size();
		int cnt = 1;
		boolean v[] = new boolean[n + 1];
		ArrayDeque<Integer> q = new ArrayDeque<Integer>();
		q.offer(sublist.get(0));
		v[sublist.get(0)] = true;

		while (!q.isEmpty()) {
			Integer now = q.poll();

			for (int next : list[now]) {
				if (!v[next] && sublist.contains(next)) {
					v[next] = true;
					cnt++;
					q.offer(next);
				}
			}
		}

		return cnt == size;
	}

	static void cal() {
		int sumA = 0;
		int sumB = 0;
		for (int i = 1; i <= n; i++) {
			if (visited[i] == 1) {
				sumA += populations[i];
			} else
				sumB += populations[i];
		}
		ret = Math.min(ret, Math.abs(sumA - sumB));
	}
}
