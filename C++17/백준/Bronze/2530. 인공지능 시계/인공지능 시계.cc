#include<bits/stdc++.h>
using namespace std;
int n,m,ret,h,s,d;

int main(){
	cin>>h>>m>>s;
	cin>>ret;
	ret+= 3600*h+60*m+s;
	if(ret/3600>=24){
		cout<<ret/3600%24<<' ';
	}else cout<<ret/3600<<' ';
	ret%=3600;
	cout<<ret/60<<' ';
	ret%=60;
	cout<<ret;
	
}