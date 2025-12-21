#include<bits/stdc++.h>
using namespace std;
const int max_n = 200004;
int n,k;
int arr[max_n],visited[max_n];
queue<int>q;

void bfs(int n){
	visited[n] = 1;
	q.push(n);
	
	while(q.size()){
		int now = q.front();
		q.pop();
		for(int next : {now-1,now+1,2*now}){
			if(next<0||next>=max_n) continue;
			if(!visited[next]){
				visited[next] = visited[now]+1;
				q.push(next);
			}
		}
	}
}



int main(){
	cin>>n>>k;
	
	bfs(n);
//	for(int i=0;i<100;i++){
//		cout<<i<<' '<<visited[i]<<'\n';
//	}
	cout<<visited[k]-1;
}