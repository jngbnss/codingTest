#include<bits/stdc++.h>
using namespace std;
int n,k;
int visited[200004];
int arr[200004];
int cnt;

int main(){
	cin>>n>>k;
	arr[n] = 1;
	if(n==k){
		cout<<0<<'\n'<<1;
		return 0;
	}
	queue<int>q;
	q.push(n);
	visited[n] = 1;
	while(q.size()){
		int now = q.front();
		q.pop();
		for(int next:{now-1,now+1,now*2}){
			if(next<0||next>200001)continue;
			if(!visited[next]){
				visited[next] = visited[now]+1;
				arr[next] =arr[now];
				q.push(next);
			}
			else if(visited[next] == visited[now]+1){
				arr[next]+=arr[now];
			}
		}
	}
	
	cout<<visited[k]-1<<'\n'<<arr[k];
}
