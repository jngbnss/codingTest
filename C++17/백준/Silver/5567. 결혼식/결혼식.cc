#include<bits/stdc++.h>
using namespace std;
int n,m,r;
const int max_n = 5004;

int a,b;
vector<int>v[max_n];
int visited[max_n];
queue<int>q;
int cnt = 1;
void bfs(int x){
	visited[x] = 1;
	q.push(x);
	while(q.size()){
		int x = q.front();
		q.pop();
		for(auto i:v[x]){
			if(!visited[i]){
				visited[i] = visited[x]+1;
				q.push(i);
			}
		}
	}
}

int main(){
	cin>>n>>m;
	for(int i=0;i<m;i++){
		cin>>a>>b;
		v[a].push_back(b);
		v[b].push_back(a);
	}
	bfs(1);
	int ret =0;
	for(int i=2;i<=n;i++){
		if(visited[i]>0&&visited[i]<=3) ret++;
	}
	cout<<ret;
}