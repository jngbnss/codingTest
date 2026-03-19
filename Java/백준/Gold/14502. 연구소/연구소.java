import java.io.*;
import java.util.*;

public class Main {
	static int arr[][];
	static int visited[][];
	static ArrayList<int[]> virusList;
	static int dy[] = {-1,0,1,0};
	static int dx[] = {0,-1,0,1};
	
	static int n ;
	static int m;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		ArrayList<int[]> wallList = new ArrayList<>();
		virusList = new ArrayList<>();
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n][m];
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<m;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(arr[i][j]==0) {
					wallList.add(new int[]{i,j});
				}else if(arr[i][j] ==2) {
					virusList.add(new int[] {i,j});
				}
			}
		}
		
		int ret =0;
		for(int i = 0;i<wallList.size();i++) {
			for(int j=0;j<i;j++) {
				for(int k=0;k<j;k++) {
					arr[ wallList.get(i)[0] ][ wallList.get(i)[1] ] = 1;
					arr[ wallList.get(j)[0] ][ wallList.get(j)[1] ] = 1;
					arr[ wallList.get(k)[0] ][ wallList.get(k)[1] ] = 1;
					//
					visited = new int[n][m];
					goVirusCheckVisited();
					ret = Math.max(ret, checkSafePlace());
					arr[ wallList.get(i)[0] ][ wallList.get(i)[1] ] = 0;
					arr[ wallList.get(j)[0] ][ wallList.get(j)[1] ] = 0;
					arr[ wallList.get(k)[0] ][ wallList.get(k)[1] ] = 0;
				}
			}
		}
		System.out.println(ret);
	}
	
	static void goVirusCheckVisited() {
		for(int i=0;i<virusList.size();i++) {
			dfs(virusList.get(i)[0],virusList.get(i)[1]);
		}

	}
	
	static void dfs(int y,int x) {
		visited[y][x] = 1;
		for(int i=0;i<4;i++) {
			int ny = y+dy[i];
			int nx = x+dx[i];
			
			if(ny<0||nx<0||ny>=n||nx>=m) continue;
			if(visited[ny][nx]==0&&arr[ny][nx]!=1) {
				dfs(ny,nx);
			}
		}
	}
	static int checkSafePlace() {
		int cnt =0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(arr[i][j]==0&&visited[i][j]==0)
					cnt++;
			}
		}
		
		return cnt;
	}
	
}
