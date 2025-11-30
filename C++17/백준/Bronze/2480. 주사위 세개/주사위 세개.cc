#include<bits/stdc++.h>
using namespace std;
int n,a,b,c,ret;

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	
	cin>>a>>b>>c;
	if(a==b&&b==c) ret = 10000+a*1000;
	else if( a==b){
		if(b!=c){
			ret= 1000+a*100;
		}
	}else if(a==c){
		if(b!=c){
			ret= 1000+a*100;
		}
	}else if(b==c){
		if(a!=b){
			ret= 1000+b*100;
		}
	}else if(a!=b&&b!=c){
			int mx = max(a,b);
			mx = max(mx,c);
			ret = mx*100;
		}
	cout<<ret;
}