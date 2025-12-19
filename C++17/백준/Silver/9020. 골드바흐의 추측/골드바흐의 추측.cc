#include<bits/stdc++.h>
using namespace std;
const int max_n = 10004;
bool arr[max_n+1];
int t,n,a,b;

void go(){
	arr[0]=arr[1]=1;
	for(int i=2;i*i<=max_n;i++){
		if(arr[i] ==0){
			for(int j=i*i;j<=max_n;j+=i){
				arr[j] = 1;
			}
		}
	}
}

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	cin>>t;
	go();
	while(t--){
		cin>>n;
		vector<pair<int,int>>v;
		for(int i=2;i<=n/2;i++){
			if(arr[i]==0&&arr[n-i]==0) a=i,b=n-i;	
		}
		cout<<a<<' '<<b<<'\n';
	}
}
	