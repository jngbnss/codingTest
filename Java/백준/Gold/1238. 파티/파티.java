import java.io.*;
import java.util.*;
public class Main {
	static final int INF = Integer.MAX_VALUE;
	static int n,m,x;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		 n = Integer.parseInt(st.nextToken());
		 m = Integer.parseInt(st.nextToken());
		 x = Integer.parseInt(st.nextToken());
		
		//n개의 집이있고
		list = new ArrayList[n+1];
		reverseList = new ArrayList[n+1];
		
		for(int i=0;i<=n;i++) {
			list[i] = new ArrayList<Edge>();
			reverseList[i] = new ArrayList<Edge>();
		}
		
		
		// a에서 b로 가는 비용이 나옴
		for(int i=0;i<m;i++) {
			st = new StringTokenizer(br.readLine());
			int a= Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int cost = Integer.parseInt(st.nextToken());
			list[a].add(new Edge(b,cost));
			reverseList[b].add(new Edge(a,cost));
		}
		
		//3.다익스트라 실행(x에서 시작)
		int[] distToX = dijk(reverseList);
		int[] distFromX = dijk(list);
		
		int maxTime = 0;
		for(int i=1;i<=n;i++) {
			if(distToX[i]!=INF && distFromX[i]!=INF) {
				maxTime = Math.max(maxTime, distToX[i]+distFromX[i]);
			}
		}
		System.out.println(maxTime);
		
		
	}
	
	//다익스트라 알고리즘 (인자값으로 리스트를 받아 공용으로 사용)
	static int[] dijk(ArrayList<Edge>[]adj) {
		PriorityQueue<Edge> pq = new PriorityQueue<Edge>();
		int[]dist = new int[n+1];
		Arrays.fill(dist,INF);
		
		dist[x] = 0;
		pq.add(new Edge(x,0));
		while(!pq.isEmpty()) {
			Edge current = pq.poll();
			
			if(current.cost>dist[current.to])continue;
			
			for(Edge next:adj[current.to]) {
				if(dist[next.to]>dist[current.to]+next.cost) {
					dist[next.to]= dist[current.to]+next.cost;
					pq.add(new Edge(next.to,dist[next.to]));
				}
			}
		}
		return dist;
	}
	static ArrayList<Edge>[]list;
	static ArrayList<Edge>[]reverseList;
	
	static class Edge implements Comparable<Edge>{
		int to;
		int cost;
		public Edge(int to, int cost) {
			super();
			this.to = to;
			this.cost = cost;
		}
		@Override
		public int compareTo(Edge o) {
			// TODO Auto-generated method stub
			return Integer.compare(this.cost, o.cost);
		}
		
		
	}

}
