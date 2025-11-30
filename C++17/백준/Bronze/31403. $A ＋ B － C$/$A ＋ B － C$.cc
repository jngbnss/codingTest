#include<bits/stdc++.h>
using namespace std;
long long n,a,b,c,sum,mn=1e9,ret=0;
vector<int>v;

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	cin>>a>>b>>c;
	int n = a;
	int cnt =0;
	
	cout<<a+b-c<<'\n';
	string x,y,z;
	x = to_string(a);
	y = to_string(b);
	z= to_string(c);
	string s = x+y;
	cout<<stoi(s)-c;
	
	
}