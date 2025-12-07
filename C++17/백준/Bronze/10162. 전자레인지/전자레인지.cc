#include<bits/stdc++.h>
using namespace std;
long long n,k,ret,cnt,a,b,temp,sum,w;
int arr[]={300,60,10};

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	cin>>n;
	if(n%10!=0){
		cout<<-1;
		return 0;
	}
	for(auto i:arr){
		cout<<n/i<<' ';
		n%=i;
	}
	
	
}
	