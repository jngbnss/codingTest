#include<bits/stdc++.h>
using namespace std;
int n,m,k;
int temp;


int main(){
	cin>>n>>m>>k;
	priority_queue<int,vector<int>,greater<int>>pq;//[m];
	for(int i=0;i<m;i++){
		pq.push(0);
	}
	for(int i=0;i<n;i++){
		cin>>temp;
		int sum = pq.top()+temp;
		pq.pop();
		pq.push(sum);
	}
	if(pq.top()>k) cout<<"GO";
	else cout<<"WAIT";
	
//	for(int i=0;i<m;i++){
//		cout<<pq.top();
//		pq.pop();
//	}
}
	