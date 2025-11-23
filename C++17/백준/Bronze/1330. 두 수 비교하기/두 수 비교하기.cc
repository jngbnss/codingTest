#include<bits/stdc++.h>
using namespace std;
int n,a,b,ret;

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	
	cin>>a>>b;
	
	if(a<b) cout<<"<";
	else if(a>b) cout<<">";
	else cout<<"==";
}