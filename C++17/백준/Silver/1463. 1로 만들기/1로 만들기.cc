#include<bits/stdc++.h>
using namespace std;
int n;
const int mx=1000000;
int arr[mx+4],visited[mx+4];
queue<int>q;
void bfs(int now){
	visited[now] = 1;
	q.push(now);
	while(q.size()){
		int now = q.front();
		q.pop();
		if(now%3==0&&!visited[now/3]){
			visited[now/3] = visited[now]+1;
			q.push(now/3);
		}if(now%2==0&&!visited[now/2]){
			visited[now/2] = visited[now]+1;
			q.push(now/2);
		}if(!visited[now-1]){
			if(now-1 <1) continue;
			visited[now-1] = visited[now]+1;
			q.push(now-1);
		}
	}
}

int main(){
	cin>>n;
	bfs(n);
	for(int i=n;i>0;i--){
//		cout<<i<<" : "<<visited[i]<<'\n';
	}
	cout<<visited[1]-1;
}
