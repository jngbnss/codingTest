#include<bits/stdc++.h>
using namespace std;
long long n,k,ret,cnt,a,b,temp,sum,w;

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	cin>>n;
	if(n==1){
		cout<<1;
		return 0;
	}
	for(long long i=0;i<=n;i++){
		ret+=i;
		if(ret==n){ cout<<i; return 0;}
		if(ret>=n){
			cout<<i-1;
			return 0;
		}
	}
}
	