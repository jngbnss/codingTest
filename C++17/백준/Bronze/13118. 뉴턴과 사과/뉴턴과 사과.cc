#include<bits/stdc++.h>
using namespace std;
int a,b,c,d,y,x,r;

int main(){
	cin>>a>>b>>c>>d;
	cin>>y>>x>>r;
	
	if(a==y) cout<<1;
	else if(b==y) cout<<2;
	else if(c==y) cout<<3;
	else if(d==y) cout<<4;
	else cout<<0;
}