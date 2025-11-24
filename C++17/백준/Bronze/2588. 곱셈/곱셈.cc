#include<bits/stdc++.h>
using namespace std;
int n,ret,a,b,idx,mn=1e9,mx=-1e9,temp,cnt;
string s;

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	cin>>a>>b;
	int i,j,k;
	i = b%10;
	j = (b%100)/10;
	k = b/100;
	cout<<a*i<<'\n'<<a*j<<'\n'<<a*k<<'\n'<<a*b;
}