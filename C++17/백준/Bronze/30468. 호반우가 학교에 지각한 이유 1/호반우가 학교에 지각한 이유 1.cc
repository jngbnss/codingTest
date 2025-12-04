#include<bits/stdc++.h>
using namespace std;
int n,ret,x;
string s;

int main(){
	for(int i=0;i<4;i++){
		cin>>n;
		ret+=n;
	}
	cin>>x;
	x *=4;
	if(x-ret>0) cout<<x-ret;
	else cout<<0;
}