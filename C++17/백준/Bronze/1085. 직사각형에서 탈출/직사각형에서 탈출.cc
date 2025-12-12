#include<bits/stdc++.h>
using namespace std;
int n,x,y,w,h;
vector<long long>v;
string s;
int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
//	cin>>n;
	cin>>x>>y>>w>>h;
	int ret =  min(x-0,w-x);
	int ret1 = min(y-0,h-y);
	cout<<min(ret,ret1);
	
}
	

