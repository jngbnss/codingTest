#include<bits/stdc++.h>
using namespace std;
int n;

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	
//	n=5;
	cin>>n;
	for(int i=0;i<=n;i++){
		
		for(int j=n-i-1;j>=0;j--){	
			cout<<'*';
		}
		if(i!=n)cout<<'\n';		
	}
}