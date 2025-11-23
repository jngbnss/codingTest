#include<bits/stdc++.h>
using namespace std;
int n,a,b,ret;
int A,B,C;
int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	cin>>a>>b;
	if(a>0){
		if(b>0) cout<<1;
		else cout<<4;
	}else{
		if(b>0) cout<<2;
		else cout<<3;
	}
}