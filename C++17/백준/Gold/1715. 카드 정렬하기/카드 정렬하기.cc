#include<bits/stdc++.h>
using namespace std;
int n,temp,cnt;
priority_queue<int,vector<int>,greater<int>>pq;

int main(){
	cin>>n;
	for(int i=0;i<n;i++){
		cin>>temp;
		pq.push(temp);
	}
	
	while(pq.size()!=1){
		int a= pq.top();
		pq.pop();
		int b= pq.top();
		pq.pop();
		int ret = a+b;
		cnt+=ret;
//		cout<<ret<<' '<<cnt<<'\n';
		pq.push(ret);
	}
//	cnt+=pq.top();
	cout<<cnt;
}