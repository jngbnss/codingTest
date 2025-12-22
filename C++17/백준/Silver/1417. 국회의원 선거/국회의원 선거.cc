#include<bits/stdc++.h>
using namespace std;
int n,cnt,temp,a;
int main(){
	cin>>n;
	priority_queue<int>pq;
	
	for(int i=0;i<n-1;i++){
		pq.push(0);
	}
	
	for(int i=0;i<n;i++){
		cin>>temp;
		if(i==0) a=temp;
		else{
			pq.push(temp);
		}
	}
	if(n==1){
		cout<<0;
		return 0;
	}
	
	while(true){
		if(a>pq.top())break;
		int mx = pq.top();
		a++;
		mx--;
		cnt++;
		pq.pop();
		pq.push(mx);
	}
	cout<<cnt;
}