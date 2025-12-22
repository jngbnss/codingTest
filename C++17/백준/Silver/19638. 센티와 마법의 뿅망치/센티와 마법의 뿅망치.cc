#include<bits/stdc++.h>
using namespace std;
int n,h,t,temp;
priority_queue<int>pq;

int main(){
	cin>>n>>h>>t;
	
	for(int i=0;i<n;i++){
		cin>>temp;
		pq.push(temp);
	}
	int cnt =0;
	for(int i=1;i<=t;i++){
		if(h>pq.top()){
			break;
		}
		int mx = pq.top();
		pq.pop();
		if(mx==1) mx =1;
		else mx/=2;
		pq.push(mx);
		cnt++;
	}
	if(h<=pq.top()){
		cout<<"NO\n"<<pq.top();
	}else{
		cout<<"YES\n"<<cnt;
	}
}