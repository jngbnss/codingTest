#include<bits/stdc++.h>
using namespace std;
priority_queue<int>pq;
int n,a;

int main(){
//	ios_base::sync_with_stido(false);
	ios_base::sync_with_stdio(0);
	cin.tie(0);cout.tie(0);
	
	cin>>n;
	for(int i=0;i<n;i++){
		cin>>a;
		if(a==0){
			if(pq.empty()) cout<<-1<<'\n';
			else{
				cout<<pq.top()<<'\n';
				pq.pop();
			}
		}
		for(int i=0;i<a;i++){
			int temp;
			cin>>temp;
			pq.push(temp);
		}
	}
}
